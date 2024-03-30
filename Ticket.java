public class Ticket {
    private int row;
    private int seat;
    private double price;
    private Person person;//get all the Person class data and assign to person object

    public Ticket(int row, int seat, double price, Person person) { //Ticket Constructor
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.person = person;
    }
    public void print() {
        System.out.println("Name    - " + person.getName());
        System.out.println("Surname - " + person.getSurname());
        System.out.println("Email   - " + person.getEmail());
        System.out.println("Row     - " + row);
        System.out.println("Seat    - " + seat);
        System.out.println("Price   - " + price);
        System.out.println();
    }
    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public double getPrice() {
        return price;
    }

    public Person getPerson() {
        return person;
    }
}

