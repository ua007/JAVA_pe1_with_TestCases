package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class VowelConsonantCheckerTest {
    @Test
    public void givenStringLowerCaseShouldReturnVowelOrConsonant(){
        VowelConsonantChecker str=new VowelConsonantChecker();
        String result;
        result=str.vowelConsonantCheck("abab");
        assertEquals("Vowel Consonant Vowel Consonant ",result);
    }
    @Test
    public void givenStringUpperCaseShoulhReturnVowelOrConsonant(){
        VowelConsonantChecker str=new VowelConsonantChecker();
        String result;
        result=str.vowelConsonantCheck("ABAB");
        assertEquals("Vowel Consonant Vowel Consonant ",result);
    }

}