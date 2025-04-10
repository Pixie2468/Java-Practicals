import java.util.Scanner;

public class Practical7 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        s = sc.nextLine();
        int len = s.length();
        System.out.println("Length of the string is: " + len);
        System.out.println("Second half of the string is: " + s.substring(len / 2));
        sc.close();
    }
}
