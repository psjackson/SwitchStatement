package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create variables.
        int number;
        String numberString;
        Scanner scanner = new Scanner(System.in);

        //ask user for a number between 1 to 10.
        System.out.println("Enter a whole number between 1 and 10 (inclusive): ");
        number = scanner.nextInt();

        //switch statement to get the corresponding number in italian and assign to variable.
        switch (number){
            case 1: numberString = "uno";
                break;
            case 2: numberString = "due";
                break;
            case 3: numberString = "tre";
                break;
            case 4: numberString = "quattro";
                break;
            case 5: numberString = "cinque";
                break;
            case 6: numberString = "sei";
                break;
            case 7: numberString = "sette";
                break;
            case 8: numberString = "otto";
                break;
            case 9: numberString = "nove";
                break;
            case 10: numberString = "dieci";
                break;
            default: numberString = "invalid";
        }
        //if numberString was invalid show as error message else show the number they entered and its corresponding italian number.
        if (numberString.equals("invalid")) {
            System.out.println("That was not a number between 1 and 10 inclusive.");
        }
        else {
            System.out.println("The number " + number + " is " + numberString + " in Italian.");
        }
    }
}
