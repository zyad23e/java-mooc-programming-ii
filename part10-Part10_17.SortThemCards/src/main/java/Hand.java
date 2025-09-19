
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        Iterator<Card> c = cards.iterator();
        while (c.hasNext()){
            System.out.println(c.next());
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand arg0) {
        Iterator<Card> thisDeck = cards.iterator();
        int thisAmt = 0;
        while(thisDeck.hasNext()){
            thisAmt += thisDeck.next().getValue();
        }
        
        Iterator<Card> otherDeck = arg0.cards.iterator();
        int otherAmt = 0;
        while(otherDeck.hasNext()){
            otherAmt += otherDeck.next().getValue();
        }
        
        return thisAmt - otherAmt;
    }
}
