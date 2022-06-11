package p217;

public class Calculator {
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x+y;		//  return x+y; 이렇게도 사용가능
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
	
	
