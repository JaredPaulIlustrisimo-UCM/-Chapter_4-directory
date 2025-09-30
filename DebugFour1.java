import java.util.Scanner;

public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius for a circle >> ");
        int radius = input.nextInt();

        Circle c = new Circle(radius);   // Create Circle with radius
        c = new DebugCircle(c);          // Wrap it inside DebugCircle

        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.println("The area is " + c.getArea());
    }
}

// Circle class
class Circle {
    protected int radius;

    public Circle() {
        radius = 0;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRad() {
        return radius;
    }

    public int getDiam() {
        return radius * 2;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// DebugCircle class extends Circle
class DebugCircle extends Circle {

    // Constructor that copies radius from an existing Circle
    public DebugCircle(Circle c) {
        super(c.getRad());
    }

    @Override
    public int getRad() {
        System.out.println("[DEBUG] getRad() called");
        return super.getRad();
    }

    @Override
    public int getDiam() {
        System.out.println("[DEBUG] getDiam() called");
        return super.getDiam();
    }

    @Override
    public double getArea() {
        System.out.println("[DEBUG] getArea() called");
        return super.getArea();
    }
}
