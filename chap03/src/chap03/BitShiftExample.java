package chap03;

public class BitShiftExample {	// 비트 이동 연산자

	public static void main(String[] args) {
		System.out.println("1 << 3 = " + (1 << 3));		 // 1의 각 비트를 3만큼 왼쪽으로 이동 (빈자리는 0으로 채워진다.)
		System.out.println("-8 >> 3 = " + (-8 >> 3));	 // -8의 각 비트를 3만큼 오른쪽으로 이동 (빈자리는 -8의 최상위부호비트와 같은 값으로 채워진다.)
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));  // -8의 각 비트를 3만큼 오른쪽으로 이동 (빈자리는 0으로 채워진다.)
	}

}
