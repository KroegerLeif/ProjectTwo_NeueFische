package org.example;

public class TDDTask {
    public static int sum(int number1,int number2){
        return number1+number2;
    }
    public static boolean isEven(int number){
        return number >= 0;
    }
    public static char getFirstCharacter(String text){
       return text.charAt(0);
    }
    public static String reverseString(String text){
        return new StringBuilder(text).reverse().toString();
    }
    public static boolean isPalindrome(String text){
        return text.toLowerCase().equals(reverseString(text).toLowerCase());
    }
    public static int countVowels(String text)
    {
        int count = 0;
        for(int i = 0; i < text.length(); i++)
        {
            switch(text.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }
    public static int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int n){
//        if(n <= 1){
//            return n;
//        }else{
//            return fibonacci(n-1) + fibonacci(n-2);
//        }
        int value1 = 0;
        int value2 = 1;
        int result = 0;
        for(int i = 1; i < n; i++){
            result = value1 + value2;
            value1 = value2;
            value2 = result;
        }
        return result;
    }

    public static int[] mergeArrays(int[] a, int[] b){
        //Length of merged array
        int[] mergedArray = new int[a.length + b.length];

        //First Array
        for(int i = 0; i < a.length; i++){
            mergedArray[i] = a[i];
        }

        //Second Array
        for(int i = 0; i < b.length; i++){
            mergedArray[a.length + i] = b[i];
        }

        return mergedArray;
    }
}
