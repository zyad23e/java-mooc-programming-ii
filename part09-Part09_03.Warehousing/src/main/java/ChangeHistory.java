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

public class ChangeHistory{
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double maxValue(){
        double max = 0;
        if (this.history.isEmpty()){
            return 0;
        }
        
        for (Double num: history){
            if (num > max){
                max = num;
            }
        } return max;
    }
    
    public double minValue(){
        double min = this.history.get(0);
        if (this.history.isEmpty()){
            return 0;
        }
        
        for (Double num: history){
            if (num < min){
                min = num;
            }
        } return min;
    }
    
    public double average(){
        int count = 0;
        double sum = 0;
        
        if (this.history.isEmpty()){
            return 0;
        }
        
        for (Double n: history){
            sum += n;
            count++;
        }
        
        return 1.0 * sum / count;
    }
    
    @Override
    public String toString(){
        return this.history.toString();
    }
}
