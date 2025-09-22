/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author zyade
 */
public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String fileName;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        this.dictionary = new HashMap<>();
        this.fileName = file;
        
    }
    
    public boolean load(){
        boolean tof = true;
        
        try (Scanner scanner = new Scanner(Paths.get(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                dictionary.put(parts[0], parts[1]);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            tof = false;
        }
        return tof;
    }
    
    public void add(String words, String translation){
        if (!(dictionary.containsKey(words))){
            dictionary.put(words, translation);
        }
    }
    
    public String translate(String word){
        if (dictionary.containsValue(word)){
            for (String s: dictionary.keySet()){
                if (dictionary.get(s).equals(word)){
                    return s;
                }
            }
        } else if (dictionary.containsKey(word)){
            return dictionary.get(word);
        } return null;
    }
    
    public void delete(String word){
        if (dictionary.containsKey(word)){
            dictionary.remove(word);
        } else if (dictionary.containsValue(word)){
            for (String value: dictionary.keySet()){
                if (dictionary.get(value).equals(word)){
                    dictionary.remove(value);
                    break;
                }
            }
        }
    }
    
    public boolean save(){
       String toAdd = "";
       boolean found = true;
       try {
            PrintWriter write = new PrintWriter(fileName);
            for (String key: dictionary.keySet()){
                toAdd = key + ":" + dictionary.get(key);
                write.println(toAdd);
            } write.close();    
       } catch (Exception e){
           System.out.println(e.getMessage());
           found = false;
       } return found;
    }
}
