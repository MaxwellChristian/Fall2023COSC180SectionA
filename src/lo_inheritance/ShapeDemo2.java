package lo_inheritance;

import java.util.ArrayList;
import java.util.Collections;

public class ShapeDemo2 {

    public static void main(String []args){

        // create multiple shapes
        // 30 circles
        // 20 rectangles

        ArrayList<Shape> shapes = new ArrayList<>();
        // there is no size restriction on array list
        // it expands as and when you add objects to it

        shapes.add(new Circle(5));
        shapes.add(new Circle(5));
        shapes.add(new Circle(1));

        shapes.add(new Rectangle(11, 15));
        shapes.add(new Rectangle(12, 17));

        // display the first object from the array list
        System.out.println(shapes.get(0));

        // display the last object from the array list
        System.out.println(shapes.get( shapes.size() - 1 ));

        // display total shapes
        System.out.println("Total shapes: " + shapes.size());

        // draw each shape
        for(Shape s: shapes){
            s.draw();   // the polymorphic method draw
        }

        shapes.add(new Circle(7));
        shapes.add(new Rectangle(2, 1));

        // display total shapes
        System.out.println("Total shapes: " + shapes.size());

        // remove the shape at index 2
        shapes.remove(2);

        // display total shapes
        System.out.println("After removing: Total shapes: " + shapes.size());

        // show the shape at index 2;
        System.out.print("Shape at index 2: " + shapes.get(2));

        shapes.set(2, new Circle(18));
        // show the shape at index 2;
        System.out.print("Shape at index 2: " + shapes.get(2));
        // display total shapes
        System.out.println("Total shapes: " + shapes.size());

        // show all shapes
        for(Shape s: shapes){
            System.out.println(s);
        }

        // sort all the shapes
        // Collections.sort(shapes);

        Shape first = shapes.get(0);
//        Shape second = shapes.get(1);
        Shape second = shapes.get(shapes.size() - 1);   // last object in array list

        // check if both shapes are same
        if( first.equals(second) ){
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Both are Different");
        }


        ArrayList<Shape> alCircles = new ArrayList<>();

        alCircles.add(new Circle(15));
        alCircles.add(new Circle(151));
        alCircles.add(new Circle(5));
        alCircles.add(new Circle(150));
        alCircles.add(new Circle(155));

        // sort



    }

}
