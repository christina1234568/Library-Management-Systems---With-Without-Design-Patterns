/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package WithPatterns;

/**
 *
 * @author user
 */
/*
INSTRUCTIONS
1. Open the system with an IDE which suports Java
2. Open the package you want to run (WithPatterns and WithoutPatterns)
3. Run the corresponding Main class
4. The Main class will be run with the objects and operations defined in the class
6. Results will be similar for the two Main classes but will be for differnet users
to allow for a fair comparions but with some differentiation
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library library = new Library();
        Operations operation = new Operations();

        library.addBook(new Book(1, "The Alchemist", "Paulo Coehlo", false));
        library.addBook(new Book(2, "Safe Haven", "Nicholar Sparks", false));
        library.addBook(new Book(3, "The Valkyries", "Paulo Coehlo", false));
        library.addBook(new Book(4, "The Reef", "Nora Roberts", false));
        library.addBook(new Book(5, "The Notebook", "Nicholas Sparks", false));
        library.addBook(new Book(6, "Harry Potter and the Plilosopher's Stone", "J.K Rowling", false));
        library.addBook(new Book(7, "Harry Potter and the Chamber of Secrets", "J.K Rowling", false));
        library.addBook(new Book(8, "Harry Potter and the Prisoner of Azkaban", "J.K Rowling", false));
        library.addBook(new Book(9, "Harry Potter and the Goblet of Fire", "J.K Rowling", false));

        User normal = new User(1, "Savannah Paul", "NORMAL");
        User premium = new User(2, "John Smith", "PREMIUM");

        System.out.println("Refactored System With Design Patterns\n");
        System.out.println("Normal user Operations");
        operation.borrow(normal, library.findBookById(1));
        operation.borrow(normal, library.findBookById(2));
        //trying to boroow 3 - should fail
        operation.borrow(normal, library.findBookById(3));

        //returning the borrowing - should succeed
        operation.returnBook(normal, library.findBookById(2));
        operation.borrow(normal, library.findBookById(3));

        System.out.println();
        System.out.println("Premium user Operations");
        //book should say already borrowed
        operation.borrow(premium, library.findBookById(3));
        
        operation.borrow(premium, library.findBookById(4));
        operation.borrow(premium, library.findBookById(5)); 
        operation.borrow(premium, library.findBookById(6));
        operation.borrow(premium, library.findBookById(7));
        operation.borrow(premium, library.findBookById(8));
        //trying to boroow one more book - should fail
        operation.borrow(premium, library.findBookById(9));
    }
    
}
