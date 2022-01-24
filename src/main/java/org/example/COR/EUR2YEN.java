package org.example.COR;

import org.example.WR;

public class EUR2YEN extends WR {
    @Override
    public double umrechnen(String variante, double betrag) {
        if (variante == "YEN"){
            return betrag * 129;
        }
        else {
            this.next = new EUR2USD();
            return next.umrechnen(variante, betrag);
        }
    }
}
