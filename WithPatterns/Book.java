/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WithPatterns;

/**
 *
 * @author user
 */
//same book class as without pattern pacakge 
public class Book {
    private int idCode;
    private String title;
    private String author;
    private boolean borrowed;

    //on creeation borrowed will be set to false
    public Book(int idCode, String title, String author, boolean borrowed) {
        this.idCode = idCode;
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setId(int idCode) {
        this.idCode = idCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setAvailable(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" + "idCode=" + idCode + ", title=" + title + ", author=" + author + ", borrowed=" + borrowed + '}';
    }
    
     public void borrowBook() {
        this.borrowed = true;
    }

    public void returnBook() {
        this.borrowed = false;
    }
    
}
