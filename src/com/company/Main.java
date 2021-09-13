package com.company;

import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Opgave 3.4
        System.out.println("I want to play a game :D.");
        System.out.println("I'm thinking of a number beetween 1 and 100, can you guess it?");
        System.out.println("Choose your number beewtween 1 and 100");

        for (int i = 0; i < 10; i++) {

        Scanner scanner = new Scanner (System.in);
        int userNumber = scanner.nextInt();
        System.out.println("Your number is "+userNumber);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.print("The number i was thinking of was: ");
        System.out.println(number);

        int difference;
        difference=(userNumber-number);

        if (difference < 0) {difference = difference * -1;}
        if (difference == 0) {System.out.println("You were right!");}
        else {System.out.println("You were off by: "+difference);}}
    }
}
