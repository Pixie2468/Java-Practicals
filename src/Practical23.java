class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * radius * radius;
    }
}

public class Practical23 {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.5);
        System.out.println("Area Of Circle c1: " + c1.calcArea());
        Circle c2 = new Circle(10);
        System.out.println("Area Of Circle c2: " + c2.calcArea());
    }
}
