public class Sedan extends Vehicle implements Automobile {

    private int doors;
    private String gearbox;

    public Sedan(String brand, String color, int year, int doors, String gearbox) {
        super(brand, color, year);
        this.doors = doors;
        this.gearbox = gearbox;
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " sedan picks up speed steadily.");
    }

    public void accelerate(int speed) {
        System.out.println(brand + " sedan accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, String mode) {
        System.out.println(brand + " sedan hitting " + speed + " km/h in " + mode + " mode.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " sedan has stopped.");
    }

    @Override
    public void gas() {
        fuel += 20;
        System.out.println("Topped up. Fuel at " + fuel + "%");
    }

    @Override
    public void refuel(double amount) {
        fuel += amount;
        System.out.println("Added " + amount + " litres. Fuel at " + fuel + "%");
    }

    @Override
    public void honk() {
        System.out.println("Beep beep!");
    }

    @Override
    public int getDoors() {
        return doors;
    }

    @Override
    public String getGearbox() {
        return gearbox;
    }
}
