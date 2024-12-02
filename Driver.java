public class Driver {
    public static void main(String[] args) {
        // Create instances of LibraryItem subclasses
       PhysicalBook physicalBook1 = new PhysicalBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction", "A1");
        EBook eBook = new EBook("1984", "George Orwell", 1949, 1.5, "PDF");
        PhysicalBook physicalBook2 = new PhysicalBook("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction", "B2");

        // Create instances of User subclasses
        Student student = new Student("Alice", "S123", "10th Grade");
        Teacher teacher = new Teacher("Mr. Smith", "T456", "History");

        // Display information about the library items
        System.out.println("Library Items:");
        physicalBook1.displayInfo();
        eBook.displayInfo();
        physicalBook2.displayInfo();

        // Borrow and return items
        System.out.println("\nBorrowing and Returning Items:");
        student.borrowItem(physicalBook1);
        student.returnItem(physicalBook1);

        teacher.borrowItem(eBook);
        teacher.returnItem(eBook);

        student.borrowItem(physicalBook2);
        student.returnItem(physicalBook2);
    }
}