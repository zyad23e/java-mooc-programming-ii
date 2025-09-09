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

public class BoxWithMaxWeight extends Box{
    private int weight;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.weight = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        int total = 0;
        for (Item iitem: items){
            total += iitem.getWeight();
        }
        
        if (item.getWeight() + total <= weight){
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        if (items.contains(item)){
            return true;
        } return false;
    }
}
