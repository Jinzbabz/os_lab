import java.util.Scanner;

class Employee {
	protected int Empid;
	protected String Name;
	protected double Salary;
	protected String Address;

	public Employee(int empid, String name, double salary, String address) {
		this.Empid = empid;
		this.Name = name;
		this.Salary = salary;
		this.Address = address;
	}
}

class Teacher extends Employee {
	private String department;
	private String[] subjects;

	public Teacher(int empid, String name, double salary, String address, String department, String[] subjects) {
		super(empid, name, salary, address);
		this.department = department;
		this.subjects = subjects;
	}

	public void display() {
		System.out.println("-----------------------------");
		System.out.println("Empid: " + Empid);
		System.out.println("Name: " + Name);
		System.out.println("Salary: " + Salary);
		System.out.println("Address: " + Address);
		System.out.println("Department: " + department);
		System.out.print("Subjects taught: ");
		if (subjects != null && subjects.length > 0) {
			for (int i = 0; i < subjects.length; i++) {
				System.out.print(subjects[i]);
				if (i < subjects.length - 1) System.out.print(", ");
			}
		}
		System.out.println();
	}
}

public class employee_search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of teachers: ");
		int n = 0;
		try {
			n = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Invalid number. Exiting.");
			sc.close();
			return;
		}

		Teacher[] teachers = new Teacher[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for teacher " + (i + 1) + ":");
			System.out.print("Empid: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = Double.parseDouble(sc.nextLine());
			System.out.print("Address: ");
			String address = sc.nextLine();
			System.out.print("Department: ");
			String dept = sc.nextLine();
			System.out.print("Subjects taught (comma-separated): ");
			String subjectsLine = sc.nextLine();
			String[] subjects = subjectsLine.trim().isEmpty() ? new String[0] : subjectsLine.split("\\s*,\\s*");

			teachers[i] = new Teacher(id, name, salary, address, dept, subjects);
		}

		System.out.println("\n--- Teachers' Details ---");
		for (Teacher t : teachers) {
			t.display();
		}

		sc.close();
	}
}

