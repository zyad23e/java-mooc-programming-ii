
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        
        while(true){
            String s = scanner.nextLine();
            if (s.equals("")){
                System.out.println("");
                break;
            }
            items.add(s);
        }
        
        items.stream().forEach(sen -> System.out.println(sen));

    }
}
