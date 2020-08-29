package com.example.premiumcalc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {



    private Results results;

    @Before
    public void setUP()  throws Exception {
        results = new Results();
    }
    @Test
    public void testmortalcost(){
        double res = results.mortalcost(1000000,18);
        assertEquals(2142.86,res,2);
    }



}