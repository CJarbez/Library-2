public class Video extends Asset {

    private String renter;
    public Video(String newVideo, String newRating){
        super(newVideo);
    }

    @Override
    public String getType(){
        return "Video";
    }

    @Override
    public boolean canRent(int age){
        return true;
    }
    /*
    enum rating{
        G,    //All ages admitted
        PG,   //Some material not suitable for children
        PG13, //Some material not suitable for children under 13
        R,    //Under 17 requires adult supervision
        NC17, //Under 17 not allowed
    }

     */
}
