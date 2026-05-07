/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarySystem;

import java.util.ArrayList;

/**
 *
 * @author msi
 */
public class LibrarySystemDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   {
     //book obj  
       Book b1= new Book("Phisics","123");
       b1.setAuthor("author 1");
       b1.setPrice(30);
       b1.setYear(2007);
       
       Book b2= new Book("Mathmatic","1234");
       
       Book b3 = new Book("English","1345");
     // Book b4 = new Book("Bioligy","1234");
      //library obj
      Library l1 = new Library();
      //trying the methods
      l1.add(b1);
      l1.add(b2);
      l1.add(b3);
      
     System.out.println(l1.delete("English")) ;
       
      
      //updating new book
     l1.update("Mathmatic");
     System.out.println(b2.getId());
     l1.display("Mathmatic");
     l1.displayAll();
     
            }
          
 
    }
    

