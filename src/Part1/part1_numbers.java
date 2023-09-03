package Part1;
//Java program to demonstrate operations with Numbers

import java.util.Scanner;

public class part1_numbers {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        //input 2 numbers
        System.out.println("Input 2 numbers (use comma for fractions)");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        //print sum of numbers
        System.out.print(num1 + " + " + num2 + " = ");
        System.out.println(num1 + num2);

        //print difference of numbers
        System.out.print(num1 + " - " + num2 + " = ");
        System.out.println(num1 - num2);

        //print product of numbers
        System.out.print(num1 + " * " + num2 + " = ");
        System.out.println(num1 * num2);

        //print fraction of numbers
        System.out.print(num1 + " : " + num2 + " = ");
        System.out.println(num1 / num2);

    }
}
