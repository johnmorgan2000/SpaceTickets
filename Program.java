import java.util.ArrayList;
import java.util.Scanner;

class Program {
    static Scanner reader = new Scanner(System.in);
    static Ticket ticket = new Ticket();
    static int distanceToMars = 62100000;
    static int minSpeed = 16;
    static int maxSpeed = 30;
    static int priceRange = 50 - 36;

    public static String makeTicket(int distanceToMars, int minSpeed, int maxSpeed, ArrayList<String> spacelines,
            int id) {
        String spaceline = ticket.randomSpaceline(spacelines);
        int speed = ticket.randomSpeed(minSpeed, maxSpeed);
        int days = ticket.getNumberOfDays(speed, distanceToMars);
        String trip = ticket.randomTrip();
        int price = ticket.pricePerTrip(trip, speed);

        return String.format("%-3s %-18s %-4s  %-10s  $ %s\n", id, spaceline, days, trip, price);

    }

    public static String chooseTicket(ArrayList<String> tickets) {
        while (true) {
            System.out.print("Choose a ticket by Id: ");
            try {
                int id = reader.nextInt();
                if (id < 10) {
                    return tickets.get(id);
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid id.");
            }

        }

    }


    public static void main(String[] args) {

        ArrayList<String> spacelines = new ArrayList<String>();
        spacelines.add("Space X");
        spacelines.add("Space Adventures");
        spacelines.add("Virgin Galactic");

        String table = String.format("%s %-18s %s  %-10s  %s\n", "Id", "Spaceline", "Days", "Trip-type", "Price");
        ArrayList<String> tickets = new ArrayList<String>();

        String bar = "";
        for (int i = 0; i < table.length(); i++) {
            bar += "=";
        }

        table += bar + "\n";

        for (int i = 0; i < 10; i++) {
            String output = makeTicket(distanceToMars, minSpeed, maxSpeed, spacelines, i);
            table += output;
            tickets.add(output);
        }

        System.out.println(table);
        String ticket = chooseTicket(tickets);
        System.out.println(ticket);

    }
}
