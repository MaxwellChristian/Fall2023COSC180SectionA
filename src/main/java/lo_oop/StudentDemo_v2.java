package lo_oop;

public class StudentDemo_v2 {

    public static void main(String []args) {

        // create an object of the Student class

        // here student1 is just a reference which can refer to objects of Student
        Student_V2 student1;

        // here student1 is referring to object of Student
        // the 'new' creates an object
        // i.e. allocates memory to all members of the class Student
        student1 = new Student_V2();

        // student1.firstName = "Maxwell"; // this is not the standard style
        //student1.setFirstName("Maxwell");   // standard preferred style

        Address address1 = new Address("3500", "Wascana Parkway", "Regina", "SK", "Canada", "S4X 0X0");
        student1.setAddress1(address1);

        // String fName = student1.firstName; // this is not the standard style
        //String fName = student1.getFirstName(); // standard preferred style
        //System.out.println("Student 1: First Name: " + fName);


        Student student2 = new Student();
        student2.setFirstName("Christa");
        System.out.println("Student 2: First Name: " + student2.getFirstName());
    }

}
