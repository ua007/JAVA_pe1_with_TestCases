package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class string_patternTest {
    //test case for string stackroute and integer 2
    @Test
    public void givenStringShouldReturnStringPattern(){
        string_pattern str=new string_pattern();
        String result;
        result=str.repeatString("stackroute",2);
        assertEquals("stackroutetete",result);
    }

}
