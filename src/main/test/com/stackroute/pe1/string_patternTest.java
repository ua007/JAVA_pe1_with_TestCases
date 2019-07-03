package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class string_patternTest {
    
    string_pattern str;

    @Before
    public void setUp() throws Exception
    {
        str=new string_pattern();
    }

    @After
    public void tearDown() throws Exception {
        str=null;
    }
    //test case for string stackroute and integer 2
    @Test
    public void givenStringShouldReturnStringPattern(){
        string_pattern str=new string_pattern();
        String result;
        result=str.repeatString("stackroute",2);
        assertEquals("stackroutetete",result);
    }

}
