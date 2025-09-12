
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;
    
    public Warehouse(){
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
        
    }
    
    public int price(String product){
        if (this.productPrice.containsKey(product)){
            return this.productPrice.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if (this.productStock.containsKey(product)){
            return this.productStock.get(product);
        } return 0;
    }
    
    public boolean take(String product){
        if (this.productStock.containsKey(product)){
            if (this.productStock.get(product) > 0){
                this.productStock.put(product, this.productStock.get(product) - 1);
                return true;
            }
        } return false;
    }
    
    public Set<String> products(){
        Set<String> noDups = new HashSet<>();
        for (String name: productPrice.keySet()){
            noDups.add(name);
        } return noDups;
    }
    
}
