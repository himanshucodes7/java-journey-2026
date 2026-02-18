package For_Loop;

public class DistanceDrilled {
    public static void main(String[] args) {

        int speed = 20;
        int totalDistance = 0;

        for (int hour = 1; hour <= 8; hour++){
            totalDistance += speed;
            speed -=2; // As speed decreases every hour.
        }

        System.out.println("Total distance drilled in 8 hours = " + totalDistance + " meters");
    }
}
