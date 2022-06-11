package p244;

public class SingletonExample {

	public static void main(String[] args) {
	
		/*
		Singleton obj1 = new Singleton();  컴파일 에러
		Singleton obj2 = new Singleton();
		*/
		
		Singleton obj1 = Singleton.getIstance();
		Singleton obj2 = Singleton.getIstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
