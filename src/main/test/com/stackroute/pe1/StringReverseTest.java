package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

<<<<<<< HEAD:src/main/test/com/stackroute/pe1/StringReverseTest.java
public class StringReverseTest {
=======
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
>>>>>>> 0c8553146a8ad20238f2d8cce6dd1d6549058338:src/main/test/com/stackroute/pe1/string_reverseTest.java
    @Test
    public void giverStringShouldReturnReverse(){
        StringReverse str=new StringReverse();
        String result;
        result=str.stringReverse("abcd");
        assertEquals("dcba",result);
    }
}
