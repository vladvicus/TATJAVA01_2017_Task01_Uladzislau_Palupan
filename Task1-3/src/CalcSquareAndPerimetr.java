import java.util.Scanner;

public class CalcSquareAndPerimetr {
	static double a;
	static double b;

	static double inputDouble() {
		double x = 0;
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextDouble()) {
			System.out.println("You input not a real number");
			System.out.println("Input real number");
			
			sc = new Scanner(System.in);
		}
		x = sc.nextDouble();

		return x;
	}

	static double perimeter(double a, double b) {
		double c = Math.sqrt(a * a + b * b);
		return (a + b + c);

	}

	static double square(double a, double b) {
		return a * b / 2;

	}

	public static void main(String[] args) {

		if ((args.length > 2)||args.length==1) {
			System.out
					.println("Input two real numbers parameters for catets of squareangle triangle:");
		} else if(args.length==2){
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);

		}
		if (args.length == 0) {

			System.out.println("Input first real positive number for a: ");
			a = Math.abs(inputDouble());
			
			System.out.println("Input second real positive number for b: ");
			b =Math.abs(inputDouble());

			System.out.printf("\n%40s %10.4f","Perimetr of squareangle triangle is:", perimeter(a, b));
			System.out.printf("\n%40s %10.4f","Square of squareangle triangle is:", square(a, b));
		}
	}

}
