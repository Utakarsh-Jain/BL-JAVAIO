import java.io.*;
public class EmployeePayrollUC5 {
    public static void main(String[] args) {
        File file = new File("payroll.txt");

        int count = 0;

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;

            System.out.println("Employee Payroll Details:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                count++;
            }

            System.out.println("Total Entries: " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
