package lv.javaguru.demo.Lesson8;

public class Truck extends Car {
    public void weight () {
        System.out.println( "Truck is heavy");
    }

    @Override
    public String toString() {
        return "Truck{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
