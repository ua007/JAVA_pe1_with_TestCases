package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class VowelConsonantCheckerTest {
    //test case for lowercase character
    @Test
    public void givenStringShoulhReturnVowelOrConsonant(){
        VowelConsonantChecker str=new VowelConsonantChecker();
        String result;
        result=str.vowelConsonantCheck("abab");
        assertEquals("Vowel Consonant Vowel Consonant ",result);
    }
    //test case for uppercase character
    @Test
    public void givenStringUpperCaseShoulhReturnVowelOrConsonant(){
        VowelConsonantChecker str=new VowelConsonantChecker();
        String result;
        result=str.vowelConsonantCheck("ABAB");
        assertEquals("Vowel Consonant Vowel Consonant ",result);
    }

}
