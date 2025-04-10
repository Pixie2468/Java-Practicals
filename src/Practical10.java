import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(str.charAt(k) + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
