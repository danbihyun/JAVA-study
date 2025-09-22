public class MemberService {

    /**
     * 로그인 기능 메소드
     * 
     * @param id       사용자 아이디
     * @param password 사용자 비밀번호
     * @return 로그인 성공(true) / 실패(false)
     */

    boolean login(String id, String password) {

        // id가 "hong"이고 password가 "12345"일 경우 로그인 성공
        if (id.equals("hong") && password.equals("12345")) {

            return true;

        }

        return false;

    }

    /**
     * 로그아웃 기능 메소드
     * 
     * @param id 사용자 아이디 (여기서는 사용하지 않지만, 매개변수 형식으로 포함됨)
     */

    void logout(String id) {

        System.out.println("로그아웃 되었습니다.");

    }

}