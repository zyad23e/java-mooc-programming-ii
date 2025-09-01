
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = 0;
        int second = 0;
        
        while(true){
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String read = scanner.nextLine();
            if (read.equals("quit")){
                break;
            } 
            
            String[] parts = read.split(" ");
            int value = Integer.valueOf(parts[1]);
            String command = parts[0];
            
            if (command.equals("add")){
                if (value > 0){
                    if (first + value > 100){
                        first = 100;
                    } else {
                        first += value;
                    }
                }
            } else if (command.equals("move")){
                if ( value > 0){
                    if (value + second > 100){
                        second = 100;
                        first -= value;
                    } else if (first < value){
                        second += first;
                        first = 0;
                    } else {
                        second += value;
                        first -= value;
                    }
                }
            } else if (command.equals("remove")){
                if (value > 0){
                    if (value <= second){
                        second -= value;
                    } else {
                        second = 0;
                    }
                }
            }
            System.out.println("");
        }


       
    }

}
