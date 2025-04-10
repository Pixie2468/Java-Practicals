import java.util.*;

public class Practical12 {
    public static void main(String[] args) {
        Random ran = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            int a = ran.nextInt(10);
            String c = Integer.toString(a);
            str = c + str;
        }
        for (int i = 0; i < 3; i++) {
            int a = ran.nextInt(26) + 65;
            char c = (char) a;
            str = c + str;
        }
        System.out.print("Generated Number Plate: " + str);
    }
}
