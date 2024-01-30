package lo_functional_programming;

import lo_methods.DaysMonths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamDemo4 {

    public static void main(String[] args) {

        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};

        // count total characters across all names
        System.out.println("Total characters [all names]: " +
                Arrays.stream(names)
                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                        .length()
        );

        // display all names in upper case
        // should not have repeated names
        System.out.println("Names [Uppercase set]: " +
                Arrays.stream(names)
                        .map(String::toUpperCase)
                        .collect(Collectors.toSet())
        );

        // return all values as an array list
        System.out.println("Names [ArrayList]: " +
                Arrays.stream(names)
                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll)
        );

        // get all names as name:length
        System.out.println("Names [map length]: "
                + Arrays.stream(names)
                .collect(Collectors.toMap(s -> s, String::length))
        );

        // count of each name
        System.out.println("Names [map count]: " +
                Arrays.stream(names)
                        .map(String::toUpperCase)
                        .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
        );

        CSTStudent[] students = {
                new CSTStudent("AAF", "AAL", "CST", 35, 89),
                new CSTStudent("BBF", "BBL", "DESIGN", 45, 79),
                new CSTStudent("CCF", "CCL", "CST", 25, 48),
        };


        Arrays.stream(students)
                .collect(Collectors.groupingBy(CSTStudent::getMajor, TreeMap::new, Collectors.averagingDouble(CSTStudent::getScore)))
                .forEach((s, aDouble) -> System.out.printf("%-15s %2.4f\n", s, aDouble));

    }

}
