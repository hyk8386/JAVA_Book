package chap03;

public class CheckOverflowExample {		// 산술 연산 전에 오버플로우를 탐지

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);	// safeAdd() 메소드는 두 개의 매개값을 더해도 안전한 경우에만 더한 결과를 리턴함
			System.out.println(result);	
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
	
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left+right;
	}

}
