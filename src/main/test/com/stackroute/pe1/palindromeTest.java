package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class palindromeTest {
    @Test
    public void givenIntegerIsPalindromeSumGreaterThanShouldReturnMessage(){
        //
        palindrome ab=new palindrome();
        //act
        String result;
        result=ab.palindromeChecker(2468642);
        //assert
        assertEquals("is palindrome and the sum of even numbers is greater than 25",result);
    }
    @Test
    public void givenIntegerIsPalindromeSumLessThanShouldReturnMessage(){
        palindrome ab=new palindrome();
        //act
        String result;
        result=ab.palindromeChecker(1221);
        //assert
        assertEquals("is palindrome and the sum of even numbers is less than 25",result);
    }
    @Test
    public void givenIntegerIsNotPalindromeShouldReturnMessage(){
        palindrome ab=new palindrome();
        //act
        String result;
        result=ab.palindromeChecker(1234);
        //assert
        assertEquals("is not a palindrome number.",result);
    }

}