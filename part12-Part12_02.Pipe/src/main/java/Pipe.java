
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Pipe<T> {
    private ArrayList<T> pipes;
    
    public Pipe(){
        this.pipes = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        pipes.add(value);
    }
    
    public T takeFromPipe(){
        if (pipes.isEmpty()){
            return null;
        } return pipes.remove(0);
    }
    
    public boolean isInPipe(){
        if (pipes.isEmpty()){
            return false;
        } return true;
    }
}
