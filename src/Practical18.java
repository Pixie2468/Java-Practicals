import java.util.*;

public class Practical18 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide the size of the element followed by the elements!");
            return;
        }
        int size = Integer.parseInt(args[0]);
        if (size != args.length - 1) {
            System.out.println("Number Of elements entered does not match the size entered!");
            return;
        }
        int[] arr = new int[size];
        for (int i = 0; i < args.length - 1; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Number [" + (i + 1) + "]: " + arr[i]);
        }
    }
}
