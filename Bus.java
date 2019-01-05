package lv.javaguru.demo.Lesson8;

public class Bus extends Car {
    public void length (){
        System.out.println("Bus is 5 meters long");
    }

    @Override
    public String toString() {
        return "Bus{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
