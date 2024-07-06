package p50;

public interface Rectangle {
	
	default double calculateSurfaceArea(double l , double w) {
		return 1*w;
	}
	
}
