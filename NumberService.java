package lv.javaguru.demo;

public class NumberService {

    int sumInRange(int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += i;
        }
        return sum;
    }

    int evenNumberCounter(int from, int to) {
        int evenNumberCount = 0;
        for (int i = from; i < to; i++) {
            if (i % 2 == 0) {
                evenNumberCount++;
            }
        }
        return evenNumberCount;
    }
}

