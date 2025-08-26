package org.example.codeWars;

import java.util.LinkedList;

public class JadenCase {

        public String toJadenCase(String phrase) {
            if(phrase == null || phrase.isEmpty()){
                return null;
            }

            //Gets the indexes where it should be capatilized
            LinkedList<Integer> indxesForCapaltiziation= indexesToBeCapatlized(phrase);

            //Capatilize the Parts of the String
            String jadensSentence = capitalizeCharacters(phrase,indxesForCapaltiziation);

            return jadensSentence;
        }

        private static LinkedList<Integer> indexesToBeCapatlized(String phrase){
            LinkedList<Integer> indexes = new LinkedList<Integer>();

            //First Caracter should be capatalized
            indexes.add(0);

            //Serches for a space and adds the caracter after the space to the List
            for(int i = 0; i < phrase.length(); ++i){
                if(phrase.charAt(i) == ' ' && i + 1 < phrase.length()){
                    indexes.add(i+1);
                }
            }
            return indexes;
        }

        private static String capitalizeCharacters(String phrase, LinkedList<Integer> indexes){
            StringBuilder capitalizedString = new StringBuilder(phrase);
            for(int i : indexes){
                capitalizedString.setCharAt(i, phrase.toUpperCase().charAt(i));
            }
            return capitalizedString.toString();
        }
}
