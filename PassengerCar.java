package lv.javaguru.demo.Lesson8;

public class PassengerCar extends Car {
    public void color () {
        System.out.println("This car is black");
    }

    @Override
    public String toString() {
        return "PassengerCar{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
