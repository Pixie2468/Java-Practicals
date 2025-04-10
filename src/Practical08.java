import java.util.Scanner;

public class Practical8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int i = 0;
        int count = 0;
        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
            count++;
            i++;
        }
        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                i++;
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    count++;
                }
            }
            i++;
        }
        System.out.println("Number Of Words Starting With capital Letter: " + count);
        sc.close();
    }
}
