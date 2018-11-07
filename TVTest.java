package lv.javaguru.demo;

public class TVTest {

    public static void main (String [] args){

    }
    void test1(){
        TV tv=new TV();
        TV.isTurnedOn();

        boolean expected = true;
        boolean actual = tv.isTurnedOn();

        if (expected==actual){
            System.out.println("Test1:ok");
        }


        tv.setManufacturer("Samsung");
        tv.setScreenSize(40.5);
        tv.setCurrentVolumeLevel(15.5);
        tv.setTurnedOn(actual);

        TV tv2=new TV();
        TV.isTurnedOff();

        tv2.setManufacturer("LG");
        tv2.setScreenSize(50.7);
        tv2.setCurrentVolumeLevel(0.00);
        tv2.setTurnedOn(actual);



        System.out.println(tv);
        System.out.println("VS");
        System.out.println(tv2);
        System.out.println("Equals result: "+tv.equals(tv2));

    }
}
