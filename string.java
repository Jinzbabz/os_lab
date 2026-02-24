import java.util.Scanner;

public class string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		StringBuffer sb = new StringBuffer(input);
		System.out.println("Capacity of StringBuffer: " + sb.capacity());

		sb.reverse();
		String reversedUpper = sb.toString().toUpperCase();
		System.out.println("Reversed and uppercased: " + reversedUpper);

		System.out.print("Enter another string to append: ");
		String toAppend = sc.nextLine();

		StringBuffer result = new StringBuffer(reversedUpper);
		result.append(toAppend);
		System.out.println("After append: " + result.toString());

		sc.close();
	}
}
