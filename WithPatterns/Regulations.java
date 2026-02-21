/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WithPatterns;

/**
 *
 * @author user
 */
//represent the interface to implement the strategy deisgn pattern
//will be implemented by different class to design the startegy for premium and normal users


//the interface holding the methods signature to be used for
//defining the regulations for borrowing a book
//based on user type
public interface Regulations {
    boolean borrowRegulations(User user);
    int getBorrowLimit();
}
