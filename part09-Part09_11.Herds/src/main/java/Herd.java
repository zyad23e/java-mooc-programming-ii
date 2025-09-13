
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Herd implements Movable{
    private List<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable o: herd){
            o.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    public String toString(){
        String pr = "";
        for (Object o: herd){
            pr += o.toString();
            pr += "\n";
        } return pr;
    }
    
}
