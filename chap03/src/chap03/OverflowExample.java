package chap03;

public class OverflowExample {		// 오버플로우

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x*y;		// int 타입에 저장될 수 있는 값의 범위를 초과함
		System.out.println(z);
		
		long a = 1000000;
		long b = 1000000;
		long c = a*b;		// 올바른 값을 얻기 위해서 변수 a,b 둘 중 하나라도 long 타입이 되어야하고, 변수 c가 long 타입이어야 한다. 
		System.out.println(c);
		
	}

}
