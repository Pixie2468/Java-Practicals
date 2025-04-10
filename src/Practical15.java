import java.util.*;

public class Practical15 {
    public static int gcd(int num1, int num2) {
        return (num2 == 0) ? num1 : gcd(num2, num1 % num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("GCD of " + num1 + " and " + num2 + ": " + gcd(num1, num2));
        sc.close();
    }
}
