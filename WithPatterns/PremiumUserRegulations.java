/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WithPatterns;

/**
 *
 * @author user
 */
//similar to the NormalUserRegulations class
//but here the limit for the amount borrowed is 5
//strategy for premium users
public class PremiumUserRegulations implements Regulations{
    
    //chceking if amount is less than 5 - can accept another borrow
    public boolean borrowRegulations(User user){
        return user.getAmtBorrowed() < 5;
    }
    
    //setting the limit for the premium user
    public int getBorrowLimit(){
        return 5;
    }
}
