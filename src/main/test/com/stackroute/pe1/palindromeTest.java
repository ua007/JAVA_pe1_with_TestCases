package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class palindromeTest {
    
    @Before
    public void setUp() throws Exception
    {
        ob=new palindrome();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    //test case for being a palindrome and sum of even digits is greater than 25
    @Test
    public void givenIntegerIsPalindromeSumGreaterThanShouldReturnMessage(){
        //
        
        //act
        String result;
        result=ab.palindromeChecker(2468642);
        //assert
        assertEquals("is palindrome and the sum of even numbers is greater than 25",result);
    }
    //test case for being a palindrome and sum of even digits is less than 25
    @Test
    public void givenIntegerIsPalindromeSumLessThanShouldReturnMessage(){
       
        //act
        String result;
        result=ab.palindromeChecker(1221);
        //assert
        assertEquals("is palindrome and the sum of even numbers is less than 25",result);
    }
    //test case for not being a palindrome 
    @Test
    public void givenIntegerIsNotPalindromeShouldReturnMessage(){
        
        //act
        String result;
        result=ab.palindromeChecker(1234);
        //assert
        assertEquals("is not a palindrome number.",result);
    }

}
