import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        int num, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();

        for (int i = 2; i < (num / 2); i++) {
            if (num % i == 0) {
                System.out.println("Entered Number " + num + " is Not Prime");
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Entered Number " + num + " is Prime");
        }
        sc.close();
    }
}
