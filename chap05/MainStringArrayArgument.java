package chap05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");   // 프로그램을 그냥 실행하면 나오는 결과
			System.exit(0); 	// 프로그램 강제 종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);		// 문자열을 정수로 전환
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);  // 매개값을 주고 난 뒤 실행하면 나오는 결과
															// run - run configuration - argument에서 매개값 추가
		
	}

}
