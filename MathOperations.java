package lv.javaguru.demo;

import java.util.Random;

public class MathOperations{
    public static void main (String [] args){
Random randomGenerator = new Random();

int firstRandomNumber= randomGenerator.nextInt (1001);
int secondRandomNumber= randomGenerator.nextInt(1001);
int thirdRandomNumber=randomGenerator.nextInt(1001);
int fourthRandomNumber=randomGenerator.nextInt(1001);

int sumOperations= firstRandomNumber+secondRandomNumber+thirdRandomNumber+fourthRandomNumber;
int deductOperations= firstRandomNumber-secondRandomNumber;
int multiplyOperations=firstRandomNumber*fourthRandomNumber;
float divisionOperationsf = firstRandomNumber/secondRandomNumber;
int remainderOperations = firstRandomNumber%fourthRandomNumber;

System.out.println("First Random Number="+ firstRandomNumber);
System.out.println ("Second Random Number="+secondRandomNumber);
System.out.println("Third Random Number="+thirdRandomNumber);
System.out.println ("Fourth Random Number="+fourthRandomNumber);

System.out.println("Sum="+sumOperations);
System.out.println("Deduction="+ deductOperations);
System.out.println("Multiplication="+multiplyOperations);
System.out.println("Division="+divisionOperationsf);
System.out.println("Remaining="+remainderOperations);
    }



        }
