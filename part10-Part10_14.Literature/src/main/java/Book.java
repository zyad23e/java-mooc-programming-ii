/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zyade
 */
public class Book implements Comparable<Book>{
    private String book;
    private int ageRec;
    
    public Book(String book, int age){
        this.book = book;
        this.ageRec = age;
    }
    
    public String getBook(){
        return this.book;
    }
    
    public int getAgeRecommendation(){
        return this.ageRec;
    }
    
    public String toString(){
        return this.getBook() + " (recommended for " + this.getAgeRecommendation() + " year-olds or older)";
    }

    @Override
    public int compareTo(Book arg0) {
        int ageDiff = this.ageRec - arg0.ageRec;
        if (ageDiff != 0){
            return ageDiff;
        } return this.book.compareTo(arg0.book);
    }
    
}
