package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class VowelConsonantCheckerTest {
    VowelConsonantChecker str;
    @Before
    public void setUp() throws Exception
    {
        str=new VowelConsonantChecker();
    }

    @After
    public void tearDown() throws Exception {
        str=null;
    }
    //test case for lowercase character
    @Test
    public void givenStringShoulhReturnVowelOrConsonant(){
         
        String result;
        result=str.vowelConsonantCheck("abab");
        assertEquals("Vowel Consonant Vowel Consonant ",result);
    }
    //test case for uppercase character
    @Test
    public void givenStringUpperCaseShoulhReturnVowelOrConsonant(){
        
        String result;
        result=str.vowelConsonantCheck("ABAB");
        assertEquals("Vowel Consonant Vowel Consonant ",result);
    }

}
