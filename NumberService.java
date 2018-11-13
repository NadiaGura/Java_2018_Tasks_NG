package lv.javaguru.demo;

public class NumberService {

    int sumInRange(int from, int to) {
        int sum = 0;
        while (from < to) {
            System.out.println(from);
            from++;
            sum+=from;
            continue;
        }
        return sum;
    }

    int getEvenNumberCount(int from, int to) {
        int getEvenNumberCounter = 0;
        for (int i = from; i < to; i++) {
            if (from % 2 == 0) {
                getEvenNumberCounter++;
            }
        }
        return getEvenNumberCounter;
    }
}

