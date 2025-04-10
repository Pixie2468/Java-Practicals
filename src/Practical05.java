import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        b = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        c = sc.nextInt();

        if (a >= b && a > c)
            System.out.println(a + " is Greatest");

        else if (b > a && b > c)
            System.out.println(b + " is Greatest");

        else
            System.out.println(c + " is Greatest");
        sc.close();
    }
}
