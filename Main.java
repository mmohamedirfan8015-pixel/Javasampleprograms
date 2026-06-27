class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}


class Circle extends Shape {
    void area(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}


class Square extends Shape {
    void area(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}


public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.area(5);

        Square s = new Square();
        s.draw();
        s.area(4);
    }
}