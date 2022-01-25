package org.example.chain;

import org.example.WR;

public class EUR2YEN extends WR {
    @Override
    public double rechnen(double betrag) {
        System.out.println(betrag);
        return betrag * 129;
    }

    @Override
    public boolean check(String variante) {
        return variante.equals("YEN");
    }

}

