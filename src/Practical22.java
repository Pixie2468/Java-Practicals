public class Practical22 {
    String name;
    int rollno, t_marks;

    public Practical22() {
        name = "Unknown";
        rollno = 0;
        t_marks = 0;
    }

    public Practical22(String name, int rollno, int t_marks) {
        this.name = name;
        this.rollno = rollno;
        this.t_marks = t_marks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Total Marks: " + t_marks);
    }

    public static void main(String[] args) {
        Practical22 p1 = new Practical22();
        System.out.println("Default Constructor Values: ");
        p1.display();
        Practical22 p2 = new Practical22("John", 1, 488);
        System.out.println("\nParameterized Constructor Values: ");
        p2.display();
    }
}
