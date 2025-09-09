/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class CD implements Packable{
    private String artist;
    private String cd;
    private int year;
    
    public CD(String artist, String cd, int year){
        this.artist = artist;
        this.cd = cd;
        this.year = year;
    }
    
    @Override
    public double weight(){
        return 0.1;
    }
    
    public String toString(){
        return this.artist + ": " + this.cd + " (" + this.year + ")";
    }
}
