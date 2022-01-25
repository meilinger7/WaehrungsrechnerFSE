package org.example.decorator;

import org.example.IUmrechnen;
import org.example.WR;

public class WRDecorator implements IUmrechnen {

    public WR decoratetWr;

    public WRDecorator(WR decoratetWr) {
        this.decoratetWr = decoratetWr;
    }

    public double umrechnen(String variante, double betrag) {
        return decoratetWr.umrechnen(variante, betrag);
    }

}
