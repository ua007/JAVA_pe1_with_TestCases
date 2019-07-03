//Identify if the character is uppercase, lowercase, special character

package com.stackroute.pe1;

import java.util.Scanner;
import java.lang.String;
public class CharacterIdentifying {
    //CharacterIdentifier main block
    public static void main(String[] args)
    {
        System.out.print("enter the character=");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        System.out.println(characterChecker(ch));
    }
    //ChacterChecker which returns message
    public static String characterChecker(char ch)
    {
        if(ch>='A' && ch<='Z')
            return("Capital Letter");
        else if(ch>='a' && ch<='z')
            return("Lower case");
        else
            return("Spacial character");
    }
}
