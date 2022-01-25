package org.example.chain;

import org.example.WR;

public class EUR2USD extends WR {

    @Override
    public double rechnen(double betrag) {
        return betrag * 1.2;
    }

    @Override
    public boolean check(String variante) {
        return variante.equals("USD");
    }
}
