import java.util.Scanner;

public class Exam090302 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  
        
        System.out.println("첫 번째 수: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("두 번째 수: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("--------------------------");

        if(num2 != 0.0) {

            System.out.println("결과: " + (num1 / num2));

        } else {

            System.out.println("결과: 무한대");

        }


    }
    
}
