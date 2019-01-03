import java.util.Random;
import java.util.ArrayList;

class Ticket {
    static Random rand = new Random();

    public int getNumberOfDays(int speed, int distance) {
        int hours = distance / (speed * 60 * 60);
        return hours / 24;
    }

    public String RandomSpaceline(ArrayList<String> spacelines) {
        Integer index = rand.nextInt(spacelines.size());
        return spacelines.get(index);
    }

}
