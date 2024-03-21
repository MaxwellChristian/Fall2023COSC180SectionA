package lo_oop;

public class StudentDemo {

    public static void main(String []args) {

        // create an object of the Student class

        // here student1 is just a reference which can refer to objects of Student
        Student student1;

        // here student1 is referring to object of Student
        // the 'new' creates an object
        // i.e. allocates memory to all members of the class Student
        student1 = new Student();

        // student1.firstName = "Maxwell"; // this is not the standard style
        student1.setFirstName("Maxwell");   // standard preferred style

        // String fName = student1.firstName; // this is not the standard style
        String fName = student1.getFirstName(); // standard preferred style
        System.out.println("Student 1: First Name: " + fName);


        Student student2 = new Student();
        student2.setFirstName("Christa");
        System.out.println("Student 2: First Name: " + student2.getFirstName());
    }

}
