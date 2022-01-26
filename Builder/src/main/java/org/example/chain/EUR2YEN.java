package org.example.chain;

import org.example.WR;

public class EUR2YEN extends WR {

    public double umrechnen() {
        if(this.next.check(this.variante)){
            return this.next.rechne(this.betrag);
        }
        else {
            this.next.setBetrag(this.betrag);
            this.next.setVariante(this.variante);
            return this.next.umrechnen();
        }
    }

    public double rechne(double betrag){
        return betrag*129;
    }

    public boolean check(String variante){
        return variante.equals("YEN");
    }
}

