public class ForSumFrom1To100Example2 {

    public static void main(String[] args) {
        
        int sum = 0;
        int i = 0;

        for(i = 1; i <= 100; i++) {

            sum += i;
             
        }

        // 101 돼서 for문이 중지되기 때문에 i-1을 해줌
        System.out.println("1 ~ " + (i - 1) + " 합 : " + sum);

    }
    
}
