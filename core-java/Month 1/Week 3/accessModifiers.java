class Employee {
    private int id;
    private String name;
    private double salary;

    public void setValue(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getid() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setValue(10, "RISHI", 44800);
        System.out.println("Name = "+e1.getName());
        System.out.println("ID = "+e1.getid());
        System.out.println("Salary = "+e1.getSalary());
    }
}
