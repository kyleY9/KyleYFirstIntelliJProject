import java.util.Scanner;
import java.text.DecimalFormat;

public class Testing {
    public static void main(String [] args) {

        // object creation
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // prints
        System.out.print("GIVE MATHEMATICAL OPERATOR: ");
        String operator = scan.nextLine();
        System.out.print("GIVE ME A NUMBER NOW!: ");
        double deci1 = scan.nextDouble();
        System.out.print("ANOTHER ONE, NOW!: ");
        double deci2 = scan.nextDouble();

        // when testing a string for equality, do not use "==", use the function (x.equals(y))
        if (operator.equals("+")) {
            System.out.println(df.format(deci1 + deci2));
        } else if (operator.equals("-")) {
            System.out.println(df.format(deci1 - deci2));
        } else if (operator.equals("*")) {
            System.out.println(df.format(deci1 * deci2));
        } else if (operator.equals("/")) {
            System.out.println(df.format(deci1 / deci2));
        } else {
            System.out.println("Give me a valid operator >:<");
        }
    }
}