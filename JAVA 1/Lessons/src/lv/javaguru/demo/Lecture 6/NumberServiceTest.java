package lv.javaguru.demo;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberServiceTest test = new NumberServiceTest();
        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.test1();
        testRunner.test2();
    }

    void test1() {
        NumberService victim = new NumberService();
        int actual = victim.sumInRange(0, 10);
        int expected = 4;
        if (expected == actual) {
            System.out.println("Test1:ok");
        } else {
            System.out.println("Test1:failed. Expected: " + expected + " Actual: " + actual);
        }
    }

    void test2() {
        NumberService victim = new NumberService();
        int actual = victim.evenNumberCounter(2, 89);
        int expected = 56;
        if (expected == actual) {
            System.out.println("Test2:ok");
        } else {
            System.out.println("Test2:failed. Expected: " + expected + " Actual: " + actual);
        }
    }
}
