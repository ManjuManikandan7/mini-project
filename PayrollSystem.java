class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary : " + basicSalary);
    }
}

class Payroll extends Employee {
    double hra = 5000;
    double da = 3000;

    Payroll(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    void calculateSalary() {
        double totalSalary = basicSalary + hra + da;

        display();
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Total Salary : " + totalSalary);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {

        Payroll p = new Payroll(101, "Manju", 40000);

        System.out.println("===== Payroll System =====");
        p.calculateSalary();
    }
}