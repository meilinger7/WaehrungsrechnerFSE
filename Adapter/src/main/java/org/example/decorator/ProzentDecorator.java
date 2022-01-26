package org.example.decorator;

import org.example.WR;

public class ProzentDecorator extends WRDecorator{

    public ProzentDecorator(WR decoratetWr) {
        super(decoratetWr);
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        return decoratedWr.umrechnen(variante,betrag*1.05);
    }

}
