package chap03;

public class AccuracyExample {

	public static void main(String[] args) {	// 정확하게 계산할 때는 부동소수점 타입을 사용하지 않는다.
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple-number*pieceUnit;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result + " 조각이 남는다.");
		
		
		System.out.println("----------------------------------------");
		
		
		int melon = 1;
		
		int totalPieces = melon*10;
		int num = 7;
		int temp = totalPieces-num;
		
		double result2 = temp/10.0;
		
		System.out.println("멜론 한개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result2 + " 조각이 남는다.");
	}

}
