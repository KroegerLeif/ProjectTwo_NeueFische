package org.example.javaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class ExpertJB
{
    public static void main(String[] args) {
        //Aufgabe 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir eine String ein: ");
        String input = scanner.nextLine();

        System.out.println(reverseString(input));

        //Aufgabe 2
        int[] numberArray ={6, 2, 8, 3, 9, 6};
        Arrays.sort(numberArray);
        for (int n : numberArray){
            System.out.println(n);
        }

        //Aufgabe 3

        //Aufgabe 4
        System.out.println(calculateQuersumme(123456789));
        System.out.println(calculateQuersumme(25));
        System.out.println(calculateQuersumme(1234));

    }
    private static String reverseString(String input){
        String output = "";
        for (char c : input.toCharArray()){
            output = c + output;
        }
        return output;
    }

    //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.
    private static int calculateQuersumme(int zahl){
        int quersumme = 0;
        String zahlText = "" + zahl;

        for (char c : zahlText.toCharArray()){
            quersumme += addValueBasedOnText(c);
        }
        return quersumme;
    }

    private static int addValueBasedOnText(char c){
        switch (c){
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return 0;
        }
    }

}
