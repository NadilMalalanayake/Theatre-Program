import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Theatre {
    static int[] Row1 = new int[12];//array 1 with 12 seats
    static int[] Row2 = new int[16];//array 2 with 16 seats
    static int[] Row3 = new int[20];//array 3 with 20 seats
    static Scanner input = new Scanner(System.in);
    static ArrayList<Ticket> tickets=new ArrayList<>();  //Creating new arrayList for task 12 [to add tickets details]

    public static void main(String[] args) { //main method of the Programme
        DisplayMenu();
    }

    public static void DisplayMenu() {
        boolean check=true;
        while (check) {  //Display all the option method
            System.out.println();
            System.out.println(" \" Welcome to the New Theatre \"");
            System.out.println("-------------------------");
            System.out.println("Please select an option :");
            System.out.println("1) Buy a ticket");
            System.out.println("2) Print seating area");
            System.out.println("3) Cancel ticket ");
            System.out.println("4) List available seats ");
            System.out.println("5) Save to file ");
            System.out.println("6) Load from file");
            System.out.println("7) Print ticket information and total price ");
            System.out.println("8) Sort tickets by price");
            System.out.println("\t0) Quit ");
            System.out.println("-------------------------");
            try {
                System.out.print("Enter your Option :");
                int option = input.nextInt();
                switch (option) {               //switch case to call all the methods
                    case 1 :buyTicket();break;
                    case 2 :printSeatingArea();break;
                    case 3 :cancelTicket();break;
                    case 4 :showAvailable();break;
                    case 5 :save();break;
                    case 6 :loadFile();break;
                    case 7 :showTickets();break;
                    case 8 :sortTickets(tickets);break;
                    case 0 :check=false;break;
                    default : System.out.println("Invalid selection, Please try again");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input");
                System.out.println();
                input.nextLine();
            }
        }
    }

    }






