package com;

interface Area {
    double PI = 3.14;

    double getArea();
}

class Circle implements Area {
    int r;

    Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        double area = PI * r * r;
        return area;
    }
}

public class AreaMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(14);
        //anonymous class
        Area a1 = new Area() {
            @Override
            public double getArea() {
                int l = 10, b = 20;
                return l * b;
            }
        };
        System.out.println("Area of rectangle" + a1.getArea());
    }
}
