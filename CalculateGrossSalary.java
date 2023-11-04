import java.util.Scanner;
public class CalculateGrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter total allowances: ");
        double allowances = scanner.nextDouble();
        System.out.print("Enter total deductions: ");
        double deductions = scanner.nextDouble();
        double grossSalary = basicSalary + allowances - deductions;
        System.out.println("Gross Salary: " + grossSalary);
        scanner.close();
    }
}
