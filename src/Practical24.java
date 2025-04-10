import java.util.Scanner;
import java.util.*;

class Employee {
    String name;
    int age, empno;
    double salary;

    public Employee(int empno, String name, int age, double salary) {
        this.empno = empno;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID: " + empno);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Practical24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        Employee[] e = new Employee[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter Details for Employee " + (i + 1));
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            int empno = rm.nextInt(9000) + 1000;
            e[i] = new Employee(empno, name, age, salary);
        }
        System.out.println("\nEmployee Details: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nDetails for Employee " + (i + 1));
            e[i].display();
        }
        sc.close();
    }
}
