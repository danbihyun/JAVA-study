public class ShopService {

    // 1. 클래스 내부에 자기 자신의 객체를 정적 필드로 생성
    private static ShopService singleton = new ShopService();

    // 2. 생성자를 private으로 막아서 외부에서 new로 객체 생성 불가
    private ShopService() {
    }

    // 3. 외부에서 호출할 수 있는 정적 메소드 제공 (싱글톤 반환)
    public static ShopService getInstance() {

        return singleton;

    }

}