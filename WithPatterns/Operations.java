package WithPatterns;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
//refactored Opeartions class to use the deign patterns implemented
//containes the borrow method and the 
public class Operations {
    
    public void borrow(User user, Book book){
        if (book == null){
            System.out.println("Book not found.");
            return;
        }
        
        //chceking if the book is borrowed
        if (book.isBorrowed()){
            System.out.println("The book \"" + book.getTitle() + "\" has already been borrowed.");
            return;
        }
        
        //geeting the regulatiosn form the regulation factory
        Regulations regulation = RegulationsFactory.getRegulations(user);
        
        //chceking the borror regulations for that sepcific user
        if(!regulation.borrowRegulations(user)){
            System.out.println("The limit for the amount borrowed under your subscription has been reached. \nYou can only borrow: " + regulation.getBorrowLimit());
            return;
        }  
        
        book.borrowBook();//seting the borrowed boolean to true
        user.incrementBorrowed();//increasing the borrowed amount ofr the user
        System.out.println("Book \"" + book.getTitle() + "\" with id " + book.getIdCode() + " has successfully been borrowed by " + user.getName());
        
        
    }
    
    public void returnBook(User user, Book book){
        if (book == null){
            System.out.println("Book not found.");
            return;
        }
        
        book.returnBook();//setting the borrowed boolean to false
        user.decrementBorrowed();//decrement the borrowed count of the user
        System.out.println("Book \"" + book.getTitle() + "\" with id " + book.getIdCode() + " has successfully been returned by " + user.getName());
    }
}
