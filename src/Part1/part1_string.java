package Part1;
/*
Java program to demonstrate operations with Strings
Here I will show few methods and operations with Strings
 */

import java.util.Scanner;

public class part1_string {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        //Input country name
        System.out.println("Where do you live?");
        String country = in.nextLine();

        //Input city name
        System.out.println("Which city do you live in?");
        String city = in.nextLine();

        //Concatenation and Transforming method
        System.out.print("You are from " + city.toUpperCase());
        System.out.println(", " + country);

        //Boolean-Based String Check and Creating a new string methods
        if (country.equals("Ukraine")){
            System.out.println("I also live in Ukraine");
            System.out.println("We are both " + country.replace("e", "ians"));
        } else{
            System.out.println("I don't live in " + country);
            System.out.println("You aren't Ukrainian");
        }






    }
}
