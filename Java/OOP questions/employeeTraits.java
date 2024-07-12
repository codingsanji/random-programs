package Java;
import java.util.*;

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = 0;
    }

    public double salaryCalc(double months, double salPerHour, double hoursPerWeek) {
        int weeks = 4;
        salary = months * weeks * hoursPerWeek * salPerHour;
        return salary;
    }

    public double updateSalary(double percentageIncrease) {
        if (percentageIncrease > 0) {
            salary += salary * (percentageIncrease / 100);
        }
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }
}

public class employeeTraits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the employee's job title: ");
        String jobTitle = scanner.nextLine();
        Employee emp = new Employee(name, jobTitle);

        System.out.print("Enter the number of months worked: ");
        double months = scanner.nextDouble();
        System.out.print("Enter the hourly rate: ");
        double salPerHour = scanner.nextDouble();
        System.out.print("Enter the number of hours worked per week: ");
        double hoursPerWeek = scanner.nextDouble();
        emp.salaryCalc(months, salPerHour, hoursPerWeek);

        
        System.out.println("Do you want to increase and update salary? (enter 1 for yes and 0 for no)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the % increase: ");
            double percentageIncrease = scanner.nextDouble();
            emp.updateSalary(percentageIncrease);
        } else if (choice != 0) {
            System.out.println("Invalid value. Please run the program again and enter either 1 or 0.");
        }

        System.out.println("Here are your employee details: ");
        emp.displayEmployeeDetails();

        scanner.close();
    }
}
