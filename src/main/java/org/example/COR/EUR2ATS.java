package org.example.COR;

import org.example.WR;

public class EUR2ATS extends WR {

    @Override
    public double umrechnen(String variante, double betrag) {
        if (variante == "ATS"){
            return betrag * 13.76;
        }
        else {
            this.next = new EUR2YEN();
            return next.umrechnen(variante, betrag);
        }
    }
}
