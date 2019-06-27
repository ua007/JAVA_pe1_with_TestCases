package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class VowelConsonantCheckerTest {
    @Test
    public void givenStringShoulhReturnVowelOrConsonant(){
        VowelConsonantChecker str=new VowelConsonantChecker();
        String result;
        result=str.vowelConsonantCheck("abab");
        assertEquals("Vowel Consonant Vowel Consonant ",result);
    }

}