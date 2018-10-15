package lv.javaguru.demo;

import java.util.Random;

public class SumOfRandomnlyGeneratedNumbers {
    public static void main (String [] args){
        Random randomGenerator = new Random();

        int firstRandomNumber=
                randomGenerator.nextInt(101);
        int secondRandomNumber=
                randomGenerator.nextInt(101);
        int thirdRandomNumber=
                randomGenerator.nextInt(101);
        int sumResult= firstRandomNumber+secondRandomNumber+thirdRandomNumber;

    System.out.println("First Random Number =" + firstRandomNumber);
    System.out.println("Second Random Number ="+ secondRandomNumber);
    System.out.println("Third Random Number ="+ thirdRandomNumber);
        System.out.println("Sum ="+sumResult);}

}
