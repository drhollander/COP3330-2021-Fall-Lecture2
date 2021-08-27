package examples.lecture2;

import java.util.Scanner;

public class Greeter {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.println("Hello, " + name);
    }
}
