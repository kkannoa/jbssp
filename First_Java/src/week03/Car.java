package week03;

public class Car {
    // <필드영역>
    // [우리가 클래스를 만들기 위해서는 4가지 STEP이 필요합니다.]
    // 1. 만들려고하는 설계도를 선언합니다.(클래스 선언)
    // 2. 객체가 가지고 있어야 할 속성(필드)를 정의 합니다.
    // 3. 겍채를 생성하는 방식을 정의합니다.(생성자)
    // -constructor
    // 4. 객체가 가지고 있어야 할 행위(메서드)를 정의 합니다.
    
    // 1) 고유 데이터 영역
    String company; //자동차 회사
    String model = "Gv80"; //자동차 모델
    String color; // 자동차 색
    double price; // 자동차 가격
    
    // 2) 상태 데이터 영역
    double speed; // 자동차 속도, km/h
    char gear; // 기어상태 (P, R, N, D)
    boolean lights=true;
    
    // 3) 객체 데이터 영역

    Tire tire = new Tire();
    Door door = new Door();
    Handle handle = new Handle();
    
    // 생성자 : 처음 객체가 생성될 때 (instance화) 어떤로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의!
    public Car () {
        //<생성자 영역>
        // logic
        // 기본 생성자 : 생략이 가능
        System.out.println("생성자 호출 객체 생성 성공");
    }

    //<메서드 영역>

    // gasPedal
    // input : kmh
    // output : speed
    double gasPedal(double kmh, char type){
        changeGear(type);//가속도 페달을 밟으면  자동으로 기어가 변한다
        speed = kmh;
        return speed;
    }


    // brakePedal
    // input : x
    // output : speed

    double brakePedal(char type){
        speed = 0;
        type = 'P';
        changeGear(type); //정지 후 매개변수 type을  어떤 타입으로 전달 받았는지 상관없이 'P'로 고정시키기

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
    // input : x
    // output : lights
    boolean onOffLights () {
        lights=!lights;
        return lights;
    }

    void horn () {
        System.out.println("빵빵!");
    }


    void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("v : " + v);
        }
    }


}
