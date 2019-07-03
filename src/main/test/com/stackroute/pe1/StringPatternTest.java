package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringPatternTest {
    @Test
    public void givenStringShouldReturnStringPattern(){
        StringPattern str=new StringPattern();
        String result;
        result=str.repeatString("stackroute",2);
        assertEquals("stackroutetete",result);
    }

}