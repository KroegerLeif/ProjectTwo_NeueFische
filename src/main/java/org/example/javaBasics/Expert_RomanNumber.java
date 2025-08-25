package org.example.javaBasics;

public class Expert_RomanNumber
{
    public static void main(String[] args) {
        int arabicNumber = 75;
        String romanNumber = "";
        int[] highestAndLowerNumber = highestAndLowerNumber(arabicNumber);
        // System.out.println(highestAndLowerNumber[0]); -50
        romanNumber += convertToRomanNumber(highestAndLowerNumber[0]);
        //System.out.println(highestAndLowerNumber[1]); -10
        arabicNumber -= highestAndLowerNumber[0];

        int rest = getRestNummber(highestAndLowerNumber[1], arabicNumber);
        int wiederholungen = arabicNumber  / highestAndLowerNumber[1];
        if(wiederholungen <4){
            for(int i = 0 ; i < wiederholungen ; i++){
                romanNumber += convertToRomanNumber(highestAndLowerNumber[1]);
            }
        }else{
            System.out.println("sonderfall");
        }

        System.out.println(romanNumber);
        System.out.println(rest);


    }
    private static int[] highestAndLowerNumber(int x){
        int[] highstNAndLowerNumber = new int[2];
        if(x >= 100){
            highstNAndLowerNumber[0] =  100;
            highstNAndLowerNumber[1] =  50;
        }else if(x >= 50){
            highstNAndLowerNumber[0] =  50;
            highstNAndLowerNumber[1] =  10;
        }else if(x >= 10){
            highstNAndLowerNumber[0] =  10;
            highstNAndLowerNumber[1] =  5;
        }else if(x >= 5){
            highstNAndLowerNumber[0] =  5;
            highstNAndLowerNumber[1] =  1;
        }else{
            highstNAndLowerNumber[0] =  1;
            highstNAndLowerNumber[1] =  0;
        }
        return highstNAndLowerNumber;
    }


    private static int getRestNummber(int lowestNumber, int numberToBeConverted){
        return numberToBeConverted % lowestNumber;
    }

    private static String convertToRomanNumber(int number){
        switch (number){
            case 100: return "C";
            case 50: return "L";
            case 10: return "X";
            case 5: return "V";
            case 1: return "I";
            default: return "Error";
        }

    }
}
