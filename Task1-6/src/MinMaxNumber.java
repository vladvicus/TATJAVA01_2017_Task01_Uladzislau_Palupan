import java.util.Scanner;

public class MinMaxNumber  {
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

	public static void main(String[] args) {
		System.out.println("Input first real positive number --> x: ");
		double x = inputDouble();

		System.out.println("Input second real positive number -->y: ");
		double y = inputDouble();

		System.out.println("Input second real positive number -->z: ");
		double z = inputDouble();
		System.out.println("x=" + x + " y=" + y + " z=" + z);
		double[] arr = { x, y, z };
		double min = arr[0];
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("Sum of min and max-->" + (max + min));
	}

	

}
