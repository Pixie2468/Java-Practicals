import java.util.Scanner;

public class Practical1 {
    public static void main(String[] args) {
        float a, b, c, d, e, f, p;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        a = sc.nextFloat();
        System.out.println("Enter the value of b: ");
        b = sc.nextFloat();
        System.out.println("Enter the value of c: ");
        c = sc.nextFloat();
        System.out.println("Enter the value of d: ");
        d = sc.nextFloat();
        System.out.println("Enter the value of e: ");
        e = sc.nextFloat();
        System.out.println("Enter the value of f: ");
        f = sc.nextFloat();

        System.out.println("Equation 1 is e = ax + by");
        System.out.println(+e + " = " + a + "x + " + b + "y");
        System.out.println("Equation 2 is f = cx + dy");

        System.out.println(+f + " = " + c + "x + " + d + "y");

        p = ((a * d) - (b * c));
        if (p != 0) {
            double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
            System.out.println("The value of x is: " + x);
            double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
            System.out.println("The value of y is: " + y);
        } else
            System.out.println("The equation has no solution");
        sc.close();
    }
}
