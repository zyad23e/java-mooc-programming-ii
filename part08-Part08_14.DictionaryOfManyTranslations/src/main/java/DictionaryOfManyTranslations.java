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

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict;
    
    public DictionaryOfManyTranslations(){
        this.dict = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.dict.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> trans = this.dict.get(word);
        trans.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if (dict.containsKey(word)){
            ArrayList<String> wordd = dict.get(word);
            if (wordd.isEmpty()){
                return wordd;
            }

            return wordd;      
        } return new ArrayList<>();
    }
    
    public void remove(String word){
        if (dict.containsKey(word)){
            dict.remove(word);
        }
    }
}
