// Employee interface
interface Employee {
    double calculateSalary();
    String getDetails();
}

// FullTimeEmployee class
class FullTimeEmployee implements Employee {
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String getDetails() {
        return "Full-Time Employee: " + name + ", Monthly Salary: $" + monthlySalary;
    }
}

// PartTimeEmployee class
class PartTimeEmployee implements Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getDetails() {
        return "Part-Time Employee: " + name + ", Hourly Rate: $" + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}

// Main class to test employee management system
public class EmployeeTest {
    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee("Alice", 3000);
        Employee partTimeEmp = new PartTimeEmployee("Bob", 20, 80);

        System.out.println(fullTimeEmp.getDetails());
        System.out.println("Full-Time Salary: $" + fullTimeEmp.calculateSalary());

        System.out.println(partTimeEmp.getDetails());
        System.out.println("Part-Time Salary: $" + partTimeEmp.calculateSalary());
    }
}
