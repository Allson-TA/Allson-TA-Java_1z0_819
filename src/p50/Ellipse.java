package p50;

public interface Ellipse {
	default double calculateSurfaceArea(double majorR , double minorR) {
		return Math.PI * majorR * minorR;
	}
}
