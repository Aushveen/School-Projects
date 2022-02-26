public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public void raiseSalary(double byPercent){
        this.salary = this.salary + (this.salary * (byPercent/100));
    }
}
