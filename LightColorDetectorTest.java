package lv.javaguru.demo;

public class LightColorDetectorTest {
    public static void main (String [] args){
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(385);

        System.out.println("Result:"+ result);
    }
}


