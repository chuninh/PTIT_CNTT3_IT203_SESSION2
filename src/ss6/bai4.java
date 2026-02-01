package ss6;

class Employee {
    private String empId;
    private String empName;
    private double salary;

    Employee() {
        this.empId = "Chua co";
        this.empName = "Chua co";
        this.salary = 0;
    }

    Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.salary = 0;
    }

    Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Ma NV: " + empId);
        System.out.println("Ten NV: " + empName);
        System.out.println("Luong: " + salary);
        System.out.println("----------------------");
    }
}

public class bai4 {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("NV001", "Nguyen Van A");

        Employee e3 = new Employee("NV002", "Tran Thi B", 1500);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
