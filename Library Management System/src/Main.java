
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("----Welcome to Library Management System---- ");
        while (true) {
        System.out.println("Menu");
        System.out.println("1. Add Book");
        System.out.println("2. Add Member");
        System.out.println("3. Issue Book");
        System.out.println("4. View Books");
        System.out.println("5. View Members");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        Library lib = new Library();
        int bookC =1;
        int memberC =1;



            switch (choice) {
                case 1:
                   // System.out.println("Add Book");
                    sc.nextLine();
                    System.out.print("Enter title: ");
                    String title = sc1.nextLine();
                    System.out.print(" Enter author: ");
                    String author = sc.nextLine();
                    lib.addBook(new Book(bookC, title, author));
                    break;
                case 2:
                    sc.nextLine();
                    //System.out.println("Add Member");
                    System.out.print("Enter Member Name: ");
                    String memberName = sc.nextLine();

                    lib.addMemebr(new Memebr(memberC, memberName));
                    break;
                case 3:
                    sc.nextLine();
                  //  System.out.println("Issue Book");
                    System.out.print("Enter book ID:");
                    int bookID = sc.nextInt();
                    System.out.print("Enter member id: ");
                    int memberID = sc.nextInt();

                    lib.publishBook(bookID, memberID);
                    break;
                case 4:
                    sc.nextLine();
                  //  System.out.println("View Books");
                    lib.printBooks();
                    break;

                case 5:
                    sc.nextLine();
                 //   System.out.println("View Members");
                    lib.printMemebrs();
                    break;
                case 6:
                    System.out.println("Exiting System.GOODBYE");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }





    }

}