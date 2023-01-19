package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {

    public void example() {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            //Math.random returns a double, but the arraylist is an integer, hence have to cast math.random as integer.
            //Math.random() * 100 is to randomise numbers between 1-100
            numbers.add((int)Math.random() * 100);

        }

        //print out unsorted list
        System.out.println("Sorted List: " + numbers);

        //Sort in ascending
        Collections.sort(numbers);

        //Print out sorted list
        System.out.println("Sorted list: " + numbers);

        //Sort in descending
        Collections.sort(numbers, Collections.reverseOrder());

        //Print out sorted list
        System.out.println("Sorted list (reverse): " + numbers);


        
    }

    public void example02() {


        
        Employee emp1 = new Employee(12345, "Elson", "ISS", 
        "Lecturer", "elson@gmail.com", 20000);

        Employee emp2 = new Employee(12346, "Jane", "ISS", 
        "Lecturer", "jane@gmail.com", 15000);

        Employee emp3 = new Employee(12347, "Clement", "ISS", 
        "Lecturer", "clement@gmail.com", 10000);



        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Unsorted employees:  " + employees);

        //do ascending sort using collections
        Collections.sort(employees);

        //print out sorted employee list
        System.out.println(employees);

        //Sorting using comparator and lambda
        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println("Sorted employees salary: " + employees);


    }

    
}
