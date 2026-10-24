import java.io.*;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + "," + name + "," + salary;
    }
}

public class EmployeePayrollUC4 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 35000));
        employees.add(new Employee(102, "Priya", 42000));
        employees.add(new Employee(103, "Amit", 30000));

        File file = new File("payroll.txt");

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(file))) {

            for (Employee employee : employees) {
                writer.write(employee.toString());
                writer.newLine();
            }

            System.out.println("Payroll written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        // Count entries
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            int count = 0;

            while (reader.readLine() != null) {
                count++;
            }

            System.out.println("Total Entries: " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
