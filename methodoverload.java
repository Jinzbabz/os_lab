import java.util.Scanner;

public class methodoverload {

	// Area of a circle
	public static double area(double radius) {
		return Math.PI * radius * radius;
	}

	// Area of a square
	public static double area(int side) {
		return (double) side * side;
	}

	// Area of a rectangle
	public static double area(double length, double breadth) {
		return length * breadth;
	}

	// Area of a triangle (third parameter differentiates signature)
	public static double area(double base, double height, boolean isTriangle) {
		return 0.5 * base * height;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\nChoose shape to compute area:");
			System.out.println("1. Circle");
			System.out.println("2. Square");
			System.out.println("3. Rectangle");
			System.out.println("4. Triangle");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice;
			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Invalid input. Try again.");
				continue;
			}

			switch (choice) {
				case 1: // Circle
					System.out.print("Enter radius: ");
					double r = Double.parseDouble(sc.nextLine());
					System.out.printf("Area of circle: %.4f\n", area(r));
					break;
				case 2: // Square
					System.out.print("Enter side (integer): ");
					int s = Integer.parseInt(sc.nextLine());
					System.out.printf("Area of square: %.4f\n", area(s));
					break;
				case 3: // Rectangle
					System.out.print("Enter length: ");
					double l = Double.parseDouble(sc.nextLine());
					System.out.print("Enter breadth: ");
					double b = Double.parseDouble(sc.nextLine());
					System.out.printf("Area of rectangle: %.4f\n", area(l, b));
					break;
				case 4: // Triangle
					System.out.print("Enter base: ");
					double base = Double.parseDouble(sc.nextLine());
					System.out.print("Enter height: ");
					double height = Double.parseDouble(sc.nextLine());
					System.out.printf("Area of triangle: %.4f\n", area(base, height, true));
					break;
				case 5:
					sc.close();
					System.out.println("Exiting.");
					return;
				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
	}
}

