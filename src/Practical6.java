import java.util.Scanner;

public class Practical6 {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        c = sc.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            System.out.println("Entered character " + c + " is Vowel");
        } else {
            System.out.println("Entered character " + c + " is not vowel");
        }
        sc.close();
    }
}
