package p245;

public class Person {
	
	// final필드는 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행도중에 수정할 수 없다.
	
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
