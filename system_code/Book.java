package librarySystem;

import java.util.ArrayList;
import java.util.HashSet;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msi
 */
public class Book extends Library {
   
  private String title ;
  private String id;
  private String author;
  private int year;
  private double price;

    
public Book (String title ,String id){
   this.setTitle(title);
    this.setId(id);
    
}
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    private static HashSet <String> titles = new HashSet<>();
    
    public void setTitle(String title) {
     if (titles.contains(title)){ 
         throw new IllegalArgumentException("title is already in use");
     }
        titles.add(title);
        this.title = title;
    }
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private static HashSet <String> ids = new HashSet<>();
    
    
    public void setId(String id) {
        if (ids.contains(id)){ 
       throw new IllegalArgumentException("id is already in use");
     }
       ids.add(id);
     this.id=id;
     }
         


    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param auther the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
 
}
