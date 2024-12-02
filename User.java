public abstract class User {
    private String name;
    private String userID;

    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public String getUserID() {
        return userID;
    }

    public abstract void borrowItem(LibraryItem item);
    public abstract void returnItem(LibraryItem item);
}
