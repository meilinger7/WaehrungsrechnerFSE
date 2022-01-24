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
        EUR2YEN eur2yen = new EUR2YEN();
        EUR2USD eur2usd = new EUR2USD();
        EUR2ATS eur2ats = new EUR2ATS();

        eur2yen.setNext(eur2usd);
        eur2usd.setNext(eur2ats);


        System.out.println(eur2yen.umrechnen("ATS", 10.0));

    }
}
