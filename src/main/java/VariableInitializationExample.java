public class VariableInitializationExample {

    public static void main(String[] args) {

        int value = 0; // (= 0; 이 없을 경우) 변수 초기화가 이루어지지 않아 컴파일 에러
        int result = value + 10;

        System.out.println(result);

    }

}

/* 왜 에러가 날까?

**지역 변수(local variable)**인 value는 초기화하지 않으면 절대 사용할 수 없음.

int 타입이라 기본값 0이 자동으로 들어갈 것 같지만, 그건 클래스 필드(멤버 변수)일 때만 해당돼.

메서드 안에서 선언된 변수(지역 변수)는 반드시 직접 초기화해야 해. */