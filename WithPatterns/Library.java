/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WithPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
//same library cklass as without patterns program
public class Library {
    private List<Book> books = new ArrayList<>();
    
    public void addBook(Book book){
        books.add(book);
    }
    
    public List<Book> getBooks(){
        return books;
    }
    
    public Book findBookById(int id){
        for (Book book:books){
            if(book.getIdCode() == id){
                return book;
            }
        }
        return null;
    }
}
