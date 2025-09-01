
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Container container = new Container();
        Container container2 = new Container();

        while(true){
            System.out.println("First: " + container);
            System.out.println("Second: " + container2);
            
            String command = scanner.nextLine();
            if (command.equals("quit")){
                break;
            }
            
            String[] parts = command.split(" ");
            int value = Integer.valueOf(parts[1]);
            String toDo = parts[0];
            
            if (toDo.equals("add")){
                container.add(value);
            } else if (toDo.equals("remove")){
                container2.remove(value);
            } else if (toDo.equals("move")){
                if (container.contains() >= value){
                    container.remove(value);
                    container2.add(value);
                } else {
                    int addMe = value - container.contains();
                    container.remove(value);
                    container2.add(value - addMe);
                }
            }
            System.out.println("");
        }
    }

}
