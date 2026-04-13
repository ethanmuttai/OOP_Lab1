public class Bus extends Vehicle {

    private int seats;
    private String route;

    public Bus(String brand, String color, int year, int seats, String route) {
        super(brand, color, year);
        this.seats = seats;
        this.route = route;
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " bus on route " + route + " is moving.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " bus stopping at the next stage.");
    }

    @Override
    public void gas() {
        fuel -= 15;
        System.out.println("Fuel now at " + fuel + "%");
    }
}
