/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList(){
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task){
        tasks.add(task);
    }
    
    public void print(){
        int counter = 1;
        for (String s: tasks){
            System.out.println(counter + ": " + s);
            counter++;
        }
    }
    
    public void remove(int number){
        tasks.remove(number -1);
    }
    
}
