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
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owner;
    
    public VehicleRegistry(){
        this.owner = new HashMap<>();
    }
    
    public boolean add(LicensePlate licenseplate, String owner){
        if (this.owner.containsKey(licenseplate)){
            return false;
        } else {
            this.owner.put(licenseplate, owner);
            return true;
        }
    }
    
    public String get(LicensePlate lp){
        if (this.owner.containsKey(lp)){
            return this.owner.get(lp);
        } return null;
    }
    
    public boolean remove(LicensePlate lp){
        if (owner.containsKey(lp)){
            owner.remove(lp);
            return true;
        } return false;
    }
    
    public void printLicensePlates(){
        for (LicensePlate lp: owner.keySet()){
            System.out.println(lp);
        }
    }
    
    public void printOwners(){
        ArrayList<String> nondup = new ArrayList<>();
        for (String ow: owner.values()){
            if (!(nondup.contains(ow))){
                System.out.println(ow);
                nondup.add(ow);
            }
        }
    }
    
}
