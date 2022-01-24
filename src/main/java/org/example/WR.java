package org.example;

public abstract class WR implements IUmrechnen{

    protected WR next;

    public void setNext(WR next) {
        this.next = next;
    }

    public final double umrechnen(String variante, double betrag){
        if(this.next.check(variante)){
            return this.next.rechnen(betrag);
        }
        return next.umrechnen(variante, betrag);
    }

    public abstract double rechnen(double betrag);
    public abstract boolean check(String variante);

}
