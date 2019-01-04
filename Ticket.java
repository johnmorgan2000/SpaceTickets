import java.util.Random;
import java.util.ArrayList;

class Ticket {
    static Random rand = new Random();

    public int getNumberOfDays(int speed, int distance) {
        int hours = distance / (speed * 60 * 60);
        return hours / 24;
    }

    public int randomSpeed(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }

    public String randomSpaceline(ArrayList<String> spacelines) {
        Integer index = rand.nextInt(spacelines.size());
        return spacelines.get(index);
    }

    public String randomTrip() {

        ArrayList<String> tripType = new ArrayList<>();
        tripType.add("One-way");
        tripType.add("Round-trip");

        int index = rand.nextInt(tripType.size());
        return tripType.get(index);

    }

    public Integer pricePerTrip(String trip, int speed) {

        int price = speed + 20;

        if (trip.equals("One-way")) {
            return price;
        } else if (trip.equals("Round-trip")) {
            return price * 2;
        } else {
            return null;
        }

    }

}
