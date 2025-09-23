/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Hideout<T> {
    private T t;
    
    public void putIntoHideout(T toHide){
        t = toHide;
    }
    
    public T takeFromHideout(){
        if (!(t == null)){
            T mew = t;
            t = null;
            return mew;
        } return null;
    }
    
    public boolean isInHideout(){
        if (t == null){
            return false;
        } return true;
    }
}
