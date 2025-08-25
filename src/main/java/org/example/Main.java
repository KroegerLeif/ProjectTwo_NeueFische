package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static boolean isPositive(int number){
        return number >= 0;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static String getFirstLetter(String text){
        if(text != null && text.length() > 0){
            return text.substring(0,1);
        }else{
            return null;
        }
    }

    public static int divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Dividing by zero is not allowed");
        }else{
            return a / b;
        }
    }

    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}