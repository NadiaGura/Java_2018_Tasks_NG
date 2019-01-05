package lv.javaguru.demo.Lesson8;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.material();

        PassengerCar passengerCar = new PassengerCar();
        passengerCar.material();

        Truck truck = new Truck();
        truck.material();

        Bus bus = new Bus();
        bus.material();

        System.out.println();

        passengerCar.color();
        truck.weight();
        bus.length();

        System.out.println();

        Car[] cars = new Car[]{new PassengerCar(), new Truck(), new Bus()};

        for (Car c : cars) {
            c.material();
        }
    }
}
