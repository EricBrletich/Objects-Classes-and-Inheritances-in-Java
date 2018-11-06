
import java.util.ArrayList;

/**
 * Author: Eric Brletich
 * Assignment: Objects, Classes, and Inheritance in Java
 * Class: IST 311
 * Date: 9/10/18
 */
public class Objects_Classes_Inheritance {
    public static void main(String[] args) {
        //create an arrayList of objecct type person
        ArrayList<Person> people = new ArrayList<Person>();
        
        //instantiate people
        Student stu1 = new Student("Eric", "Brletich", "555-012-2254", "thisisnotafakeemail@gmail.com", "Senior");
        Faculty teach1 = new Faculty("John", "Learny", "555-013-2568", "teachyteach@institute.edu", "Professor", 256, "143-6352", "6/3/10");
        Staff staff1 = new Staff("Lenny", "Stafford", "555-014-6985", "LeonardStaford@aol.com", "Head Janitor", 221, "653-1751", "12/3/02");
        
        //add people to the ArrayList
        people.add(stu1);
        people.add(teach1);
        people.add(staff1);
        
        //display the info for all of the people
        displayInfo(people);
        
        //use the Changable interface to change some of the people's info
        stu1.setfName("Rick");
        teach1.setlName("Teachy");
        
        //re-display info for all the people
        displayInfo(people);
    }
    
    public static void displayInfo(ArrayList<Person> people){
        for(Person per: people){
            System.out.print(per.toString());
        }
    }
    
}
