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
public class Box implements Packable{
    private ArrayList<Packable> items;;
    private double weight;
    
    public Box(double maximumCapacity){
        this.weight = maximumCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item){
        if (this.weight() + item.weight() <= this.weight){
            items.add(item);
        }
    }
    
    public double weight(){
        double weight = 0;
        for (Packable item: items){
            weight += item.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}
