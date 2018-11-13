package lv.javaguru.demo;

public class StockTest {

    public void stockTest(){
    Stock stock = new Stock("IBM", 150);
    stock.updateValue(170);
    double expected = 170;
    double actual=stock.getMax();


    if(expected==actual){
        System.out.println("Should Update Price: OK");

    }
    else {
        System.out.println("Should Update Price: OK");
    }

    public void updateValue(double price);{
        Stock stock = new Stock("IBM",150);
        stock.updateValue(170);
        double expected = 170;
        double actual=stock.getMax();

        if(expected==actual){
            System.out.println("Should update Price: OK");
        }
        else{System.out.println("Should update Price: Fail");
        }
    }
}

