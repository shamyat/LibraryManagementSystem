public class EBook extends LibraryItem implements Borrowable {
    private double fileSize; // in MB
    private String format; // e.g., PDF, EPUB

    public EBook(String title, String author, int year, double fileSize, String format) {
        super(title, author, year);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize + "MB, Format: " + format);
    }

    @Override
    public void borrowItem() {
        System.out.println("Borrowing eBook: " + getTitle());
    }

    @Override
    public void returnItem() {
        System.out.println("Returning eBook: " + getTitle());
    }
}