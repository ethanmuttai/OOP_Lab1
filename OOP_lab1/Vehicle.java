public abstract class Vehicle {

    protected String brand;
    protected String color;
    protected int year;
    protected double fuel;

    public Vehicle(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.fuel = 100.0;
    }

    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();

    public void showDetails() {
        System.out.println(brand + " | " + color + " | " + year);
    }
}
