/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author zyade
 */
public class TemperatureSensor implements Sensor{
    private boolean onoroff = false;
    
    @Override
    public boolean isOn() {
        return onoroff;
    }

    @Override
    public void setOn() {
        onoroff = true;
    }

    @Override
    public void setOff() {
        onoroff = false;
    }

    @Override
    public int read() throws IllegalStateException {
        if (!(onoroff)){
            throw new IllegalStateException("Sensor must be on.");
        } return new Random().nextInt(61) - 30;
    }
    
}
