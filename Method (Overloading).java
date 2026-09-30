class Area {

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double radius) {
        return 3.14 * radius * radius;
    }
}

public class Overloading {

    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("Area of Square = " + a.area(5));

        System.out.println("Area of Rectangle = " + a.area(6, 4));

        System.out.println("Area of Circle = " + a.area(3.0));
    }
}
