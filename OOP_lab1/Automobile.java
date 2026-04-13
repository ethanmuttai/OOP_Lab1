public interface Automobile {

    int MAX_SEATS = 5;
    int TOP_SPEED = 220;

    void refuel(double amount);
    void honk();
    int getDoors();
    String getGearbox();
}
