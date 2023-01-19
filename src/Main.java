public class Main {
    public static void main(String[] args) {
        Car car = new Car( "KIA Rio", 4);
        Car car2 = new Car( "Lada Granta", 4);


        Truck truck = new Truck("Kamaz", 6);
        Truck truck2 = new Truck("Honda", 8);


        Bicycle bicycle = new Bicycle("yamaha", 2);
        Bicycle bicycle2 = new Bicycle("harley", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check( bicycle);
        station.check( bicycle2);
        station.check( truck);
        station.check( truck2);
    }
}
