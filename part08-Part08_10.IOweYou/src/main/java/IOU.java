/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> owed;
    
    public IOU(){
        this.owed = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        owed.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        for (String k: owed.keySet()){
            if (k.equals(toWhom)){
                return owed.get(k);
            }
        } return 0;
    }
    
}
