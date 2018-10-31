package lv.javaguru.demo;

public class LightColorDetectorTest2 {


    public static void main(String[] args){

        LightColorDetectorTest2 test=new LightColorDetectorTest2();
        test.shouldDetectViolet();
        test.shouldDetectBlue();
        test.shouldDetectGreen();
        test.shouldDetectYellow();
        test.shouldDetectOrange();
        test.shouldDetectRed();
        test.shouldDetectLightIsNotVisible();
    }



    public void shouldDetectViolet(){
        LightColorDetector victim=new LightColorDetector();
        String result = victim.detect(385);
        compareResult(result.equals("Violet"),"shouldDetectViolet");

    }
    public void shouldDetectBlue(){
        LightColorDetector victim=new LightColorDetector();
        String result = victim.detect(408);
        compareResult(result.equals("Blue"),"shouldDetectBlue");
    }
    public void shouldDetectGreen(){
        LightColorDetector victim = new LightColorDetector();
        String result = victim.detect(398);
        compareResult(result.equals("Green"), "shouldDetectGreen");
    }
    public void shouldDetectYellow(){
        LightColorDetector victim = new LightColorDetector();
        String result = victim.detect(598);
        compareResult(result.equals("Yellow"),"shouldDetectYellow");
    }
    public void shouldDetectOrange(){
        LightColorDetector victim = new LightColorDetector();
        String result = victim.detect(93);
        compareResult(result.equals("Orange"),"shouldDetectOrange");
    }
    public void shouldDetectRed(){
        LightColorDetector victim = new LightColorDetector();
        String result = victim.detect(698);
        compareResult(result.equals("Red"),"shouldDetectRed");
    }

    public void shouldDetectLightIsNotVisible(){
        LightColorDetector victim = new LightColorDetector();
        String result = victim.detect(78);
        compareResult(result.equals("Light is not visible"),"shouldDetectLightIsNotVisible");
    }

    void compareResult(boolean result, String testName){
        if(result){System.out.println(testName+"PASSED");
    }
    else {System.out.println(testName+"FAILED");}
}
}


