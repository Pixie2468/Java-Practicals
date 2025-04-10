import java.util.Random;

public class Practical11 {
    public static void main(String[] args) {
        Random ran = new Random();
        System.out.println("First 100 random integers between 1 and 49: ");
        for (int i = 0; i < 100; i++) {
            int a = ran.nextInt(49);
            System.out.print(a + "\t");
        }
    }
}
