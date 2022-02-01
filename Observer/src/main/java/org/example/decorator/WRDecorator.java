package org.example.decorator;

import org.example.IUmrechnen;
import org.example.WR;

public class WRDecorator implements IUmrechnen {

    protected WR decoratedWr;

    public WRDecorator(WR decoratetWr) {
        this.decoratedWr = decoratetWr;
    }

    public double umrechnen(String variante, double betrag) {
        return decoratedWr.umrechnen(variante, betrag);
    }

}
