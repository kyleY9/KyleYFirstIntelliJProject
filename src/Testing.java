import java.util.Scanner;
import java.text.DecimalFormat;

public class Testing {
    public static void main(String [] args) {

        // object creation
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // prints
        System.out.println("Gimme a decimal number: ");
        double deci = scan.nextDouble();
        System.out.println(df.format(deci) + " is your rounded decimal");
    }
}