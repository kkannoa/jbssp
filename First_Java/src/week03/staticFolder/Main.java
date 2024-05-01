package week03.staticFolder;

public class Main {
    public static void main(String[] args){
        // 클래스 빌드 필드 company 확인
        System.out.println(Car.company + "\n");

        Car.company = "Audi";
        System.out.println(Car.company + "\n");
        String companyName = Car.setCompany("Banz");
        System.out.println("companyName : " + companyName);
        System.out.println();
        //확인용
        // 참조형 변수 사용
//        Car car = new Car();
        Car.company = "Ferrari";
        System.out.println(Car.company + "\n");

        String companyName2 = Car.setCompany("Lamborghini");
        System.out.println(companyName2);

    }
}
