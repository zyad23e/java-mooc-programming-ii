
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Item{
    private Map<String, Integer> qty;
    private Map<String, Integer> price;
    public String product;
    
    public Item(String product, int qty, int unitPrice){
        this.qty = new HashMap<>();
        this.qty.put(product, qty);
        this.price = new HashMap<>();
        this.price.put(product, unitPrice);
        this.product = product;
    }
    
    public int price(){
        return this.qty.get(product) * this.price.get(product);
    }
    
    public void increaseQuantity(){
        this.qty.put(product, this.qty.get(product) + 1);
    }
    
    public String toString(){
        return product + ": " + this.qty.get(product);
    }
}
