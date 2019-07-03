package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterIdentifyingTest {
    CharacterIdentifying ch;
    @Before
    public void setUp() throws Exception
    {
        ch=new CharacterIdentifying();
    }

    @After
    public void tearDown() throws Exception {
        ch=null;
    }
    //test case for capital letter
    @Test
    public void givenCharacterIsUpperCaseShouldReturnMessage(){

        String result;
        result=ch.characterChecker('A');
        assertEquals("Capital Letter",result);
    }
    //test case for small character
    @Test
    public void givenCharacterIsLowerCaseShouldReturnMessage(){
        
        String result;
        result=ch.characterChecker('a');
        assertEquals("Lower case",result);
    }
    //test case for special cases
    @Test
    public void givenCharacterIsSpacialShouldReturnMessage(){
        
        String result;
        result=ch.characterChecker('@');
        assertEquals("Special Character",result);
    }

}
