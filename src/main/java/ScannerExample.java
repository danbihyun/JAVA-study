/* System.in.read()의 단점은 키코드를 하나씩만 읽을 수 있기 때문에 2개 이상의 키가 조합된 한글을 읽을 수 없음.
 * 또한 키보드로부터 입력된 내용을 통 문자열로 읽지 못함.
 * 이러한 단점을 보완하기 위해 Java는 Scanner 이라는 클래스를 제공한다. */

import java.util.Scanner; // Scanner 클래스 가져오기

public class ScannerExample {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String inputData;

        while(true) {

            inputData = scanner.nextLine();

            System.out.println("입력된 문자열: \"" + inputData + "\"");

            if(inputData.equals("q")) {

                break;

            }
        }
        
        System.out.println("종료");

        scanner.close(); // 리소스 누수 경고(Resource leak)

    }

}
