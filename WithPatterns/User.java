/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WithPatterns;

/**
 *
 * @author user
 */
//same user class as without pattern pacakeg 
//with two user types, premium and normal
public class User {
    private int id;
    private String name;
    private String type;
    private int amtBorrowed;

    public User(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amtBorrowed = 0;//initilaizing the borrowed amount for the user at 0
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmtBorrowed() {
        return amtBorrowed;
    }

    public void setAmtBorrowed(int amtBorrowed) {
        this.amtBorrowed = amtBorrowed;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", type=" + type + ", amtBorrowed=" + amtBorrowed + '}';
    }
    
    public void incrementBorrowed() {
        amtBorrowed++;
    }

    public void decrementBorrowed() {
        amtBorrowed--;
    }
}
