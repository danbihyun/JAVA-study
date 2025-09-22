public class Car {

    /* 필드, 6-2
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    int speed; */
/* 
    // 생성자, 6-3
    Car(String color, int cc) {

    } */

    // 필드, 6-3
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 1
    Car() {

    }

    // 생성자 2
    Car(String model) {

        // this.model = model;
        this(model, "은색", 250);

    }

    // 생성자 3
    Car(String model, String color) {

        // this.model = model;
        // this.color = color;
        this(model, color, 250);

    }

    // 생성자 4
    Car(String model, String color, int maxSpeed) {

        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;

    }

}
