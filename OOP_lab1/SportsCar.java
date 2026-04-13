public class SportsCar extends Vehicle implements Automobile {

    private int horsepower;
    private boolean turbo;

    public SportsCar(String brand, String color, int year, int horsepower, boolean turbo) {
        super(brand, color, year);
        this.horsepower = horsepower;
        this.turbo = turbo;
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " roars forward with " + horsepower + "hp!");
    }

    public void accelerate(int speed) {
        System.out.println(brand + " blasting to " + speed + " km/h" + (turbo ? " - turbo on!" : ""));
    }

    @Override
    public void stop() {
        System.out.println(brand + " slams the brakes. Stopped.");
    }

    @Override
    public void gas() {
        fuel -= 20;
        System.out.println("Fuel now at " + fuel + "%");
    }

    @Override
    public void refuel(double amount) {
        fuel += amount;
        System.out.println("Added " + amount + " litres. Fuel at " + fuel + "%");
    }

    @Override
    public void honk() {
        System.out.println("HOOOONK!");
    }

    @Override
    public int getDoors() {
        return 2;
    }

    @Override
    public String getGearbox() {
        return "Manual";
    }
}
