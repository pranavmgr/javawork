import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter amount in USD: ");
                double usd = sc.nextDouble();

                double inr = usd * 87.0; // Example exchange rate
                System.out.println("INR = ₹" + inr);
                break;

            case 2:
                System.out.print("Enter amount in INR: ");
                double rupees = sc.nextDouble();

                double dollars = rupees / 87.0; // Example exchange rate
                System.out.println("USD = $" + dollars);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}