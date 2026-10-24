import java.util.Scanner;
class EmployeePayroll {
    int id;
    String name;
    double salary;
    EmployeePayroll(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
public class EmployeePayrollUC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        EmployeePayroll employee =
                new EmployeePayroll(id, name, salary);
        System.out.println("\nEmployee Payroll Details:");
        employee.display();
        sc.close();
    }
}
