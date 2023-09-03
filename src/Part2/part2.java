package Part2;

import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        //option for user to quit
        System.out.println("Type 'q' anytime to quit (except age, height and weight questions)");

        while (true) {

            //ask user's name
            System.out.println("What is your name?");
            String name = in.nextLine();
            if (name.equals("q")) {
                break;
            }

            //ask user's last name
            System.out.println("What is your last name?");
            String lastname = in.nextLine();
            if (lastname.equals("q")) {
                break;
            }

            //ask user's nickname
            System.out.println("What is your nickname?");
            String nickname = in.nextLine();
            if (nickname.equals("q")) {
                break;
            }

            //ask user's country
            System.out.println("Where are you from?");
            String country = in.nextLine();
            if (country.equals("q")) {
                break;
            }

            //ask user's age
            System.out.println("How old are you?");
            int your_age = in.nextInt();
            in.nextLine();

            //ask user's weight
            System.out.println("How much do you weigh (kg) (use comma for fractions)");
            double weight = in.nextDouble();
            in.nextLine();

            //ask user's height
            System.out.println("How tall are (m) (use comma for fractions)");
            double height = in.nextDouble();
            in.nextLine();

            //ask user's hobby
            System.out.println("What is your hobby?");
            String hobby = in.nextLine();
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
}
