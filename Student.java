public class Student extends User {
    private String gradeLevel;

    public Student(String name, String userID, String gradeLevel) {
        super(name, userID);
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public void borrowItem(LibraryItem item) {
        System.out.println(getName() + " is borrowing " + item.getTitle());
    }

    @Override
    public void returnItem(LibraryItem item) {
        System.out.println(getName() + " is returning " + item.getTitle());
    }
}