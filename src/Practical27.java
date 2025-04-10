abstract class A {
    abstract void display();
}

class A1 extends A {
    void display() {
        System.out.println("This is A1 Class");
    }
}

class A2 extends A {
    void display() {
        System.out.println("This is A2 Class");
    }
}

public class Practical27 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.display();
        A2 a2 = new A2();
        a2.display();
    }
}
