package lv.javaguru.demo;

public class CarTest {

    public static void main (String []args){

        Car firstCar = new Car();
        firstCar.setBrand("Audi");
        firstCar.setColor("Black");
        firstCar.setYear(2018);

        String carBrand = firstCar.getBrand();
        String carColor = firstCar.getColor();
        int carYear = firstCar.getYear();

        System.out.println("Car brand is "+ carBrand);
        System.out.println("Car color is "+ carColor);
        System.out.println("Car year is "+ carYear);


    }
}
