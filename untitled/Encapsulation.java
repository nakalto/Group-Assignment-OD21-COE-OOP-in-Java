class Employee {
    private String name;
    private double salary;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }
}

public class Mainesc {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setSalary(50000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
