package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class string_patternTest {
    @Test
    public void givenStringShouldReturnStringPattern(){
        string_pattern str=new string_pattern();
        String result;
        result=str.repeatString("stackroute",2);
        assertEquals("stackroutetete",result);
    }

}