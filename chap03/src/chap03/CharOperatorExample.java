package chap03;

public class CharOperatorExample {		// char 타입 연산

	public static void main(String[] args) {
		char c1 = 'A'+1;
		char c2 = 'A';
	//	char c3 = c2+1;		// 컴파일 에러 -> c2에 1을 더하면 c2는 int 타입으로 변환되고 1과 연산이 되기때문에 산출타입은 int타입이 된다.
		char c3 = (char) (c2+1);	// char 타입으로 강제 타입 변환을 해야함
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
	}

}
