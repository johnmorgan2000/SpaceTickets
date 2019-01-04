import java.util.ArrayList;

class Program {
    static Ticket ticket = new Ticket();
    static int distanceToMars = 62100000;
    static int minSpeed = 16;
    static int maxSpeed = 30;
    static int priceRange = 50 - 36;

    public static String makeTicket(int distanceToMars, int minSpeed, int maxSpeed, ArrayList<String> spacelines) {
        String spaceline = ticket.randomSpaceline(spacelines);
        int speed = ticket.randomSpeed(minSpeed, maxSpeed);
        int days = ticket.getNumberOfDays(speed, distanceToMars);
        String trip = ticket.randomTrip();
        int price = ticket.pricePerTrip(trip, speed);

        return String.format("%-18s %-4s  %-10s  $ %s\n", spaceline, days, trip, price);

    }

    public static void main(String[] args) {

        ArrayList<String> spacelines = new ArrayList<String>();
        spacelines.add("Space X");
        spacelines.add("Space Adventures");
        spacelines.add("Virgin Galactic");

        String table = String.format("%-18s %s  %-10s  %s\n", "Spaceline", "Days", "Trip-type", "Price");

        String bar = "";
        for (int i = 0; i < table.length(); i++) {
            bar += "=";
        }

        table += bar + "\n";

        for (int i = 0; i < 10; i++) {
            String output = makeTicket(distanceToMars, minSpeed, maxSpeed, spacelines);
            table += output;
        }

        System.out.println(table);

    }
}
