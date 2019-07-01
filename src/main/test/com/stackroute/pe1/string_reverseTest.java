package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class string_reverseTest {
    //test case for string abcd
    @Test
    public void giverStringShouldReturnReverse(){
        string_reverse str=new string_reverse();
        String result;
        result=str.stringReverse("abcd");
        assertEquals("dcba",result);
    }
}
