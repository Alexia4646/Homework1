import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to my money converter!");
        System.out.println("Enter an amount in US dollars:");
        String input = sc.nextLine();
        double amount = Double.parseDouble(input); //sc.nextDouble();

        int cents = (int) Math.round(amount * 100);
        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickles = cents / 5;
        cents %= 5;

        int pennies = (int) cents;

        amount = amount * 4.59;

        System.out.println("Your inputted amount is RON" + amount );
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + nickles);
        System.out.println("Pennies:" + pennies);
        System.out.println("Thank you for using my money converter! I hope you have a nice day.");

    }
}
