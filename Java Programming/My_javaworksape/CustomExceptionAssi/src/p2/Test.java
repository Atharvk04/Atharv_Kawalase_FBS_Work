package p2;

public class Test {
    public static void main(String[] args) {

        BookingSystem b1 = new BookingSystem("3 Idiots", 200, 50);

        try {
            b1.validate(5);
        }
        catch (InvalidTicketNumberException i) {
            System.out.println(i);
        }
        catch (TicketSoldOutException t) {
            System.out.println(t);
        }
    }
}
