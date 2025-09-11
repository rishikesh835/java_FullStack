package com.telusko.learning;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    Calc c = new Calc();
    @Test
    public void Test(){
//        assertEquals(expected,generated);
        assertEquals(5,c.divide(10,2));

    }
  
}