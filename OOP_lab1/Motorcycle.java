public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String brand, String color, int year, boolean hasSidecar) {
        super(brand, color, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void accelerate() {
        if (hasSidecar) {
            System.out.println(brand + " motorcycle with sidecar slowly accelerates.");
    } else {
        System.out.println(brand + " motorcycle revs up and takes off!");
    }
    }
    @Override
    public void stop() {
        System.out.println(brand + " motorcycle brakes and stops.");
    }

    @Override
    public void gas() {
        fuel -= 5;
        System.out.println("Fuel now at " + fuel + "%");
    }
}
