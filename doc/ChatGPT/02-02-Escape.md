```
System.out.print("행 단위 출력\n");
System.out.println("행 단위 출력\n");
```
두개 차이점이 뭐야

ChatGPT의 말:

좋은 포인트 집었네 👍

자바에서 System.out.print 와 System.out.println 은 이렇게 달라:

1. print

줄바꿈 안 함

네가 문자열 안에 \n 을 직접 넣어줘야 줄이 바뀜.

System.out.print("행 단위 출력\n");


➡ "행 단위 출력" 찍고, 마지막에 네가 넣은 \n 때문에 줄바꿈 됨.

2. println

자동으로 줄바꿈 추가

문자열 끝나면 JVM이 자동으로 \n(플랫폼 맞는 개행 문자) 붙여줌.

System.out.println("행 단위 출력\n");


➡ "행 단위 출력" 찍고, 네가 준 \n 때문에 줄바꿈 1번 → println 때문에 줄바꿈 또 1번 → 줄이 두 번 바뀜.

3. 비교 예제
```
public class PrintTest {
    public static void main(String[] args) {
        System.out.print("A\n");
        System.out.println("B");
        System.out.println("C\n");
        System.out.print("D");
    }
}
```

📌 출력 결과:
```
A
B
C

D
```

👉 정리

print : 네가 줄바꿈 하고 싶으면 \n 직접 넣어야 함.

println : 자동 줄바꿈 해줌. 거기에다 \n 넣으면 줄이 두 번 바뀜.
