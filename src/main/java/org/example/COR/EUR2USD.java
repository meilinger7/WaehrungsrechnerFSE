package org.example.COR;

import org.example.WR;

public class EUR2USD extends WR {

    @Override
    public double umrechnen(String variante, double betrag) {
        if (variante == "USD"){
            return betrag * 1.13;
        }
        else {
            this.next = new EUR2ATS();
            return next.umrechnen(variante, betrag);
        }
    }
}
