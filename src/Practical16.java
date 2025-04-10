import java.util.*;

public class Practical16 {
    public static void reverse(int arr[]) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println("Numbers are now Reversed. ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + (i + 1) + ": " + arr[i]);
        }
        sc.close();
    }
}
