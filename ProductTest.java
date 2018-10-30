package lv.javaguru.demo;


public class ProductTest {

    public static void main (String [] args){
        Product firstProduct= new Product();
        firstProduct.setName("Milk");
        firstProduct.setDiscount(20);
        firstProduct.setRegularPrice(0.80);


        String setName = firstProduct.getName();
        double setRegularPrice=firstProduct.getRegularPrice();
        double setDiscount=firstProduct.getDiscount();

        System.out.println("Product name: "+firstProduct.getName() + "; Regular price: "+ firstProduct.getRegularPrice()+"; Discount:"+firstProduct.getDiscount()+"%; Actual price: "+ firstProduct.getCalculateActualPrice());
    }





    }




