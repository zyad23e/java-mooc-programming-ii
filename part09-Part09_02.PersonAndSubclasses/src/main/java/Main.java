import java.util.ArrayList;
public class Main {

public static void main(String[] args) {
Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
System.out.println(ollie);
ollie.study();
System.out.println(ollie);
    

}

    public static void printPersons(ArrayList<Person> persons){
        for (Person p: persons){
            System.out.println(p);
        }
    }
}
