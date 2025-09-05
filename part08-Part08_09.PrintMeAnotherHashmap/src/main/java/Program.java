
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String, Book> hasmap){
        for (Book k: hasmap.values()){
            System.out.println(k);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text){
        for (Book k: hashmap.values()){
            if (k.getName().contains(text)){
                System.out.println(k);
            }
        }
    }

}
