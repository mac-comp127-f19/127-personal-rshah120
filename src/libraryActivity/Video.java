package libraryActivity;

public class Video implements Media {
    private String title;
    private String director;
    private int copies;
    private int maxCopies;

    public Video(String title, String director, int copies){
        this.title = title;
        this.director = director;
        this.copies = copies;
        this.maxCopies = copies;
    }

    @Override
    public String toString(){
        return "Title: " + this.title + "Director: " + this.director + "Number of copies available of loan: " + this.copies;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean checkOut() {
        if (this.copies >= 1){
            copies -= 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkIn() {
        if (this.copies != maxCopies){
            copies += 1;
            return true;
        }
        else{
            return false;
        }
    }
}
