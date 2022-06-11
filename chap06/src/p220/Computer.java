package p220;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 매개변수를 ... 을 사용해서 선언하게되면, 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용된다.
	// ...으로 선언된 매개변수의 값은 호출 시 리스트로 나열해주면된다.
	int sum2(int... values) {   
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
