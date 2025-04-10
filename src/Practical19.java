import java.util.*;

public class Practical19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Matrix: ");
        int size = sc.nextInt();
        int arr1[][] = new int[size][size];
        int arr2[][] = new int[size][size];
        System.out.println("Enter Values for First Matrix.");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter Value[" + (i + 1) + "][" + (j + 1) + "]: ");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter Values for Second Matrix.");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter Value[" + (i + 1) + "][" + (j + 1) + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nAddition of both Matrices: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
