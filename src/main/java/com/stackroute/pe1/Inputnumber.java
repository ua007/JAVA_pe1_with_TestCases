package com.stackroute.pe1;

public class Inputnumber
{



    public static String numberinputcheck(String listOfNum)

    {


        String[] listOfNum1 = listOfNum.split(" ");//string is split to string array
        int sumofnumbers = 0, k = 0;
        for (int i = 0; i < listOfNum1.length; i++) {    //conditions to check if the string has letter or special character
            if (Character.isLetter(listOfNum1[i].charAt(0))) {
                k=1;
                return("character found");

            } else if (Integer.parseInt(listOfNum1[i]) >= 0) {
                sumofnumbers = sumofnumbers + Integer.parseInt(listOfNum1[i]);

            } else {
                k = 1;
                return("special character");

            }
        }
        if (k == 0)
            return ("sum "+sumofnumbers);
        else
            return null;
    }
}
