int intValue = 44032; 일 때 
double doubleValue = 3.14;
intValue = (int) doubleValue;
라고 하면, int는 소수점 뒤 수를 버림 하는거야 반올림 하는거야?

ChatGPT의 말:

좋은 질문 잡았다 😎

자바에서 실수를 정수 타입으로 강제 형변환(casting) 하면 소수점 이하를 무조건 버림(truncate) 해.
👉 반올림 절대 아님!

네 코드 흐름
int intValue = 44032;
double doubleValue = 3.14;
intValue = (int) doubleValue;
System.out.println(intValue);


실행 결과 👉 3

이유: (int) 3.14 → 소수점 이하 .14는 그냥 버림.

더 많은 예시
```
System.out.println((int)3.99);   // 3
System.out.println((int)-3.99);  // -3 (버림은 0쪽으로 가는 게 아님! 그냥 소수점 자름)
```
만약 반올림 하고 싶으면?

Math.round() 사용해야 해:

System.out.println(Math.round(3.14));  // 3
System.out.println(Math.round(3.99));  // 4


Math.round() 결과는 long 타입이지만, int로 캐스팅해 쓰기도 해.

✅ 정리

(int) 캐스팅 → 소수점 이하 버림

반올림 원하면 Math.round()