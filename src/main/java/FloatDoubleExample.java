public class FloatDoubleExample {

    public static void main(String[] args) {

        // float var1 = 3.14; 컴파일 에러
        float var2 = 3.14f;
        double var3 = 3.14;

        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("va2: " + var2);
        System.out.println("va3: " + var3);
        System.out.println("va4: " + var4);
        System.out.println("va5: " + var5);

        double var6 = 3e6;
        float var7 = 3e6F;
        double var8 = 2e-3;

        System.out.println("va6: " + var6);
        System.out.println("va7: " + var7);
        System.out.println("va8: " + var8);

    }
    
}
