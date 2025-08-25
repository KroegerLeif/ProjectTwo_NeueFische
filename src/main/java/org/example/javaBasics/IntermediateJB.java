package org.example.javaBasics;

import java.util.Scanner;

public class IntermediateJB {
    public static void main(String[] args) {
        //Aufgabe 1
        String[] zahlenBisZehn = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun","Zehn"};

        //Aufgabe2
        System.out.println(nummberToText(5, zahlenBisZehn));
        System.out.println(nummberToText(9, zahlenBisZehn));
        System.out.println(nummberToText(10, zahlenBisZehn));

        //Aufgabe 3
        zahlenEinsBisHundert();

        //Aufgabe 4
        String newInput = "";
        String[] userInputArray = new String[0];
        boolean continueProgramm = true;
         do{
            newInput = getUserImput();
            if(newInput.equals("exit")){
                continueProgramm = false;
            }else{
                userInputArray = appendToArray(userInputArray, newInput);
            }
        }while (continueProgramm);

        System.out.println("Gesamter Array: ");
        for(String text : userInputArray){
            System.out.println(text);
        }
    }

    private static String nummberToText(int zahl, String[] zahlenBisZehn)
    {
        if(zahl < 10 && zahl >= 0){
            return zahlenBisZehn[zahl-1];
        }else {
            return "Ungültige Zahl";
        }
    }

//    Schreibe ein Programm das die Zahlen 1-100 ausgibt, aber:
//    Vor Zahlen die durch 3 teilbar sind (modulo) soll ein # stehen
//    Vor Zahlen die durch 5 teilbar sind soll ein $ stehen
    public static void zahlenEinsBisHundert()
    {
        String outptut = "";
        for (int i = 1; i <= 100; i++) {
            outptut = "" + i;
            if(i % 3 == 0){
                outptut = "#" + outptut;
            }
            if(i % 5 == 0){
                outptut = "$" + outptut;
            }
            System.out.println(outptut);
        }
    }

//    Schreibe ein Programm die Wörter vom Benutzer einliest (Scanner) und diese in einem Array speichert.
//    Gib vor jeder Eingabe jeweils die eingegebenen Wörter noch mal aus.

    public static String getUserImput()
    {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Gebe ein Wort ein: ");
        String userInput = userScanner.nextLine();
        System.out.println("Deine Eingabe: " + userInput);

        return userInput;
    }
    public static String[] appendToArray(String[] oldArry, String newValue)
    {
        if(oldArry.length == 0){
            String[] newArray = new String[1];
            newArray[0] = newValue;
            return newArray;
        }
        String newArray[] = new String[oldArry.length + 1];
        for(int i = 0; i < oldArry.length; i++)
        {
            newArray[i] = oldArry[i];
        }
        newArray[newArray.length- 1] = newValue;

        return newArray;

    }

}

