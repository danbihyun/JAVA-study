public class CarExample {

    public static void main(String[] args) {
        
        /* // 객체 생성, 6-2
        Car myCar = new Car();

        // 필드값 읽기
        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        // 필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed); */

      /*   // 6-3
        Car myCar = new Car("검정", 3000); */

        Car car1 = new Car(); // 생성자 선택 1

        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Car car2 = new Car("자가용"); // 생성자 선택 2

        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        // System.out.println("car2.color : " + car2.color); 은색
        System.out.println();

        Car car3 = new Car("자가용", "빨강"); // 생성자 선택 3

        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Car car4 = new Car("택시", "검정",200); // 생성자 선택 4

        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
        System.out.println();

    }
    
}
