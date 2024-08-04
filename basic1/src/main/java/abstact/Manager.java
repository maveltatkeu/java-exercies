package abstact;

public class Manager extends Employee {

    protected int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        return this.salary + bonus;
    }

    @Override
    public void displayInfo() {
        // Print the manager's name
        System.out.println("Manager Name: " + name);
        // Print the base salary
        System.out.println("Base Salary: $" + salary);
        // Print the bonus
        System.out.println("Bonus: $" + bonus);
        // Print the total salary
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
