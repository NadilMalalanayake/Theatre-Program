// import java.io.FileReader;
// import java.io.FileWriter;
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
                    // case 2 :printSeatingArea();break;
                    // case 3 :cancelTicket();break;
                    // case 4 :showAvailable();break;
                    // case 5 :save();break;
                    // case 6 :loadFile();break;
                    // case 7 :showTickets();break;
                    // case 8 :sortTickets(tickets);break;
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
    private static String inputValidate(String prompt){
        String data;      //name,surname,email print and pass to buyTicket method
        while (true){
            try{
                System.out.print(prompt);
                data=input.next();
                return data;
            }catch (InputMismatchException e){
                System.out.println("invalid Input");
                input.nextLine();
            }

        }
    }
    private static double userPrice(){
        double data;  //user input price method and pass to buyTicket method
        while (true){
            try {
                System.out.print("Enter Your Price :");
                data=input.nextDouble();
                return data;
            }catch (InputMismatchException e){
                System.out.println("invalid Input");
                input.nextLine();
            }

        }
    }
    public static void buyTicket() {  //Ticket Purchasing Method
        int seatNumber=0;
        String name,surname,email;
        double price;
        name=inputValidate("Enter Your Name :");  //get data from inputValidate method
        surname=inputValidate("Enter Your Surname :");
        email=inputValidate("Enter Your Email :");
        price=userPrice();  //get data from userPrice method

        int row = getInputValidate(1, 3, "Row Number :"); //get data from getInputValidate method
        if (row == 1) {
            seatNumber = getInputValidate(1, 12, "Seat Number :");
            seatBooker(row, seatNumber);        //get data from seatBooker method

        } else if (row == 2) {
            seatNumber = getInputValidate(1, 16, "Seat Number :");
            seatBooker(row, seatNumber);

        } else if (row == 3) {
            seatNumber = getInputValidate(1, 20, "Seat Number :");
            seatBooker(row, seatNumber);
        }
        Person person=new Person(name,surname,email);
        Ticket card=new Ticket(row,seatNumber,price,person);
        tickets.add(card);
    }
    private static void seatBooker(int rowNum, int seatNum) { //seat booking calculation in buyTicket method
        if (rowNum == 1) {
            if (Row1[seatNum - 1] == 0) {
                Row1[seatNum - 1] = 1;
                System.out.println("Thank you! Booking Successful.");
                System.out.println();
            } else {
                System.out.println("Sorry, Seat has already Booked");
            }
        } else if (rowNum == 2) {
            if (Row2[seatNum - 1] == 0) {
                Row2[seatNum - 1] = 1;
                System.out.println("Thank you! Booking Successful.");
                System.out.println();
            } else {
                System.out.println("Sorry, Seat has already Booked");
            }
        } else if (rowNum == 3) {
            if (Row3[seatNum - 1] == 0) {
                Row3[seatNum - 1] = 1;
                System.out.println("Thank you! Booking Successful.");
                System.out.println();
            } else {
                System.out.println("Sorry, Seat has already Booked");
            }
        }
    }
    private static int getInputValidate(int minValue, int maxValue, String prompt) {      int data;
        while (true) {  //Rows and Seats correctly passing to buyTicket method and cancelTicket method
            System.out.print(prompt);
            try {
                data = input.nextInt();
                if (data >= minValue && data <= maxValue) {
                    return data;
                } else
                    System.out.println("You have to Input during " + minValue + " and " + maxValue);

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input.");
                input.nextLine();

            }
        }

    }
    }






