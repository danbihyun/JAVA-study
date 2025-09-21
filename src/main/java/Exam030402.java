public class Exam030402 {
    
    public static void main(String[] args) {

        while(true) {

            int n1 = (int)(Math.random() * 6) + 1;
            int n2 = (int)(Math.random() * 6) + 1;
            int sum = n1 + n2;

            System.out.println("(" + n1 + "," + n2 + ")");

            if(sum == 5) {

                break;

            }

        }

        System.out.println("프로그램 종료");

    }

}
