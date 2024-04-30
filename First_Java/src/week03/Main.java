package week03;

public class Main {
    public static void main(String[] args){
        Car car = new Car(); //객체 생성

//        Car[] carArray = new Car[3];
//        Car car1 = new Car();
//
//        car1.changeGear('p');
//        carArray[0] = car1;
//
//        Car car2 = new Car();
//        car2.changeGear('N');
//        carArray[1] = car2;
//
//        Car car3 = new Car();
//        car3.changeGear('D');
//        carArray[2] = car3;
//
//        for(Car car : carArray){
//            System.out.println(car.gear);
//        }

//        Car car = new Car(); //객체 생성
//
//        //초기값 기본 값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set
//        System.out.println("car.model : " + car.model);
//        System.out.println("car.color : " + car.color);
//        System.out.println();
//        System.out.println("car.speed : " + car.speed);
//        System.out.println("car.gear : " + car.gear);
//        System.out.println("car.lights : " + car.lights);
//        System.out.println();
//        System.out.println("car.tire : " + car.tire);
//        System.out.println("car.door : " + car.door);
//        System.out.println();
//
//        // 필드 사용
//        car.color = "blue"; //필드 colordo "blue" 데이터를 저장
//        car.speed = 100;
//        car.lights =false;
//
//        System.out.println(car.color);
//        System.out.println(car.speed);
//        System.out.println(car.lights);
//        //객체간의 협력을 통해서 유기적인 프로그램이 돌아간다.


//        System.out.println("페달 밟기 전의 car.gear : " + car.gear);
//        // 메서드 호출 및 반환값을 저장
//        double speed = car.gasPedal(100, 'D');
//        System.out.println("speed = " + speed);
//
//        boolean lights = car.onOffLights();
//        System.out.println("lights : " + lights);
//        System.out.println();
//        System.out.println("페달 밟고 난 후의 car.gear : " + car.gear);
//        System.out.println();
//        car.carSpeeds(100, 80);
//
//        car.carSpeeds(110, 120, 150);

        // 기본형 매개변수
        char type = 'D';
        car.brakePedal(type);

        // 매서드 실행 완료 후 전달할 매개값으로 저장된 type 값 확인
        System.out.println("type : " + type); // 기존에 선언한 값 'D' 출력, 원본 값 변경되지 않음
        // 매서드 실행 완료 후 변환된 car 인스턴스의 gear 타입 확인
        System.out.println("gear : " + car.gear);
        //하하

//        System.out.println();
//        //참조형 매개변수
//        Tire tire = new Tire();
//        tire.company = "금호";



    }
}
