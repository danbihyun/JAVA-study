public class ForSumFrom1To100Example {

    public static void main(String[] args) {
        
        int sum = 0;

        for(int i = 1; i <= 100; i++) {

            sum += i; // 1 + 2 + 3 + … + 100 이후 중단

        }

        System.out.println("1 ~ 100의 합 : " + sum);

    }
    
}
