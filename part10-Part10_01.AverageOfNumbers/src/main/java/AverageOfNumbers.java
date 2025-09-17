
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        List<String> inputs = new ArrayList<>(); 
        while(true){
            String s = scanner.nextLine();
            if (s.equals("end")){
                break;
            }
            inputs.add(s);
        }
        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        System.out.println(average);
        
        

    }
}
