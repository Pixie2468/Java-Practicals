import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in meters: ");
        double meters = input.nextDouble();
        input.close();
        final double FEET_PER_METER = 3.28084;
        double feet = meters * FEET_PER_METER;
        System.out.printf("%.2f meters is equal to %.2f feet.\n", meters, feet);
        input.close();
    }
}
