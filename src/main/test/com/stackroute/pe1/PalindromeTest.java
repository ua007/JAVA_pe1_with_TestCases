package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

<<<<<<< HEAD:src/main/test/com/stackroute/pe1/PalindromeTest.java
public class PalindromeTest {
    @Test
    public void givenIntegerIsPalindromeSumGreaterThanShouldReturnMessage(){
        //
        Palindrome ab=new Palindrome();
=======
public class palindromeTest {
    palindrome ab;
    @Before
    public void setUp() throws Exception
    {
        ab=new palindrome();
    }

    @After
    public void tearDown() throws Exception {
        ab=null;
    }
    //test case for being a palindrome and sum of even digits is greater than 25
    @Test
    public void givenIntegerIsPalindromeSumGreaterThanShouldReturnMessage(){
        //
        
>>>>>>> 0c8553146a8ad20238f2d8cce6dd1d6549058338:src/main/test/com/stackroute/pe1/palindromeTest.java
        //act
        String result;
        result=ab.palindromeChecker(2468642);
        //assert
        assertEquals("is Palindrome and the sum of even numbers is greater than 25",result);
    }
    //test case for being a palindrome and sum of even digits is less than 25
    @Test
    public void givenIntegerIsPalindromeSumLessThanShouldReturnMessage(){
<<<<<<< HEAD:src/main/test/com/stackroute/pe1/PalindromeTest.java
        Palindrome ab=new Palindrome();
=======
       
>>>>>>> 0c8553146a8ad20238f2d8cce6dd1d6549058338:src/main/test/com/stackroute/pe1/palindromeTest.java
        //act
        String result;
        result=ab.palindromeChecker(1221);
        //assert
        assertEquals("is Palindrome and the sum of even numbers is less than 25",result);
    }
    //test case for not being a palindrome 
    @Test
    public void givenIntegerIsNotPalindromeShouldReturnMessage(){
<<<<<<< HEAD:src/main/test/com/stackroute/pe1/PalindromeTest.java
        Palindrome ab=new Palindrome();
=======
        
>>>>>>> 0c8553146a8ad20238f2d8cce6dd1d6549058338:src/main/test/com/stackroute/pe1/palindromeTest.java
        //act
        String result;
        result=ab.palindromeChecker(1234);
        //assert
        assertEquals("is not a Palindrome number.",result);
    }

}
