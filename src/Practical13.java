import java.util.*;

public class Practical13 {
    public static void main(String[] args) {
        String frac = "";
        int intPart = 0;
        int fracPart = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal : ");
        String num = sc.nextLine();
        if (num.contains(".")) {
            String[] parts = num.split("\\.");
            intPart = Integer.parseInt(parts[0]);
            frac = parts[1];
            fracPart = Integer.parseInt(parts[1]);
        }
        int numerator = (intPart * (int) (Math.pow(10, frac.length()))) + fracPart;
        int denominator = (int) (Math.pow(10, frac.length()));
        System.out.println("The fractional part is : " + numerator + "/" + denominator);
        sc.close();
    }
}
