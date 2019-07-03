package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class string_reverseTest {
    
    string_reverse str;

    @Before
    public void setUp() throws Exception
    {
        str=new string_reverse();
    }

    @After
    public void tearDown() throws Exception {
        str=null;
    }
    //test case for string abcd
    @Test
    public void giverStringShouldReturnReverse(){
        string_reverse str=new string_reverse();
        String result;
        result=str.stringReverse("abcd");
        assertEquals("dcba",result);
    }
}
