/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WithPatterns;

/**
 *
 * @author user
 */
//class implementing Regulations interface
//to define the borrowing strategy for normal users
public class NormalUserRegulations implements Regulations{
    
    //used to check if the user can borrow another book
    //if amount borrowed is less than 2 for normal users
    //he can borrow another one
    @Override
    public boolean borrowRegulations(User user){
        return user.getAmtBorrowed() < 2;
    }
    
    //setting the limit of number of books
    //that can be borrowed for normal users
    public int getBorrowLimit(){
        return 2;
    }
}
