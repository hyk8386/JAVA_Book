package chap04;

public class ForFloatCounterExample {

	public static void main(String[] args) {	// 0.1은 float타입으로 정확하게 표현할 수 없기 때문에 x에 더해지는 실제값은 0.1보다 약간 크다.
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}

}
