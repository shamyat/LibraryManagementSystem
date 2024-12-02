public class Teacher extends User {
    private String subject;

    public Teacher(String name, String userID, String subject) {
        super(name, userID);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public  void borrowItem(LibraryItem item) {
        System.out.println(getName() + " is borrowing " + item.getTitle());
    }

    @Override
    public  void returnItem(LibraryItem item) {
        System.out.println(getName() + " is returning " + item.getTitle());
    }
}