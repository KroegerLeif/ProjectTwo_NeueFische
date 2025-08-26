package org.example.codeWars;

public class GetTheMiddleCharacter {
    //If the string's length is odd, return the middle character.
    //If the string's length is even, return the middle 2 characters.
    public static String getMiddle(String word) {
        if(word.length() % 2 != 0){
            return word.charAt(word.length()/2)+"";
        }
        return word.substring(word.length()/2-1,word.length()/2+1);
    }
}
