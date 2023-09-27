import java.util.Scanner;

public class Unit1Project
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Program asks for user input
        System.out.print("Hello, I'm a tip calculator. How much is your total bill?");
        double total = scan.nextDouble();
        System.out.print("Thanks, and what is the tip percentage (whole #)? Truncate the percent sign.");
        double tipPercent = scan.nextDouble();
        System.out.print("Okay, now, how many people are in your party?");
        int people = scan.nextInt();

        // Variable calculations
        double tips = total*(tipPercent/100);
        double totalWithTip = total + tips;
        double tipsPerPerson = tips/people;
        double totalPerPerson = totalWithTip/people;

        // Print statements
        System.out.printf("Total Tips Due: $%.2f %n", tips);
        System.out.printf("Total Bill With Tip: $%.2f %n", totalWithTip);
        System.out.printf("Tips Due Per Person: $%.2f %n", tipsPerPerson);
        System.out.printf("Total $ Due Per Person: $%.2f %n", totalPerPerson);
        System.out.println("Evaluation Complete");
    }
}
