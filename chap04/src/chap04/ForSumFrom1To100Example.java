package chap04;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100합 : " + sum);
		
		System.out.println("----------------------------");
		
		
		int sum2 = 0;
		int j = 0;
		
		for(j=0; j<=100; j++) {
			sum2 += j;
		}
		
		System.out.println("1~" + (j-1) + "합 : " + sum2);
	}

}
