package lv.javaguru.demo.Lecture9;

public class UniqueWordVocabularyTest {
    public static void main(String[] args) {
        UniqueWordVocabulary vocabulary = new UniqueWordVocabulary();

        vocabulary.addWords("Dandelion");
        vocabulary.addWords("Tulip");
        vocabulary.addWords("Rose");
        vocabulary.addWords("Lily");
        vocabulary.addWords("Daisy");
        vocabulary.addWords("Orchid");
        vocabulary.addWords("");

        vocabulary.getUniqueWords();

        System.out.println(vocabulary.getUniqueWords());
        vocabulary.printToConsole();
        vocabulary.test1();
    }
}
