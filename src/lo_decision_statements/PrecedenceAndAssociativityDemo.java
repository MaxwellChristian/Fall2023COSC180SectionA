package lo_decision_statements;

public class PrecedenceAndAssociativityDemo {

    public static void main(String []args){

        if( 5 < 2 ) System.out.println("In true");
        else System.out.println("In false");

        if( 5 < 2 ) {System.out.println("In true");}
        else {System.out.println("In false");}

        if( 5 < 2 ) System.out.println("In true");
        else {System.out.println("In false");}

        if( 5 < 2 ) {System.out.println("In true");}
        else System.out.println("In false");

        if( 5 < 2 ) System.out.println("In true");
        else
            System.out.println("In false");

    }

}
