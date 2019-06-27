package com.stackroute.pe1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Guess a number from 1-100");
        int yourGuess = sc.nextInt();
        System.out.println(guessTheNumber(randomNumber,yourGuess));

    }

    public static String guessTheNumber(int randomNumber,int yourGuess) {

        do {

            if(yourGuess>randomNumber){
                return("Number guessed is more than original number");
            }

            else if(yourGuess<randomNumber){
                return("Number guessed is less than original number");
            }

            else {

                return("Number guessed matches the original number");

            }


        }while(false);

    }
}