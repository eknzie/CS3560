public class Employee {
    protected String name;
    protected int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public double calculateSalary() {
        return hours * 20;
    }

    public int getHours() {
        return hours;
    }
}

public class Professor extends Employee {
    private String field;

    public Professor(String name, int hours, String field) {
        super(name, hours);
        this.field = field;
    }

    @Override
    public double calculateSalary() {
        return hours * 30;
    }
}

public class Staff extends Employee {
    private int role;

    public Staff(String name, int hours, int role) {
        super(name, hours);
        this.role = role;
    }
}