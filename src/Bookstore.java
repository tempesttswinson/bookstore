import java.io.IOException;
import java.util.ArrayList;

public class Bookstore {

    // - What is the address?
    // - Is the store open today?
    // - What time does it close?
    // - How big is the store?
    // - Does the store have new or used books

    public String Name;
    public String Address;
    public int Size;
    public String TypeOfBooks;
    private ArrayList<String> titles;

    // constructor
    Bookstore(String name, String address, int size, String books) {

        this.Name = name;
        this.Address = address;
        this.Size = size;
        this.TypeOfBooks = books;

        titles = new ArrayList<String>();
        loadTitles();

    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getSize() {
        return Size;
    }

    public String getBookTypes() {
        return TypeOfBooks;
    }

    // method that prints the hours of the bookstore given the day of the week
    public static String openToday(String day) {

        switch (day) {
            case "monday":
            case "Monday":
            case "MONDAY":
            case "tuesday":
            case "Tuesday":
            case "TUESDAY":
            case "wednesday":
            case "Wednesday":
            case "WEDNESDAY":
            case "thursday":
            case "Thursday":
            case "THURSDAY":
            case "friday":
            case "Friday":
            case "FRIDAY":
                return "Our Bookstore is open from 9-7 ";
            // break;
            case "saturday":
            case "Saturday":
            case "SATURDAY":
                return "Our Bookstore is open from 9-4 ";
            // break;
            case "sunday":
            case "Sunday":
            case "SUNDAY":
                return "Sorry, We are not open on Sunday!";
            // break;
            default:
                return "Invalid day";
        }
    }

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    public int totalBooks() {
        return this.titles.size();
    }

    public String findBook(String book) {
        if (this.titles.contains(book)) {
            return "Yes! We have that book!";
        } else {
            return "Sorry, we dont have that book yet.";
        }
    }

    public void printBooks() {
        for (String book : this.titles) {
            System.out.println(book);
        }
    }

}