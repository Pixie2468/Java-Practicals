import java.util.Scanner;

public class Practical9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String temp = "";
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            temp = c + temp;
        }
        if (str.equals(temp)) {
            System.out.println("String Is Palindrome");
        } else {
            System.out.println("String Is Not Palindrome");
        }
        sc.close();
    }
}
