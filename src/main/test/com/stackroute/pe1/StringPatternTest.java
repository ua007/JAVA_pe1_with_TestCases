package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

<<<<<<< HEAD:src/main/test/com/stackroute/pe1/StringPatternTest.java
public class StringPatternTest {
=======
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
>>>>>>> 0c8553146a8ad20238f2d8cce6dd1d6549058338:src/main/test/com/stackroute/pe1/string_patternTest.java
    @Test
    public void givenStringShouldReturnStringPattern(){
        StringPattern str=new StringPattern();
        String result;
        result=str.repeatString("stackroute",2);
        assertEquals("stackroutetete",result);
    }

}
