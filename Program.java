import java.util.ArrayList;

class Program {
    static Ticket ticket = new Ticket();

    public static void main(String[] args) {
        int distanceToMars = 140000000;
        int minSpeed = 20;
        int maxSpeed = 35;

        ArrayList<String> spacelines = new ArrayList<String>();
        spacelines.add("Space X");
        spacelines.add("Space Adventures");
        spacelines.add("Virgin Galactic");

        System.out.println("Spaceline " + ticket.RandomSpaceline(spacelines));
        System.out.println("Days: " + ticket.getNumberOfDays(minSpeed, distanceToMars));
    }
}
