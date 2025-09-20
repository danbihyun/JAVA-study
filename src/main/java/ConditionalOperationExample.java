public class ConditionalOperationExample {

    public static void main(String[] args) {

        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        /* 85 > 90 = false 이므로 ((score > 80) ? 'B' : 'C'); 로 넘어감
        85 > 80 = true 이므로 'B' 출력 */

        System.out.println(score + "점은 " + grade + "등급입니다.");
        
    }
    
}
