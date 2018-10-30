package lv.javaguru.demo;

public class Product {

    String name;
    double regularPrice;
    double discount;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

public double getCalculateActualPrice(){
        return regularPrice-(regularPrice*discount/100);

}
}
