/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
import java.util.Scanner;

public class UserInterface {
    private TodoList myList;
    private Scanner scanner;
    
    public UserInterface(TodoList listMe, Scanner scanner){
        this.myList = listMe;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
            
            if (command.equals("add")){
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                myList.add(toAdd);
            } else if (command.equals("list")){
                myList.print();
            } else if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int removeMe = Integer.valueOf(scanner.nextLine());
                myList.remove(removeMe);
            }
        }
    }
    
}
