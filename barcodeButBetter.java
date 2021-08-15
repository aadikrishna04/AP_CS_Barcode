import java.util.*;

public class Barcode {
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        // run 'barcode' method
        barcode();
    }

    public static void barcode(){
        // Take barcode as input
        System.out.print("Enter barcode number >>> ");
        String barcode = console.nextLine();

        // Create array for barcode digits
        String[] digits = new String[12];

        // Fill int array with values from string ara
        int i = 0;
        int z = 1;

        while (i < barcode.length()) {
            while (z < barcode.length() + 1) {
                digits[i] = barcode.substring(i, z);
                z++;
                i++;
            }
            
        }
        // Convert string array into int array
        int [] array = new int[digits.length];
        for (int j = 0; j < digits.length; j++) {
            array[j] = Integer.parseInt(digits[j]);
        }

        operate(array);
        console.close();
    }

    // Find the sum of the even and odd indexed numbers
    public static void operate(int array[]) {
        int evenSum = 0;
        int oddSum = 0;

        // Add the numbers in the odd places
        for (int s = 0; s <= array.length-1; s+=2) {
                oddSum += array[s];
        }

        // Add the numbers in the even places
        for (int h = 1; h < array.length-1; h+=2) { 
                evenSum += array[h];
        }

        // Run 'calculate' method
        calculate(evenSum, oddSum);
    }

    // Check whether the final number is equivalent to the last number of the barcode
    public static void calculate(int evenSum, int oddSum) {
        int oddUnits = oddSum % 10;
        int evenUnits = evenSum % 10;

        // Multiply odd unit by 3
        int step1 = oddUnits * 3;

        // Add 'step1' to the units digit of 'evenUnits'
        int step2 = step1 + evenUnits;

        // Calculate the units place digit of 'step2'
        int step2units = step2 % 10;

        // Add 'step2units' to the last digit of the barcode
        int step3 = 10 - step2units;

        System.out.print("Enter code again >>> ");
        String code = console.nextLine();
        // Check the last number
        if (step3 == Integer.parseInt(code.substring(code.length()-1, code.length()))) {
            System.out.println("Success!");
        } else {
            System.out.println("Not Success!");
        }
    }
}
