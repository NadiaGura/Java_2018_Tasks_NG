package lv.javaguru.demo;

import java.util.Objects;

public class TVController {
    private TV tv;

    public void connect(TV tv){
        this.tv=tv;

        test2();
        TVController controller=new TVController();
        TV tv2=new TV();
        controller.connect(tv);
        controller.turnOnTv();



    }

    public void turnOnTv(){
        tv.isTurnedOn();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVController that = (TVController) o;
        return Objects.equals(tv, that.tv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tv);
    }

    void test2(){
        TV tv=new TV();
        String expected="CurrentChannel;0,turnedOn;true";
        String actual=tv.toString();

        if (expected==actual){
            System.out.println("Test2:ok");
        }else{
            System.out.println("Test");
        }

    }
}
