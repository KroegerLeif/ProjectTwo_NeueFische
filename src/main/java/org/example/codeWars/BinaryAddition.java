package org.example.codeWars;

public class BinaryAddition {
    public static String binaryAddition(int a, int b){
        //your code here
        int result = a + b;
        String binaryResult = convertToBinary(result);
        return binaryResult;
    }

    private static String convertToBinary(int number){
        int decimal = number;
        String binary = "";
        while(decimal > 0){
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        return binary;
    }
}
