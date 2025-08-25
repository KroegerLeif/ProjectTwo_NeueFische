package org.example.javaBasics;

import java.util.LinkedHashMap;
import java.util.Map;

public class Expert_RomanNumber
{
    public static void main(String[] args) {
        int arabicNumber = 99;
        String romanNumber = convertToRoman(arabicNumber);

        System.out.println(romanNumber);


    }
    public static String convertToRoman(int number) {
        Map<Integer, String> romanMap = new LinkedHashMap<>();
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            while (number >= value) {
                result.append(symbol);
                number -= value;
            }
        }

        return result.toString();
    }
}
