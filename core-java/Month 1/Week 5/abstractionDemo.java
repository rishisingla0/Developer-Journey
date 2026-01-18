abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    float r;
    Circle(float r) {
        this.r = r;
    }
    void area() {
        System.out.println("Area of circle = "+ (3.14*r*r));                       
    }
}

class Rectangle extends Shape {
    float l, w;
    Rectangle(float l, float w) {
        this.l = l;
        this.w = w;
    }
    void area() {
        System.out.println("Area of Rectangle = "+ (l*w));
    }
}

public class abstractionDemo {
    public static void main(String[] args) {
        Shape c1 = new Circle(5);
        c1.area();
        Shape r1 = new Rectangle(10, 5);
        r1.area();
    }
}
