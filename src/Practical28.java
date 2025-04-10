import java.util.*;

interface Shape2D {
    float area(float radius);
}

interface Shape3D {
    float volume(float radius);
}

class Circle implements Shape2D {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float area(float radius) {
        return (float) Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Area of Circle: " + area(radius));
    }
}

class Sphere implements Shape3D {
    float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    public float volume(float radius) {
        return (float) (4.0 / 3.0) * (float) Math.PI * (float) Math.pow(radius, 3);
    }

    void display() {
        System.out.println("Volume of Sphere: " + volume(radius));
    }
}

public class Practical28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        float r1 = sc.nextFloat();
        Circle c = new Circle(r1);
        c.display();
        System.out.print("Enter Radius of Sphere: ");
        float r2 = sc.nextFloat();
        Sphere s = new Sphere(r2);
        s.display();
        sc.close();
    }
}
