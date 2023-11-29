package lo_inheritance;

import org.w3c.dom.css.Rect;

public class ShapeDemo {

    public static void main(String []args) {

        // Shape s1 = new Shape("Blue");
        // object creation of an abstract class is not permitted

        // System.out.println(s1.toString());

        Rectangle r1 = new Rectangle();
        r1.setColor("Yellow");
        r1.setHeight(10.12);
        r1.setWidth(12.12);

        //        System.out.println(r1.getColor());
//        System.out.println(r1.getWidth());
//        System.out.println(r1.getHeight());

        System.out.println(r1.toString());

        Rectangle r2 = new Rectangle("Red", 11.2, 124.5);
        r2.type = ShapeType.TWO_D;
        System.out.println("Area: " + r2.getArea());
        System.out.println(r2);

        Circle c1 = new Circle("Purple", 15.7);
        System.out.println("Area: " + c1.getArea());
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println("Area: " + c2.getArea());
        System.out.println(c2);
        c2.draw();

        Shape s1;   // this is not an object
        // it is just a reference

        s1 = new Circle();
        s1.draw();

        showAttributes(s1);

    }

    private static void showAttributes(Shape shape) {

        // display width if the shape is a rectangle
        // check if shape is a circle
        if( shape instanceof Circle ){
            System.out.println( "Radius: " + ((Circle)shape).getRadius());
        }

        // display radius if the shape is a circle
        if( shape instanceof Rectangle ){
            System.out.println( "Width: " + ((Rectangle)shape).getWidth());
        }

    }

}
