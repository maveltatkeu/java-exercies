package abstact;

public abstract class Employee {
    protected int salary;
    protected String name;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public abstract int calculateSalary();

    public abstract void displayInfo();
}
