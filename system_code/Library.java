/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarySystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author msi
 */
public class Library  {
    //array which take a Book(class) type**
 ArrayList<Book> arr= new ArrayList<>();
 
     //the add method**:
    
   final boolean add(Book book){
        return  arr.add(book);
    }
 
 //******************************************************
   
   //delete method by the iterator of  book type**
final boolean delete(String title) throws NullPointerException {
     Iterator <Book> iterator = arr.iterator();
     while(iterator.hasNext()){
         Book book = iterator.next();
         try{
         if (book.getTitle().equalsIgnoreCase(title)){
            iterator.remove();
            return true;} 
         //for the String title
         }catch(NullPointerException exp){
                 System.out.println("null exp thrown");
                 throw exp;
                 
                }}return false;}
 //*********************************************************
    
   // display method** 
 boolean display=false;
  // the display method:
  final boolean display (String bookTitle){
    for(Book book : arr){
  //avoiding the nullexception
    if (book.getTitle()==null)
          continue;
  //to see if the book is in the library
    if(book.getTitle().equalsIgnoreCase(bookTitle) ){
  //using indexLoop to find the entered book
    for(int i = 0;i< arr.size();i++){
        Book displayedBook = arr.get(i);
  //is it the one we must get?
       if(displayedBook.getTitle().equalsIgnoreCase(bookTitle)){
         arr.get(i);
         System.out.print(" displayed BOOK ID :"+arr.get(i).getId());
         System.out.print(" //displayed BOOK author :"+arr.get(i).getAuthor());
         System.out.print(" //displayed BOOK  price :"+arr.get(i).getPrice());
         System.out.print(" //displayed BOOK  year :"+arr.get(i).getYear()); 
         System.out.println ("book is displayed");
        display = true;
       break;
  }            
    }
     }
      }
  return display;
} 
  //**********************************************
  // display all method**
 
final boolean  displayAll(){
     for(int i=0;i<arr.size();i++){
         Book book =arr.get(i);
   System.out.print("//BOOK TITLE:"+book.getTitle());
   System.out.print("   //BOOK ID:"+book.getId());
   System.out.print("   //Book author:"+book.getAuthor());
   System.out.print("   //Book price" +book.getPrice());
   System.out.println("   //Book year" +book.getYear());
         display= true; 
         
     }
     System.out.println("all books are displayed");
     return display;
 }


 //**********************************************************************************
 final void update(String titleOfExsetedBook){
for(Book b :arr){
if(b.getTitle().equalsIgnoreCase(titleOfExsetedBook)){
Scanner s = new Scanner(System.in);
System.out.println("enter the new TITLE : ");
String newTitle = s.nextLine();
 b.setTitle(newTitle);
System.out.println("enter the new id : ");
b.setId(s.nextLine());
System.out.println("enter new author ");
b.setAuthor(s.nextLine());
System.out.println("enter the new year : ");
 b.setYear(s.nextInt());
break;}

}

}}

