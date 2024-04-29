package week03;

public class Car {
    // 고유 데이터 영역
    String company;
    String model;
    String color;
    double price;

    // 상태 데이터 영역
    double speed;
    char gear;
    boolean lights;

    //객체 데이터 영역
    Tire tire;
    Door door;
    Handle handle;

    // 생성자
    public Car () {
        // 기본생성자 : 생략 가능

        System.out.println("생성자가 호출되었습니다! 객체가 생성됩니다.");
    }

    //메서드

    // gasPedal
    // input : kmh
    // output : speed
    double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }
    // breakPedal
    // input : X
    // output : speed
    double breakPedal() {
        speed=0;
        return speed;
    }
    // changeGear
    // input : gear(char type)
    // output : gear
    char changeGear (char type){
        gear = type;
        return gear;
    }
    // onOffLight
    // input : X
    // output : lights(boolean)
    boolean onOffLights () {
        lights = !lights;
        return lights;
    }
    // horn
    // input : X
    // output : X
    void horn () {
        System.out.println("빵빵");
    }
}
