package org.example.adapter;

import org.example.ISammelumrechnung;
import org.example.WR;
import org.example.chain.EUR2ATS;
import org.example.chain.EUR2USD;
import org.example.chain.EUR2YEN;

public class WRAdapter implements ISammelumrechnung {
    double dSum;

    @Override
    public double sammelumrechnen(double[] betraege, String variante) {

        WR eur2yen = new EUR2YEN();
        WR eur2usd = new EUR2USD();
        WR eur2ats = new EUR2ATS();

        eur2yen.setNext(eur2usd);
        eur2usd.setNext(eur2ats);
        eur2ats.setNext(eur2yen);

        for (double betrag : betraege){
            dSum += betrag;
        }

        return eur2yen.umrechnen(variante, dSum);
    }
}
