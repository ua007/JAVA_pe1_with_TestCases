package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    //object reference created
    Sorting ob;
    @org.junit.Before
    public void setUp() throws Exception {
        ob=new Sorting();
    }

    //object reference is nullified
    @org.junit.After
    public void tearDown() throws Exception {
        ob=null;
    }

    //success test cases
    @Test
    public void numsort()
    {
        String result=ob.numberSort(12345678);
        assertEquals("true",result);
    }
    @Test
    public void numsorttwo()
    {
        String result=ob.numberSort(1234567892);
        assertEquals("true",result);
    }
    //failure test cases
    @Test
    public void numsortthree()
    {
        String result=ob.numberSort(1234);
        assertEquals("false",result);
    }
}
