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

class Teaching extends Employee {
    String nameofSubject;

    public Teaching(int empno, String name, int age, double salary, String nameofSubject) {
        super(empno, name, age, salary);
        this.nameofSubject = nameofSubject;
    }

    public void display() {
        super.display();
        System.out.println("Name Of Subject: " + nameofSubject);
    }
}

class NonTeaching extends Employee {
    String typeOfWork;

    public NonTeaching(int empno, String name, int age, double salary, String typeOfWork) {
        super(empno, name, age, salary);
        this.typeOfWork = typeOfWork;
    }

    public void display() {
        super.display();
        System.out.println("Type Of Work: " + typeOfWork);
    }
}

public class Practical25 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Teaching(1001, "Rawat", 25, 30000, "Soft Skills"));
        employees.add(new Teaching(1002, "Shah", 35, 50000, "Data Structures"));
        employees.add(new NonTeaching(5001, "Rana", 33, 40000, "Accounts"));
        employees.add(new NonTeaching(5002, "Mehta", 38, 45000, "Marketing"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        int number = sc.nextInt();
        boolean flag = false;
        for (Employee emp : employees) {
            if (emp.empno == number) {
                emp.display();
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Employee Not Found!!");
        }
        sc.close();
    }
}
