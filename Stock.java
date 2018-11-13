package lv.javaguru.demo;

public class Stock {

    String company;
    double currentValue;
    double max;
    double min;

    public Stock(String company, double currentValue){
        this.company=company;
        this.currentValue=currentValue;
        maxPrice=currentValue;
        minPrice=currentValue;
    }
public double getCurrentValue(){
        return currentValue;
}

    public double getMin() {
        return min;
    }

    public String getCompany() {
        return company;
    }

    public double getMax() {
        return max;
    }
    public void updateValue(double value){}
}



