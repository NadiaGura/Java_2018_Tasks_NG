package lv.javaguru.demo;

public class NumberServiceTest1 {
    public static void main(String [] args){
        NumberService numberService=new NumberService();
        numberService.sumInRange(1,10);
        System.out.println("Sum: ");
        numberService.getEvenNumberCount(-1,15);
        System.out.println("Even number count : ");
    }

    void test1(){
        NumberService victim = new NumberService();
        int actual = victim.sumInRange(0,10);
        int expected = 4;
        if(expected==actual){
            System.out.println("Test1:ok");}
            else {
                System.out.println("Test1:failed.Expected"+expected+"actual"+actual);
            }
        }

        void test2(){
        NumberService victim= new NumberService();
        int actual = victim.getEvenNumberCount(2,89);
        int expected = 56;
        if(expected==actual){
            System.out.println("Test2:ok");}
            else{
                System.out.println("Test2;failed.Expected "+ expected+"actual"+actual);
        }
        }
        }
