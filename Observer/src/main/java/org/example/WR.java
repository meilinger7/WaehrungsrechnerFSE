package org.example;


import java.text.SimpleDateFormat;
import java.util.*;


public abstract class WR extends Observable implements IUmrechnen {
    
    protected WR next;
    Map<String, String> log = new HashMap<String, String>();

    public void setNext(WR next) {
        this.next = next;
    }

    public double umrechnen(String variante, double betrag) {
        if (next != null) {
            log.put("ausgangsbetrag", Double.toString(betrag));
            log.put("variante", variante);
            log.put("time", new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()));

            if (this.next.check(variante)) {

                log.put("calculated" , Double.toString(this.next.rechnen(betrag)));

                this.setChanged();
                this.notifyObservers(log);

                return this.next.rechnen(betrag);
            }
            return next.umrechnen(variante, betrag);
        }
        return -1;
    }

    public abstract double rechnen(double betrag);

    public abstract boolean check(String variante);

}
