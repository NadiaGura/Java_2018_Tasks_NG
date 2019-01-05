package lv.javaguru.demo.Lecture5;

public class TVTest {
    public static void main(String[] args) {

        TVTest test = new TVTest();
        test.test1();
        test.test2();
        test.test3();
    }

    void test1() {
        TV victim = new TV();
        victim.turnOn();
        boolean expected = true;
        boolean actual = victim.isTurnedOn();
        if (expected == actual) {
            System.out.println("Test 1 PASSED.");
        } else {
            System.out.println("Test 1 FAILED.");
        }
    }

    void test2() {
        TV victim = new TV();
        victim.turnOn();
        victim.nextChannel();
        victim.nextChannel();
        victim.nextChannel();

        TV expectedResult = new TV(true, 3);
        if (victim.equals(expectedResult)) {
            System.out.println("Test 2 PASSED.");
        } else {
            System.out.println("Test 2 FAILED.");
        }
    }

    void test3() {
        TV victim = new TV();
        String expected = "Current Channel: 1, turnedOn: false";
        String actual = victim.toString();
        if (expected == actual) {
            System.out.println("Test 3 PASSED");
        } else {
            System.out.println("Test 3 FAILED.");
        }
    }
}
