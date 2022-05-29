package chap03;

public class StringEqualsExample {	// 문자열 비교

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);		// 문자열 리터럴이 동일하다면 동일한 String객체를 참조하도록 되어있음
		System.out.println(strVar1 == strVar3);		// 변수 strVar3은 객체생성연산자인 new로 생성한 새로운 String객체의 번지값을 가지고 있다.
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); // String 객체의 문자열만을 비교하고 싶다면 equals()메소드를 사용
		System.out.println(strVar1.equals(strVar3));
		
	}

}
