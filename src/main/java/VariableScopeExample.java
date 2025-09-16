public class VariableScopeExample {

    public static void main(String[] args) {

        int v1 = 15;

        if (v1 > 10) { // v1 = 15, 즉 15 > 10 으로 참이기 때문에 if문 실행

            int v2; // if문 안에서 변수 v2 선언
            v2 = v1 - 10; // v2 = 15 - 10 = 5

        } // if문 밖으로 나오면서 변수 v2 소멸

        int v3 = v1 + 5;
        // v3 = v1 + v2 + 5; 일 때, v2는 소멸되어 존재하지 않는 변수가 되었기 때문에 컴파일 에러

    }

}
