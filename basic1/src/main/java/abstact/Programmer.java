package abstact;

public class Programmer extends Employee {

    // Private variable to store overtime hours
    private int overtimeHours;
    // Private variable to store hourly rate
    private int hourlyRate;

    // Constructor to initialize name, baseSalary, overtimeHours, and hourlyRate
    public Programmer(String name, int salary, int overtimeHours, int hourlyRate) {
        // Calling the constructor of the superclass (Employee)
        super(name, salary);
        // Setting the overtime hours
        this.overtimeHours = overtimeHours;
        // Setting the hourly rate
        this.hourlyRate = hourlyRate;
    }

    // Overriding the calculateSalary method
    @Override
    public int calculateSalary() {
        // Calculating the total salary by adding baseSalary and the product of overtimeHours and hourlyRate
        return salary + (overtimeHours * hourlyRate);
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        // Printing the programmer's name
        System.out.println("Programmer Name: " + name);
        // Printing the base salary
        System.out.println("Base Salary: $" + salary);
        // Printing the overtime hours
        System.out.println("Overtime Hours: " + overtimeHours);
        // Printing the hourly rate
        System.out.println("Hourly Rate: $" + hourlyRate);
        // Printing the total salary
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
