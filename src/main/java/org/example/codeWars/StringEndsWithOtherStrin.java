package org.example.codeWars;

public class StringEndsWithOtherStrin {
    public class Kata {
        public static boolean solution(String str, String ending) {
            if(str.length() < ending.length() || str == ""){
                return false;
            }
            if(ending == ""){
                return true;
            }

            int comparisonLength = ending.length();

            for(int i = 0; i < comparisonLength; i++  ){
                if(str.charAt(str.length()-1 - i) != ending.charAt(ending.length()-1- i)){
                    return false;
                }
            }
            return true;

        }

    }
}
