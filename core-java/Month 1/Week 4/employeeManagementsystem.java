class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void getRole() {
        System.out.println("I am an Employee");
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
    void getRole() {
        System.out.println("I am an Developer");
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
    void getRole() {
        System.out.println("I am an Manager");
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
    }
}

public class employeeManagementsystem {
    public static void main(String[] args) {
        Employee e1 = new Manager("Rishi", 200000);
        e1.getRole();
        Employee e2 = new Developer("Vishu", 44800);
        e2.getRole();
        Employee e3 = new Employee("Sujal", 15000);
        e3.getRole();
    }
}
