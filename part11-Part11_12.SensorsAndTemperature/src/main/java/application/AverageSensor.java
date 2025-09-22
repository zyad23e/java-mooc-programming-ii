/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zyade
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor: sensors){
            if (!(sensor.isOn())){
                return false;
            }
        } return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor: sensors){
            if (!(sensor.isOn())){
                sensor.setOn();
            }
        }
    }

    @Override
    public void setOff() {
        if (!(sensors.isEmpty())){
            sensors.get(0).setOff();
        }
    }

    @Override
    public int read() throws IllegalStateException {
        if (sensors.isEmpty() || (!(this.isOn()))){
            throw new IllegalStateException("Average sensors must be on.");
        }
        int sum = 0;
        for (Sensor sensor: sensors){
            sum += sensor.read();
        } 
        this.readings.add(sum / sensors.size());
        return sum / sensors.size();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return readings;
    }
    
}
