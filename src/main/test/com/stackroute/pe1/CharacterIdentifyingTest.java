package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterIdentifyingTest {
    @Test
    public void givenCharacterIsUpperCaseShouldReturnMessage(){
        CharacterIdentifying ch=new CharacterIdentifying();
        String result;
        result=ch.characterChecker('A');
        assertEquals("Capital Letter",result);
    }
    @Test
    public void givenCharacterIsLowerCaseShouldReturnMessage(){
        CharacterIdentifying ch=new CharacterIdentifying();
        String result;
        result=ch.characterChecker('a');
        assertEquals("Lower case",result);
    }
    @Test
    public void givenCharacterIsSpacialShouldReturnMessage(){
        CharacterIdentifying ch=new CharacterIdentifying();
        String result;
        result=ch.characterChecker('@');
        assertEquals("Special Character",result);
    }

}