package lv.javaguru.demo.Lecture7;

import java.util.Random;
public class ArrayService {
    public int [] createArray (int size){
        return new int[size];
    }
public void fillArratWithRandomNumbers (int [] array){
        Random randomGenerator = new Random();
        for (int  i=0; i<array.length;i++){
            array[i]= randomGenerator.nextInt(101);

}
}

public void printArrayToConsole(int []array){
        for (int number: array) {
            System.out.println(number+ "");
        }
}
 public double findAverageNumberInArray (double[]array){
        double sum=0;
        for (double number:array){
            sum+=number;
        }
        return sum/array.length;
 }}