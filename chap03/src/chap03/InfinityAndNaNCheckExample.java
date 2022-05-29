package chap03;

public class InfinityAndNaNCheckExample {		// Infinity와 NaN

	// 좌측 피연산자가 정수 타입인 경우 나누는 수인 우측 피연산자는 0을 사용할 수 없다.
	// 컴파일은 정상적으로 되지만, 실행 시 ArithmeticException(예외)이 발생한다.
	
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x/y;	  // 실수 타입인 0.0 또는 0.0f로 나누면 ArithmeticException이 발생하지 않고, / 연산의 경과는 Infinity(무한대) 값을 가지며,
	//	double z = x%y;   // % 연산의 결과는 NaN(Not a Number)을 가진다. 
		
		System.out.println(Double.isInfinite(z));		// double타입의 값을 매개값으로 받아서 이 값이 Infinity 또는 NaN 이라면 true, 
		System.out.println(Double.isNaN(z));			// 그렇지 않다면 false를 리턴한다.
		
		System.out.println(z+2);	// 문제가 되는 코드 -> /, % 연산의 결과가 Infinity 또는 NaN이 나오면 다음 연산을 수행해서는 안 된다.
									// 이 값과 산술 연산을 하면 어떤 수와 연산하더라도 Infinity 와 NaN이 산출되어 데이터가 엉망이 될 수 있다.	
	}

}
