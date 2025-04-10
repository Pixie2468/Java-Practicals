import java.util.*;

public class Practical17 {
    public static void main(String[] args) {
        Random rn = new Random();
        int arr[][] = new int[6][6];
        System.out.println("Generated Matrix: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = rn.nextInt(2);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int flag = 0;
        for (int i = 0; i < 6; i++) {
            int temprow = 0;
            int tempcol = 0;
            for (int j = 0; j < 6; j++) {
                if (arr[i][j] == 1) {
                    temprow++;
                }
                if (arr[j][i] == 1) {
                    tempcol++;
                }
            }
            if (tempcol % 2 == 0 || temprow % 2 == 0) {
                System.out.println("Matrix does not have odd number's of 1's in every row and column");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Matrix have odd number's of 1's in every row and column");
        }
    }
}
