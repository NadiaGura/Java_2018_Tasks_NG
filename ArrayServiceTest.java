package lv.javaguru.demo.Lecture7;

public class ArrayServiceTest {
    public static void main (String [] args){
        ArrayServiceTest test = new ArrayServiceTest();
        ArrayServiceTest testRunner = new ArrayServiceTest();
        testRunner.shouldCreateArray();
        testRunner.shouldFillArrayWithRandomnNumbers();
        testRunner.shouldFindAverageNumberInArray();


    }
    void shouldCreateArray(){
        ArrayService victim = new ArrayService();
        int expectedResult = 10;
        int actualResult = victim.createArray(10).length;
        if(expectedResult==actualResult) {
            System.out.println("Should Create Array:passed");
        }else {
                System.out.println("Should Create Array: failed");
            }
        }

        void shouldFillArrayWithRandomnNumbers(){
        ArrayService victim = new ArrayService();
        int [] array = new int[10];
        victim.printArrayToConsole(array);
        System.out.println();
        victim.fillArratWithRandomNumbers(array);
        System.out.println();

        }
        void shouldFindAverageNumberInArray(){
            ArrayService victim = new ArrayService();
            double[] array = {2,3,10};
            double expectedResult = 5;
            double actualResult = victim.findAverageNumberInArray(array);
            if( expectedResult == actualResult){
                System.out.println("Average number in array: passed");
            }
            else {
                System.out.println("Average number in array: failed");
            }
        }
    }

