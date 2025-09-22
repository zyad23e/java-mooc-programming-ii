/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author zyade
 */
public class StandardSensor implements Sensor{
    private int num; 
    
    public StandardSensor(int num){
        this.num = num;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() throws IllegalStateException {
        if (!(this.isOn())){
            throw new IllegalStateException("Sensor must be on.");
        } return num;
    }
    
}
