import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        input.close();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKg = weightInPounds * KILOGRAMS_PER_POUND;

        double heightInMeters = heightInInches * METERS_PER_INCH;

        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        input.close();
    }
}
