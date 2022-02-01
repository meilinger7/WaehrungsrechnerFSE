package org.example.adapter;

import org.example.ISammelumrechnung;
import org.example.WR;
import org.example.chain.EUR2ATS;
import org.example.chain.EUR2USD;
import org.example.chain.EUR2YEN;

public class WRAdapter implements ISammelumrechnung {
    private double dSum;
    private WR wr;

    public WRAdapter(WR wr){
        this.wr = wr;
    }


    @Override
    public double sammelumrechnen(double[] betraege, String variante) {
        for (double betrag : betraege){
            dSum += betrag;
        }
        return wr.umrechnen(variante, dSum);
    }
}
