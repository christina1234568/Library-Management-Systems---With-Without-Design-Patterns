/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WithoutPatterns;

/**
 *
 * @author user
 */
//the opeartiopns class with borrow and retunrBook method
//chcek if book is null before proceeding
public class Operations {
    public void borrow(User user, Book book){
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        //chcek fi book is borrowed
        if (book.isBorrowed()){
            System.out.println("The book \"" + book.getTitle() + "\" has already been borrowed.");
            return;
        }
        
        //chcek the limit of books based on user type
        if (user.getType().equals("NORMAL")){
            if(user.getAmtBorrowed() >= 2){
                System.out.println("The limit is 2 books for normal users.");
                return;
            }
        }else if(user.getType().equals("PREMIUM")){
            if (user.getAmtBorrowed() >= 5){
                System.out.println("The limit is 5 books for premium users.");
                return;
            }
        }
        
        book.borrowBook();//setting the borrowed flag of book to true
        user.incrementBorrowed();
        System.out.println("Book \"" + book.getTitle() + "\" with id " + book.getIdCode() + " has successfully been borrowed by " + user.getName());
    }

    public void returnBook(User user, Book book) {
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        book.returnBook();//setiing the borrowed flag of book to false
        user.decrementBorrowed();
        System.out.println("Book \"" + book.getTitle() + "\" with id " + book.getIdCode() + " has successfully been returned by " + user.getName());
    }
    
}
