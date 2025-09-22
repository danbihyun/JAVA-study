public class MemberServiceExample {

    public static void main(String[] args) {

        MemberService memberService = new MemberService();

        // 로그인 시도
        boolean result = memberService.login("hong", "12345");

        if (result) {

            System.out.println("로그인 되었습니다.");
            memberService.logout("hong"); // 로그아웃 처리

        } else {

            System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");

        }
    }
}