package lv.javaguru.demo.Lecture9;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    Set<String> words = new HashSet<>();

    public void addWords(String flowers) {
        if (flowers.length() > 0)
            words.add(flowers);
    }

    public int getUniqueWords() {
        return words.size();
    }

    public void printToConsole() {
        System.out.println("Vocabulary sonsists from the following: " + words);
    }

    void test1() {
        UniqueWordVocabulary test = new UniqueWordVocabulary();
        int expected = 5;
        int actual = getUniqueWords();
        check(actual, expected, "test1");
    }

    void check(int actual, int expected, String TestName) {
        if (actual == expected) {
            System.out.println(TestName + "PASSED");
        } else {
            System.out.println("Test FAILED.");
            System.out.println("Expected:" + expected + "." + "Actual:" + actual + ".");
        }
    }
}
