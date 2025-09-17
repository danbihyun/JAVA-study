public class LongExample {

    public static void main(String[] args) {

        long var1 = 10;
        long var2 = 20L;
        // long var3 = 1000000000000;
        // int타입으로 먼저 읽어서 컴파일 에러.
        long var4 = 1000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        // System.out.println(var3);
        System.out.println(var4);
    }
    
}
