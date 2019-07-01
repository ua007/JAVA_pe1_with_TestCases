package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class palindromeTest {
    //test case for being a palindrome and sum of even digits is greater than 25
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
    //test case for being a palindrome and sum of even digits is less than 25
    @Test
    public void givenIntegerIsPalindromeSumLessThanShouldReturnMessage(){
        palindrome ab=new palindrome();
        //act
        String result;
        result=ab.palindromeChecker(1221);
        //assert
        assertEquals("is palindrome and the sum of even numbers is less than 25",result);
    }
    //test case for not being a palindrome 
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
