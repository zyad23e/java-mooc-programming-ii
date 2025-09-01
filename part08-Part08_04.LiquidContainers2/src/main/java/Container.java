/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Container {
    private int amount;
    
    public Container(){
        this.amount = 0;
    }
    
    public int contains(){
        return amount;
    }
    
    public void add(int val){
        if (val > 0){
            if (amount + val > 100){
                amount = 100;
            } else {
                amount += val;
            }
        }
    }
    
    public void remove(int val){
        if (val > 0){
            if (amount - val < 0){
                amount = 0;
            } else {
                amount -= val;
            }
        }
    }
    
    
    public String toString(){
        return amount + "/100"; 
    }
    
}
