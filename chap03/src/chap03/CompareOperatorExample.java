package chap03;

public class CompareOperatorExample {		// 비교 연산자

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		
		char char1 = 'A';	// 유니코드 65
		char char2 = 'B';	// 유니코드 66
		boolean result4 = (char1 < char2);
		System.out.println("result4=" + result4);		
		
		System.out.println("-----------------------------------");
		
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);	// int 타입인 1을 보다 큰 타입인 double 타입으로 변환한다음 1.0 == 1.0으로 비교한다.
		
		double v4 = 0.1;
		float v5 = 0.1f;				// 이진 포맷의 기수를 사용하는 모든 부동소수점 타입은 0.1을 정확히 표현할 수가 없어서 0.1f는 0.1의 근사값으로 표현되어 0.10000000149011612와 같은 값이 되기 때문에 0.1보다 큰 값이 되어 버린다.
		System.out.println(v4 == v5);	
		System.out.println((float) v4 == v5);		// 피연산자 모두를 float 또는 정수로 변환해서 비교하면 된다.
		System.out.println((int)(v4*10) == (int)(v5*10));
		
	}

}
