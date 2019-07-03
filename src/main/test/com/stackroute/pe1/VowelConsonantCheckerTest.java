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
<<<<<<< HEAD
    public void givenStringLowerCaseShouldReturnVowelOrConsonant(){
        VowelConsonantChecker str=new VowelConsonantChecker();
=======
    public void givenStringShoulhReturnVowelOrConsonant(){
         
>>>>>>> 0c8553146a8ad20238f2d8cce6dd1d6549058338
        String result;
        result=str.vowelConsonantCheck("abab");
        assertEquals("Vowel Consonant Vowel Consonant ",result);
    }
<<<<<<< HEAD
    @Test
    public void givenStringUpperCaseShoulhReturnVowelOrConsonant(){
        VowelConsonantChecker str=new VowelConsonantChecker();
=======
    //test case for uppercase character
    @Test
    public void givenStringUpperCaseShoulhReturnVowelOrConsonant(){
        
>>>>>>> 0c8553146a8ad20238f2d8cce6dd1d6549058338
        String result;
        result=str.vowelConsonantCheck("ABAB");
        assertEquals("Vowel Consonant Vowel Consonant ",result);
    }

}
