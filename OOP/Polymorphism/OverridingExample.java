class Employee {
    private String name, department;
    private float salary;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getDepartment() {return department;}
    public void setDepartment(String department) {this.department = department;}
    public float getSalary() {return salary;}
    public void setSalary(float salary) {this.salary = salary;}

    public Employee(String name, String department, float salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class SalariedEmployee extends Employee {
    float bonus;

    public float getBonus() {return bonus;}
    public void setBonus(float bonus) {this.bonus = bonus;}

    @Override
    public float getSalary() {return super.getSalary() + bonus;}
    public SalariedEmployee(String name, String department, float salary, float bonus) {
        super(name, department, salary);
        this.bonus = bonus;
    }
}
class DailyEmployee extends Employee {
    private float workDailyPrice;
    private int dailyRate;

    public float getWorkDailyPrice() {return workDailyPrice;}
    public void setWorkDailyPrice(float workDailyPrice) {this.workDailyPrice = workDailyPrice;}
    public int getDailyRate() {return dailyRate;}
    public void setDailyRate(int dailyRate) {this.dailyRate = dailyRate;}

    @Override
    public float getSalary() {return workDailyPrice*dailyRate;}
    public DailyEmployee(String name, String department, float salary, float workDailyPrice , int dailyRate) {
        super(name, department, salary);
        this.workDailyPrice = workDailyPrice;
        this.dailyRate = dailyRate;
    }
}

public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee("Mariam", "Developer", 4000);
        SalariedEmployee e2 = new SalariedEmployee("Yara", "Manger", 6500,50);
        DailyEmployee e3 = new DailyEmployee("Yara", "Manger", 6500,500,2);
        System.out.println("Employee Salary = " + e1.getSalary());
        System.out.println("Salaried Employee Salary = " + e2.getSalary());
        System.out.println("Daily Employee Salary = " + e3.getSalary());
        System.out.println("-----------------------------------------");
        // or in different way
        Employee e = new Employee("Mariam", "Developer", 4000);
        System.out.println("Employee Salary = " + e.getSalary());
        e = new SalariedEmployee("Yara", "Manger", 6500,50);
        System.out.println("Salaried Employee Salary = " + e.getSalary());
        e = new DailyEmployee("Yara", "Manger", 6500,500,2);
        System.out.println("Daily Employee Salary = " + e.getSalary());
        // e. can see all data in the superclass and the common methods
    }
}
