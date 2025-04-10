import java.util.*;

class Person {
    String name;
    int age;
    float salary;

    public Person(String n, int a, float s) {
        name = n;
        age = a;
        salary = s;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Practical21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Salary: ");
        float salary = sc.nextFloat();
        Person p1 = new Person(name, age, salary);
        System.out.println("\nPerson Details: ");
        p1.display();
        sc.close();
    }
}
