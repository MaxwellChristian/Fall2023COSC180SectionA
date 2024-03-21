package lo_inheritance;

import java.util.Comparator;

public class Circle extends Shape implements Comparable<Circle>, Comparator<Circle> {

   private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                ", " +
                "radius=" + radius +
                "} ";
    }

    @Override
    void draw() {
        System.out.println("In DRAW of Circle");
    }



    @Override
    public boolean equals(Object o) {

        // check if both objects are having same reference
        if (this == o) return true;

        // check if both objects are from different classes
        if (o == null || this.getClass() != o.getClass()) return false;

        // type cast to current class
        Circle circle = (Circle) o;

        // compare the required properties
        return Double.compare(radius, circle.radius) == 0;
    }


    @Override
    // override from Comparable
    public int compareTo(Circle o) {
        if( this == o ){
            return 0;
        }

        if( o == null || this.getClass() != o.getClass()){
            return 0;
        }

        return (int) (this.getRadius() - o.getRadius());
    }

    @Override
    // override from Comparator
    public int compare(Circle o1, Circle o2) {
        if( o1 == o2 ){
            return 0;
        }

        if( o1 == null || o2 == null || o1.getClass() != o2.getClass()){
            return 0;
        }

        return (int) (o1.getRadius() - o2.getRadius());
    }
}
