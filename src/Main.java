public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Aibek", "KZ12345");
        Driver driver2 = new Driver("Dana", "KZ67890");

        Vehicle car = new Car("Toyota", 2022, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", 2021, false);
        Vehicle truck = new Truck("Volvo", 2020, 15.5, 4);

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles = {car, motorcycle, truck};

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            if (v.driver != null) {
                v.driver.displayDriverInfo();
            }
            v.stopEngine();
            System.out.println();
        }
    }
}
