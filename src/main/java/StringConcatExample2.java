public class StringConcatExample2 {

    public static void main(String[] args) {
        
        String str1 = "JDK" + 6.0;
        String str2 = str1 + " 특징";

        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0;
        String str4 = 3 + 3.0 + "JDK";

        System.out.println(str3);
        System.out.println(str4); // 3 + 3.0 까지는 double 타입, 이후 문자열 결합 규칙

        
    }
    
}
