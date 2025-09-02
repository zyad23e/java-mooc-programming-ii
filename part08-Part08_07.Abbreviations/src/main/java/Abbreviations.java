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
public class Abbreviations {
    private HashMap<String, String> dictionary;
    
    public Abbreviations(){
        this.dictionary = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        dictionary.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if (dictionary.containsKey(abbreviation)){
            return true;
        } return false;
    }
    
    public String findExplanationFor(String abbreviation){
        if (dictionary.containsKey(abbreviation)){
            return dictionary.get(abbreviation);
        } return null;
    }
    
}
