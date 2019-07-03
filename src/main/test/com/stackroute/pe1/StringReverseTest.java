package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringReverseTest {
    @Test
    public void giverStringShouldReturnReverse(){
        StringReverse str=new StringReverse();
        String result;
        result=str.stringReverse("abcd");
        assertEquals("dcba",result);
    }
}