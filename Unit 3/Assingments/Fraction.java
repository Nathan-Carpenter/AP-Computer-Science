// Adds and multiplies fractions

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction() {
		numerator = 1;
		denominator = 1;
	}

	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public Fraction add(Fraction other) {
		int num1 = numerator;
		int num2 = other.numerator;

		int commonD = commonDenom(denominator, other.denominator);
		
		num1 *= commonD / denominator;
		num2 *= commonD / other.denominator;


		int newNum = num1 + num2;
		int newDen = commonD;

		Fraction newFrac = new Fraction(newNum, newDen);
		System.out.println(toString(newFrac));
		return newFrac;
	}

	public Fraction subtract(Fraction other) {
		int num1 = numerator;
		int num2 = other.numerator;

		int commonD = commonDenom(denominator, other.denominator);
		
		num1 *= commonD / denominator;
		num2 *= commonD / other.denominator;


		int newNum = num1 - num2;
		int newDen = commonD;

		Fraction newFrac = new Fraction(newNum, newDen);
		System.out.println(toString(newFrac));
		return newFrac;
	}

	public int commonDenom(int den1, int den2){
		int x = 0;
		int range = den1 * den2;
		int min = 0;

		if (den1 > den2){
			min = den1;
		}
		else {
			min = den2;
		} 
		
		for(x = min; x < range; x++){
			if(x % den1 == 0 && x % den2 == 0){
				break;
			}
		}
		return x;
	}

    public Fraction multiply(Fraction other) {
		int newNum = numerator * other.numerator;
		int newDen = denominator * other.denominator;

		Fraction newFrac = new Fraction(newNum, newDen);
		
		System.out.println(toString(newFrac));
		return newFrac;
	}

	public Fraction divide(Fraction other){
		int newNum = numerator * other.denominator;
		int newDen = denominator * other.numerator;

		Fraction newFrac = new Fraction(newNum, newDen);
		
		System.out.println(toString(newFrac));
		return newFrac;
	}

	public String toString(Fraction fraction){
		return fraction.numerator + "/" + fraction.denominator;
	}
}
