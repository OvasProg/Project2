package Part1;
//Java program to use variables of different types

import java.util.Scanner;

public class part1_variables {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        //ask user's nickname
        System.out.println("What is your nickname?");
        String name = in.nextLine();

        //ask user's country
        System.out.println("Where are you from?");
        String country = in.nextLine();

        //ask user's age
        System.out.println("How old are you?");
        int your_age = in.nextInt();
        in.nextLine();

        //ask user's weight
        System.out.println("How much do you weigh (use comma for fractions)");
        double weight = in.nextDouble();
        in.nextLine();

        //check if it's a real user or a robot
        char sign = '@';
        System.out.println(sign + name + " 3 + 3 = 8. True or False?");
        boolean answer = in.nextBoolean();

        if (answer){
            System.out.println("You are a robot!!!");
        } else {
            System.out.println("You are a human");
            System.out.println("Thank you for registration. Goodbye!");
        }


    }
}
