package org.example.decorator;

import org.example.WR;

public class BetragDecorator extends WRDecorator{

    public BetragDecorator(WR decoratetWr) {

        super(decoratetWr);
    }

    @Override
    public double umrechnen(String variante, double betrag) {

        return decoratedWr.umrechnen(variante,betrag + 5);
    }
}
