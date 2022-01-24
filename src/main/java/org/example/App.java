package org.example;

import org.example.COR.EUR2ATS;
import org.example.COR.EUR2USD;
import org.example.COR.EUR2YEN;

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
        System.out.println(eur2usd.umrechnen("ATS", 10.0));
        System.out.println(eur2ats.umrechnen("ATS", 10.0));


    }
}
