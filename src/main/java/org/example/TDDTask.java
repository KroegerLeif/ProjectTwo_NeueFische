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

}
