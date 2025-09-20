## 결과 값이 바뀌는 경우도 있어?

ChatGPT의 말:

좋은 질문 👌

있어! 경우에 따라서는 &&/|| (단락 평가)와 &/| (무조건 평가) 때문에 실행 결과 자체가 달라질 수 있어.

🔹 1. 변수 값이 달라지는 경우

```java
int a = 0;

boolean r1 = (false && (++a > 0));
System.out.println("r1 = " + r1 + ", a = " + a);

a = 0;
boolean r2 = (false & (++a > 0));
System.out.println("r2 = " + r2 + ", a = " + a);
```

결과

```java
r1 = false, a = 0
r2 = false, a = 1
```

&& → 앞 조건이 false라서 ++a 실행 안 됨 → a=0

& → 뒤 조건까지 실행 → ++a 실행돼서 a=1

👉 결과값(변수 값)이 달라짐.

🔹 2. 예외 발생 여부가 달라지는 경우

```java
boolean r3 = (false && (10 / 0 == 0)); // 안전
boolean r4 = (false & (10 / 0 == 0));  // 예외 발생
```

&& → 앞이 false → 뒤 조건 계산 안 함 → 예외 없음

& → 뒤 조건까지 실행 → 10/0 때문에 ArithmeticException 터짐

👉 프로그램이 아예 죽을 수도 있음.

🔹 3. OR (|| vs |)도 마찬가지

```java
int b = 0;

boolean r5 = (true || (++b > 0));
System.out.println("r5 = " + r5 + ", b = " + b);

b = 0;
boolean r6 = (true | (++b > 0));
System.out.println("r6 = " + r6 + ", b = " + b);
```

결과

```java
r5 = true, b = 0
r6 = true, b = 1
```

|| → 앞 조건이 true → 뒤 실행 안 함 → b=0

| → 뒤까지 실행 → b=1

✅ 정리하면

조건식에 **부작용(++, 메서드 호출, 예외 발생)**이 있으면 &&/||와 &/|의 결과가 달라질 수 있다.

조건식이 단순히 true/false만 계산되면 차이 없음.
