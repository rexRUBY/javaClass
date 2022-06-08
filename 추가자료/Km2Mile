package exercise;

public class Km2Mile extends Converter{
	public Km2Mile(double km) {
		this.ratio=km;
	}
	protected double convert(double src) {
		return src/ratio;
	} 
	protected String srcString() {
		return "Km";
	}
	
	protected String destString() {
		return "mile";
	}
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
