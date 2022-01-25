package org.example;

import org.example.chain.EUR2ATS;
import org.example.chain.EUR2USD;
import org.example.chain.EUR2YEN;
import org.example.decorator.BetragDecorator;
import org.example.decorator.ProzentDecorator;
import org.example.decorator.WRDecorator;

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

        System.out.println(eur2yen.umrechnen("ATS", 10.0));
        System.out.println(eur2usd.umrechnen("YEN", 10.0));
        System.out.println(eur2ats.umrechnen("USD", 10.0));

        System.out.println("----------------");

        WRDecorator eur2yenBeitragDecorator = new BetragDecorator(eur2yen);
        System.out.println(eur2yenBeitragDecorator.umrechnen("YEN", 5));
        System.out.println(eur2yenBeitragDecorator.umrechnen("USD", 10));
        System.out.println(eur2yenBeitragDecorator.umrechnen("ATS", 100));

        WRDecorator eur2yenProzentDecorator = new ProzentDecorator(eur2yen);
        System.out.println(eur2yenProzentDecorator.umrechnen("YEN", 10));

    }
}
