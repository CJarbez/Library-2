public class Book extends Asset{
    public Book(String newName, String newRenter) {
        super(newName, newRenter);
    }

    public Book(String newName) {
        super(newName);
    }

    @Override
    public String getType(){
        return "Book";
    }
}
