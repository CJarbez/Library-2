import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Library {

    // the names of books in stock in the library
    private static final ArrayList<Asset> booksInStock = new ArrayList<Asset>();
    //private static final ArrayList<String> renters = new ArrayList<>();
    //private static final ArrayList<LocalDate> dueDates = new ArrayList<>();

    /** returns the renter associated with the book name.
     * If no one is renting the book, null is returned.
     * @param bookName
     * @return
     */
    public static Asset getBook(String bookName) {
        for(int i=0; i<booksInStock.size(); i++) {
            if(booksInStock.get(i).getName().equals(bookName));
                return booksInStock.get(i);
        }
        return null;
    }

    /** determines whether or not a book is stocked by the library.
     *
     * @param bookName
     * @return
     */
    public static boolean bookExists(String bookName) {
        for(int i=0; i<booksInStock.size(); i++) {
            if(booksInStock.get(i).getName().equals(bookName));
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        booksInStock.add(new Book("Dune"));
        booksInStock.add(new Book("Ender's Game"));
        booksInStock.add(new Book("Hitchhiker's Guide to the Galaxy"));
        booksInStock.add(new Book("Do Androids Dream of Electric Sheep?"));
        booksInStock.add(new Book("Frankenstein"));
        booksInStock.add(new Book("The Hunger Games"));
        booksInStock.add(new Book("Never Let Me Go"));
        booksInStock.add(new Book("Neuromancer"));
        booksInStock.add(new Book("I Robot"));
        booksInStock.add(new Book("Snow Crash"));
        booksInStock.add(new Video("A Few Good Men", "R"));
        booksInStock.add(new Video("Saw", "NC17"));
        booksInStock.add(new Video("Fried Green Tomatoes", "PG13"));
        booksInStock.add(new Video("Ice Age", "PG"));
        booksInStock.add(new Video("The Absent Minded Professor", "G"));
        booksInStock.add(new Video("The Rookie", "G"));
        booksInStock.add(new Video("The Wolf of Wall Street", "NC17"));
        booksInStock.add(new Video("Deadpool", "R"));
        booksInStock.add(new Video("Home Alone", "PG"));
        booksInStock.add(new Video("Black Panther", "PG13"));

        var in = new Scanner(System.in);
        while(true) { // run menu indefinitely
            System.out.println("\nWelcome to the CSC 254 Library App!");
            System.out.println("");
            System.out.println("Menu: ");
            System.out.println(" 1) List Inventory ");
            System.out.println(" 2) List Books on Loan ");
            System.out.println(" 3) Rent a Book ");
            System.out.println(" 4) Return a Book ");
            System.out.println(" 5) Quit ");
            System.out.println("");
            System.out.print("Please make a selection: ");

            var choice = in.nextLine();
            System.out.println("");
            switch (choice) {
                case "1": // list inventory
                    for (int i = 0; i < booksInStock.size(); i++)
                        System.out.println((i + 1) + ". " + booksInStock.get(i).getType() + " "
                                + booksInStock.get(i).getName());
                    break;
                case "2": // list books on loan
                    var anyRenters = false;
                    for (int i = 0; i < booksInStock.size(); i++)
                        if (booksInStock.get(i).getRenter() != null) {
                            anyRenters = true;
                            System.out.println(booksInStock.get(i).getName());
                            System.out.println("rented by: " + booksInStock.get(i).getRenter());
                            System.out.println("due on: " + booksInStock.get(i).getDueDate());
                            System.out.println("");
                        }
                    if (!anyRenters) System.out.println("No books are on loan. ");
                    break;

                case "3": // rent a book
                    System.out.print("What book will be rented: ");
                    var bookName = in.nextLine();
                    System.out.println("");
                    if (!bookExists(bookName)) { // make sure we stock the book
                        System.out.println("Unknown book");
                        break;
                    }
                    var bookToReturn = getBook(bookName);
                    if (bookToReturn.isRented()) { // make sure the book isn't rented
                        System.out.println("This book is currently on loan");
                        break;
                    }
                    System.out.print("Who is renting the book: ");
                    var renter = in.nextLine();
                    bookToReturn.rent(renter);
                    System.out.println("");
                    System.out.print("What is your age: ");
                    var age = in.nextLine();
                        break;

                case "4": // return a book
                    System.out.print("What book will be returned: ");
                    var returnedBookName = in.nextLine();
                    System.out.println("");
                    if (!bookExists(returnedBookName)) { // make sure we stock the book
                        System.out.println("Unknown book");
                        break;
                    }
                    if (bookExists(returnedBookName)) {
                        Asset.returnToLibrary(returnedBookName);
                        break;
                    }
                     else { // make sure the book isn't rented
                        System.out.println("This book is not currently on loan");
                    }
                    break;
                case "5": // exit selected
                    System.out.println("Thank you for using the library!");
                    System.exit(0);  // user exit program
                    break;
                default:
                    System.out.println(choice + " is not a valid selection, try again");
                    break;
            }
        }
    }
    }

