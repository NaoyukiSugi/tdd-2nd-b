
public class Kadai2_1 {
	public int calc_area(double val){
		double s = val * val * Math.PI;
		return (int) Math.round(s);
	}
	
	public static void main(String[] args){
		Kadai2_1 kadai = new Kadai2_1();
		double d = 75.47;
		System.out.println(kadai.calc_area(d));
	}
}
