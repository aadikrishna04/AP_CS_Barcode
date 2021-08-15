import java.util.*;

public class inefficientBarcode {
    public static void main(String[]args) {
        // Take barcode as input in string form
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your barcode number here >>> ");
        String barcode = console.nextLine();

        // Split barcode into each of its digits
        String x0 = barcode.substring(0, 1);
        String x1 = barcode.substring(1, 2);
        String x2 = barcode.substring(2, 3);
        String x3 = barcode.substring(3, 4);
        String x4 = barcode.substring(4, 5);
        String x5 = barcode.substring(5, 6);
        String x6 = barcode.substring(6, 7);
        String x7 = barcode.substring(7, 8);
        String x8 = barcode.substring(8, 9);
        String x9 = barcode.substring(9, 10);
        String x10 = barcode.substring(10, 11);
        String x11 = barcode.substring(11, 12);
        
        // Convert each digit from type string to type int
        int a = Integer.parseInt(x0);
        int b = Integer.parseInt(x1);
        int c = Integer.parseInt(x2);
        int d = Integer.parseInt(x3);
        int e = Integer.parseInt(x4);
        int f = Integer.parseInt(x5);
        int g = Integer.parseInt(x6);
        int h = Integer.parseInt(x7);
        int i = Integer.parseInt(x8);
        int j = Integer.parseInt(x9);
        int k = Integer.parseInt(x10);
        int l = Integer.parseInt(x11);

        // Add all even indexed digits except the last one
        int evens = b + d + f + h + j;
        // Add all odd indexed digits
        int odds = a + c + e + g + i + k;

        // Find units place digits
        int evensUnits = evens % 10;
        int oddsUnits = odds % 10;

        // Calculate
        int step1 = 3 * oddsUnits;
        int step2 = step1 + evensUnits;
        int step2Units = step2 % 10;
        int step3 = l + step2Units;

        if (step3 == 10) {
            System.out.println("Success!");
        }
        console.close();
    }
}