package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void givenIntegerIsPalindromeSumGreaterThanShouldReturnMessage(){
        //
        Palindrome ab=new Palindrome();
        //act
        String result;
        result=ab.palindromeChecker(2468642);
        //assert
        assertEquals("is Palindrome and the sum of even numbers is greater than 25",result);
    }
    @Test
    public void givenIntegerIsPalindromeSumLessThanShouldReturnMessage(){
        Palindrome ab=new Palindrome();
        //act
        String result;
        result=ab.palindromeChecker(1221);
        //assert
        assertEquals("is Palindrome and the sum of even numbers is less than 25",result);
    }
    @Test
    public void givenIntegerIsNotPalindromeShouldReturnMessage(){
        Palindrome ab=new Palindrome();
        //act
        String result;
        result=ab.palindromeChecker(1234);
        //assert
        assertEquals("is not a Palindrome number.",result);
    }

}