import java.util.*;

public class Practical14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        System.out.print("Factors in Increasing Order: ");
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                num = num / i;
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
