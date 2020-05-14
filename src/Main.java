import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Congratulations on opening your first Book store! Lets get you all set up");
        System.out.println("What is the name of your bookstore?");
        String name = userInput.nextLine();
        System.out.println("What is the address?");
        String address = userInput.nextLine();
        System.out.println("How many sq ft would you like in your new store?");
        int size = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Will you be selling new or used books?");
        String books = userInput.nextLine();
        System.out.println("How many books are in your inventory?");
        Bookstore mybookstore = new Bookstore(name, address, size, books);

        System.out.println(mybookstore.totalBooks());

        System.out.println();
        System.out.println("Your bookstore " + mybookstore.getName() + " is now ready for its grand opening.");
        System.out.println(mybookstore.getName() + " is located at " + mybookstore.getAddress());
        System.out.println("And has a broad range of " + mybookstore.getBookTypes() + " books!");
        System.out.println(
                "We have already set your hours to Monday - Friday 9am-7pm, Saturday 9am -4pm, and closed on Sunday!");
        System.out.println("Let's welcome your first customer!");

        System.out.println();
        System.out.println("Welcome to " + mybookstore.getName() + "! How can I help you today?");
        System.out.println("What day is it today? I can let you know our store hours.");
        String day = userInput.nextLine();
        System.out.println(Bookstore.openToday(day));
        System.out.println("What book are you looking for?");
        String findBook = userInput.nextLine();
        System.out.println(mybookstore.findBook(findBook));
        System.out.println("Here is a list of all the books in our inventory!");
        mybookstore.printBooks();

        userInput.close();
    }

}