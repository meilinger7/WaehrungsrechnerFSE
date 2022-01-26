package org.example;

import org.example.chain.EUR2ATS;
import org.example.chain.EUR2USD;
import org.example.chain.EUR2YEN;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WR eur2yen = new EUR2YEN();
        WR eur2usd = new EUR2USD();
        WR eur2ats = new EUR2ATS();

        eur2yen.setNext(eur2usd);
        eur2usd.setNext(eur2ats);
        eur2ats.setNext(eur2yen);

        WR wr = new WR.Builder().withNext(eur2ats).withBetrag(10).withVariante("ATS").build();


        System.out.println(wr.umrechnen());



    }
}
