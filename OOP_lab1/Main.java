public class Main {

    public static void main(String[] args) {

        Sedan myCar = new Sedan("Toyota", "Silver", 2022, 4, "Automatic");
        myCar.showDetails();

        // method overriding
        myCar.accelerate();

        // method overloading
        myCar.accelerate(100);
        myCar.accelerate(140, "Sport");

        myCar.stop();
        myCar.honk();
        myCar.gas();

        System.out.println();

        SportsCar sc = new SportsCar("Ferrari", "Red", 2023, 650, true);
        sc.showDetails();
        sc.accelerate();
        sc.accelerate(250);
        sc.stop();

        System.out.println();

        Motorcycle moto = new Motorcycle("Yamaha", "Black", 2021, false);
        moto.showDetails();
        moto.accelerate();
        moto.stop();

        System.out.println();

        Bus bus = new Bus("Scania", "Blue", 2020, 60, "34");
        bus.showDetails();
        bus.accelerate();
        bus.stop();

        System.out.println();

        // polymorphism
        Vehicle v = new Sedan("Honda", "White", 2023, 4, "CVT");
        v.accelerate();
        v.stop();
    }
}
