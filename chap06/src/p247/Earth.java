package p247;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	// 상수는 static 이면서 final
	// static final 필드는 객체마다 저장되지 않고, 클래스에만 포함된다. 한 번 초기값이 저장되면 변경할 수 없다.
	// 상수 이름은 모두 대문자로 작성하는 것이 관례
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
