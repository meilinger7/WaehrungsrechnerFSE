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


        System.out.println(eur2yen.umrechnen("USD", 10.0));
        System.out.println(eur2usd.umrechnen("YEN", 10.0));
        System.out.println(eur2ats.umrechnen("ATS", 10.0));


    }
}
