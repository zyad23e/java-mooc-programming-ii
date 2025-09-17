
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        List<String> items = new ArrayList<>();
        while(true){
            String s = scanner.nextLine();
            if (s.equals("end")){
                System.out.println("");
                break;
            }
            items.add(s);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();
        if (command.equals("n")){
            System.out.println("Average of the negative numbers: " + items.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s < 0).average().getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: " + items.stream().mapToInt(s -> Integer.valueOf(s)).filter(s -> s > 0).average().getAsDouble());
        }
        
        

    }
}
