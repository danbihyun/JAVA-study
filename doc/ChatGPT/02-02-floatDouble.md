```
float var4 = 0.1234567890123456789f;
double var5 = 0.1234567890123456789;
```
얘네들 왜 조금씩 생략돼서 출력돼?

ChatGPT의 말:

오 👀 그거 진짜 중요한 포인트야.

자바에서 float이랑 double은 부동소수점(floating point) 방식으로 값을 저장하는데, 이게 "정확한 값"을 다 담는 게 아니라 근사치만 저장해.

1. float vs double 저장 방식

float → 32비트(4바이트)

유효 자릿수(정밀도): 약 7자리

double → 64비트(8바이트)

유효 자릿수(정밀도): 약 15~16자리

즉, 소수점 이하 몇 자리까지 "정확하게" 기억할 수 있는지가 다르다는 거야.

2. 네 코드에서
float var4 = 0.1234567890123456789f;
double var5 = 0.1234567890123456789;


var4 (float) → 소수점 이하 7자리 정도까지만 보존. 그 뒤는 잘려서 대략 0.12345679 이런 식으로 반올림돼.

var5 (double) → 소수점 이하 15자리 정도까지 보존. 그래서 0.12345678901234568 이런 식으로 출력돼. (뒤쪽 약간 틀어질 수 있음)

3. 실행 예제
```
public class FloatDoubleTest {
    public static void main(String[] args) {
        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("float : " + var4);
        System.out.println("double: " + var5);
    }
}
```

📌 출력 예시:
```
float : 0.12345679
double: 0.12345678901234568
```
4. 정리

float: 속도는 빠르고 메모리 적게 쓰지만 정밀도가 낮음 → 과학용 계산에는 부적합.

double: 기본 실수 타입. 대부분 상황에서 double 씀.

정확한 소수 계산(예: 돈 계산)에는 BigDecimal 클래스 사용해야 함.