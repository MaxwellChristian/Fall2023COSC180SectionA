package lo_inheritance;

import org.w3c.dom.css.Rect;

public class ShapeDemo {

    public static void main(String []args) {

        Shape s1 = new Shape("Blue");
        s1.type = ShapeType.TWO_D;
        s1.type = ShapeType.THREE_D;
        System.out.println(s1.toString());

        Rectangle r1 = new Rectangle();
        r1.setColor("Yellow");
        r1.setHeight(10.12);
        r1.setWidth(12.12);

        //        System.out.println(r1.getColor());
//        System.out.println(r1.getWidth());
//        System.out.println(r1.getHeight());

        System.out.println(r1.toString());

        Rectangle r2 = new Rectangle("Red", 11.2, 124.5);
        System.out.println("Area: " + r2.getArea());
        System.out.println(r2);

        Circle c1 = new Circle("Purple", 15.7);
        System.out.println("Area: " + c1.getArea());
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println("Area: " + c2.getArea());
        System.out.println(c2);
    }

}
