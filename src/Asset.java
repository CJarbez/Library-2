import java.time.LocalDate;

 abstract class Asset {

    public String name;
    private String renter;
    private LocalDate DueDate;
    private String rating;

     public Asset(String newName, String newRenter) {
         name = newName;
         renter = newRenter;
     }

    public Asset(String newVideo){
         name = newVideo;
    }

    public static void returnToLibrary(String returnedBookName) {
    }

    public String getRenter(){
        return renter;
    }

    public boolean isRented(){
        return renter != null;
    }

    public String getName(){
        return name;
    }

    public LocalDate getDueDate(){
        return DueDate;
    }

    public void rent(String renterName){
        this.DueDate = LocalDate.now().plusDays(7);
        this.renter = renterName;
    }

    public void returnToLibrary(){
        renter = null;
        //rented = false;
    }

    public boolean canRent(int age){
        return true;
    }

    public abstract String getType();

 }

