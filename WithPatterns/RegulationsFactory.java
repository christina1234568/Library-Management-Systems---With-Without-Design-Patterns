/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WithPatterns;

/**
 *
 * @author user
 */
//the factory pattern implementation
//creating the correct regulations policy based on the user type

//client cannot access the policies directly
//and deos not concern himself with what regulations policy to create
public class RegulationsFactory {
    public static Regulations getRegulations(User user){
        if(user.getType().equals("NORMAL")){
            //return the regulations for normal users is user type is normal
            return new NormalUserRegulations();
        }else if(user.getType().equals("PREMIUM")){
            //returning premium user policies if user type is prmeium
            return new PremiumUserRegulations();
        }
        return null;
    }
}
