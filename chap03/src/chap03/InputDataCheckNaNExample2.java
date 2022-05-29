package chap03;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput); 	// Double타입으로 변환
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {			// 변수 val의 값이 NaN인지를 검사
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
	}

}
