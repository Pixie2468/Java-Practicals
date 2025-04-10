import java.util.*;

public class Practical20 {
    static int top = -1;

    public static void push(int arr[], int val) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow!!");
        } else {
            top = top + 1;
            arr[top] = val;
        }
    }

    public static void pop(int arr[]) {
        if (top == -1) {
            System.out.println("Stack Underflow!!");
        } else {
            System.out.println("Deleted Element: " + arr[top]);
            top--;
        }
    }

    public static void peep(int arr[], int pos) {
        if (pos <= 0) {
            System.out.println("Invalid Position Entered!!");
        } else if (top - pos + 1 < 0) {
            System.out.println("Stack Underflow!!");
        } else {
            System.out.println("Element at Position " + pos + " from Top = " + arr[top - pos + 1]);
        }
    }

    public static void change(int arr[], int pos, int val) {
        if (pos <= 0) {
            System.out.println("Invalid Position Entered!!");
        } else if (top - pos + 1 < 0) {
            System.out.println("Stack Underflow!!");
        } else {
            arr[top - pos + 1] = val;
        }
    }

    public static void display(int arr[]) {
        int temp = top;
        int z = 1;
        if (top == -1) {
            System.out.println("Stack is Empty!!");
        } else {
            for (int i = temp; i >= 0; i--) {
                System.out.println("Value " + z + ": " + arr[i]);
                z++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Stack: ");
        int size = sc.nextInt();
        int stack[] = new int[size];
        int flag = 1;
        while (flag == 1) {
            System.out.print("\nSelect Your Choice.\n");
            System.out.print("1. PUSH\n");
            System.out.print("2. POP\n");
            System.out.print("3. PEEP\n");
            System.out.print("4. CHANGE\n");
            System.out.print("5. DISPLAY\n");
            System.out.print("6. EXIT\n");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter Value: ");
                    int val = sc.nextInt();
                    push(stack, val);
                    break;
                }
                case 2: {
                    pop(stack);
                    break;
                }
                case 3: {
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    peep(stack, pos);
                    break;
                }
                case 4: {
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter Value to Replace: ");
                    int val = sc.nextInt();
                    change(stack, pos, val);
                    break;
                }
                case 5: {
                    display(stack);
                    break;
                }
                case 6: {
                    flag = 0;
                    break;
                }
                default:
                    System.out.println("Invalid Choice...Enter Again!!");
                    break;
            }
        }
        sc.close();
    }
}
