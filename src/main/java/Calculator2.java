public class Calculator2 {
	
	int plus(int x, int y) {

		int result = x + y;
		return result;

	}
	
	double avg(int x, int y) {

		double sum = plus(x, y); // 5번 라인 코드 호출
		double result = sum / 2;
		return result;

	}
	
	void execute() {

		double result = avg(7, 10); // 10번 라인 코드 호출
		println("실행결과: " + result); // 25번 라인 코드 호출

	}
	
	void println(String message) {

		System.out.println(message);

	}	

}