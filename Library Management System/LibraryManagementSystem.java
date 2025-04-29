    import java.util.Scanner;

// Book class
class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void displayBookDetails() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

// Member class
class Member {
    String name;
    int memberId;

    Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    void displayMemberDetails() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}

// Library class (parent)
class Library {
    Book[] books = new Book[100];
    Member[] members = new Member[100];
    int bookCount = 0;
    int memberCount = 0;

    void addBook(int bookId, String title, String author) {
        books[bookCount++] = new Book(bookId, title, author);
        System.out.println("Book added successfully!");
    }

    void addMember(String name, int memberId) {
        members[memberCount++] = new Member(name, memberId);
        System.out.println("Member added successfully!");
    }

    void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                books[i].displayBookDetails();
            }
        }
    }

    void displayMembers() {
        if (memberCount == 0) {
            System.out.println("No members in library.");
        } else {
            for (int i = 0; i < memberCount; i++) {
                members[i].displayMemberDetails();
            }
        }
    }

    void checkBookAvailability(int bookId) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].bookId == bookId) {
                found = true;
                System.out.println("Book with ID " + bookId + " is " + (books[i].isAvailable ? "Available" : "Not Available"));
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + bookId + " not found in the library.");
        }
    }
}

// Main class with menu using while loop
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int choice = 0;

        while (choice != 6) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Member");
            System.out.println("2. Add Book");
            System.out.println("3. Display All Members");
            System.out.println("4. Display All Books");
            System.out.println("5. Check Book Availability (by Book ID)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Member ID: ");
                    int id = sc.nextInt();
                    lib.addMember(name, id);
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    lib.addBook(bookId, title, author);
                    break;

                case 3:
                    System.out.println("\n--- Member Details ---");
                    lib.displayMembers();
                    break;

                case 4:
                    System.out.println("\n--- Book Details ---");
                    lib.displayBooks();
                    break;

                case 5:
                    System.out.print("Enter Book ID to Check: ");
                    int checkId = sc.nextInt();
                    lib.checkBookAvailability(checkId);
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
