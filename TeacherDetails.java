import java.util.Scanner;

// Step 2: Employee class
class Employee {
    int empid;
    String name;
    double salary;
    String address;

    // Step 3: Constructor to initialize data members
    Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

// Step 4: Teacher class inheriting Employee
class Teacher extends Employee {
    String department;
    String subject;

    // Step 6: Constructor
    Teacher(int empid, String name, double salary, String address,
            String department, String subject) {

        // Call parent constructor
        super(empid, name, salary, address);

        // Initialize Teacher data members
        this.department = department;
        this.subject = subject;
    }

    // Step 7: Display function
    void display() {
        System.out.println("Employee ID : " + empid);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
        System.out.println("Address     : " + address);
        System.out.println("Department  : " + department);
        System.out.println("Subject     : " + subject);
        System.out.println("-----------------------------");
    }
}

// Step 8: Main class
public class TeacherDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 9: Read number of teachers
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Step 10: Create array of Teacher objects
        Teacher[] t = new Teacher[n];

        // Step 11: Read details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Subject Taught: ");
            String subject = sc.nextLine();

            // Create object
            t[i] = new Teacher(empid, name, salary, address, department, subject);
        }

        // Step 12 & 13: Display details
        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}