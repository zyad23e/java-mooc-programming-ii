
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
public class ShoppingCart {
    private List<Item> item;
    
    public ShoppingCart(){
        this.item = new ArrayList<>();
    }
    
    public void add(String productt, int price){
        boolean found = false;
        for (Item i: this.item){
            if (i.product.equals(productt)){
                i.increaseQuantity();
                found = true;
            }
        }
        if (!(found)){
            this.item.add(new Item(productt, 1, price)); 
        }
    }
    
    public int price(){
        int total = 0;
        for (Item i: this.item){
            total += i.price();
        } return total;
    }
    
    public void print(){
        for (Item i: this.item){
            System.out.println(i.toString());
        }
    }
}
