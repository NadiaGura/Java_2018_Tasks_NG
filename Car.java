package lv.javaguru.demo.Lesson8;

public class Car {

    public void material(){
        System.out.println("Car is constructed from metal");
    }

    @Override
    public String toString() {
        return "Car{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
