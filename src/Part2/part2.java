package Part2;

import java.util.Scanner;

public class part2 {
    //create a new scanner
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        //option for user to quit
        System.out.println("Type 'q' anytime to quit (except age, height and weight questions)");

        while (true) {

            //ask user's name
            String name = getUserStringValue("What is your name?");
            if (name.equals("q")) {
                break;
            }

            //ask user's last name
            String lastname = getUserStringValue("What is your last name?");
            if (lastname.equals("q")) {
                break;
            }

            //ask user's nickname
            String nickname = getUserStringValue("What is your nickname?");
            if (nickname.equals("q")) {
                break;
            }

            //ask user's country
            String country = getUserStringValue("Where are you from?");
            if (country.equals("q")) {
                break;
            }

            //ask user's age
            int your_age = getUserIntegerValue("How old are you?");

            //ask user's weight
            double weight = getUserDoubleValue("How much do you weigh (kg) (use comma for fractions)");


            //ask user's height
            double height = getUserDoubleValue("How tall are (m) (use comma for fractions)");


            //ask user's hobby
            String hobby = getUserStringValue("What is your hobby?");
            if (hobby.equals("q")) {
                break;
            }

            //check if it's a real user or a robot
            char sign = '@';
            System.out.println(sign + nickname + " 3 + 3 = 8. True or False?");
            boolean answer = in.nextBoolean();

            if (answer) {
                System.out.println("You are a robot!!!");
                break;
            } else {
                System.out.println("You are a human");
                System.out.println("You're " + name + " " + lastname);
                System.out.println("Your nickname is " + nickname);
                System.out.println("You're from " + country);
                System.out.println("You're " + your_age + "y.o.");
                System.out.print("Your weight is " + weight);
                System.out.println(" kg and your height is " + height + " m");
                System.out.println("Your hobby is " + hobby);
                break;
                }

        }

    }

    public static int getUserIntegerValue(String caption){
        System.out.println(caption);
        int x = in.nextInt();
        in.nextLine();
        return x;
    }
    public static double getUserDoubleValue(String caption){
        System.out.println(caption);
        double x = in.nextDouble();
        in.nextLine();
        return x;
    }
    public static String getUserStringValue(String caption){
        System.out.println(caption);
        String x = in.nextLine();
        return x;
    }
}
