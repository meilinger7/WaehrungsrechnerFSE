package org.example.chain;

import org.example.WR;

public class EUR2ATS extends WR {

    @Override
    public double rechnen(double betrag) {
        return betrag * 14;
    }

    @Override
    public boolean check(String variante) {
        return variante.equals("ATS");
    }
}
