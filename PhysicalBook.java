
public class PhysicalBook extends LibraryItem implements Borrowable {
    private String genre;
    private String shelfLocation;

    public PhysicalBook(String title, String author, int year, String genre, String shelfLocation) {
        super(title, author, year);
        this.genre = genre;
        this.shelfLocation = shelfLocation;
    }

    public String getGenre() {
        return genre;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre + ", Shelf Location: " + shelfLocation);
    }

    @Override
    public void borrowItem() {
        System.out.println("Borrowing physical book: " + getTitle());
    }

    @Override
    public void returnItem() {
        System.out.println("Returning physical book: " + getTitle());
    }
}
