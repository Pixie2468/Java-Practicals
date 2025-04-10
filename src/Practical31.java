import java.util.*;

public class Practical31 {
    static int bin2Dec(String str) {
        return Integer.parseInt(str, 2);
    }

    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        String str = sc.nextLine();
        sc.close();
        try {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                    throw new NumberFormatException("Invalid Binary Input!!");
                }
            }
            int ans = bin2Dec(str);
            System.out.println("Decimal Value: " + ans);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
