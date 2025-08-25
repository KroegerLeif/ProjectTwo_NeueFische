package org.example.javaBasics;

import java.util.Scanner;

public class NoviceJB
{
    public static void main(String[] args) {
        //Teil 1
        String name = "Leif";
        System.out.println(name);

        //Teil 2
        for (int i = 0 ; i < 5 ; i++){
            System.out.println(name);
        }

        //Teil 3
        positivNummber(6);

        //Teil 4
        System.out.println(quadrat(5));

        //Teil 5
        greetUser(getUserName());
    }

    public static void positivNummber(int number){
        if(number > 0)
        {
            System.out.println("Die Zahl ist positiv");
        }else {
            System.out.println("Die Zahl ist negativ");
        }
    }

    public static int quadrat(int nummer){
        return nummer * nummer;
    }

    public static String getUserName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib deinen Namen ein: ");
        String name = scanner.nextLine();
        scanner.close();

        if(validateUserInput(name)){

            return name;
        }else{
            return "unkown";
        }
    }

    public static void greetUser(String name)
    {
        if(name.equals("unkown")){
            return;
        }
        System.out.println("Hallo " + name + "!");
    }

    private static boolean validateUserInput(String input)
    {
        if(input == null || input.isEmpty() || input.isBlank())
        {
            System.out.println("Ungültige Eingabe!");
            return false;
        }
        return true;
    }
}
