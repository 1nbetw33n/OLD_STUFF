package Prog2.Misc;


public class Heron {
	
	public static double heron(final double A) {
		double x_ = A;
		double x;
		
		do {
			System.err.println(x_);
			x = x_;
			x_ = 0.5 * (x_ + A / x_);
		} while (x_ != x);
		return x;
	}
	
	public static void main(String[] args) {
		System.err.println(Heron.heron(123456789));
	}

}