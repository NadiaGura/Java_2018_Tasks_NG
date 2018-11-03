package lv.javaguru.demo;

public class StockTest {

    public static void main(String[] args) {

        StockTest IBM = new StockTest();
        IBM.updatePrice();

    }

    public void updatePrice() {
        StockTest victim = new StockTest();
        double currentValue = 150;
        double firstChange = 151;
        double lastChange = 145;


        System.out.println("Max Number: " + Math.max(firstChange, lastChange));
        System.out.println("Min Number: " + Math.min(firstChange, lastChange));
        System.out.println("Update Price: " + lastChange);
    }
}

