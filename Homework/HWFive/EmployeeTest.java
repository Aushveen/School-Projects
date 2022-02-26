public class EmployeeTest {
    public static void main(String[] args){
        Employee aushveen = new Employee("Aushveen", 100000);
        System.out.println("Employee name: " + aushveen.getName());
        System.out.println("Employee Salary: " + aushveen.getSalary());
        aushveen.raiseSalary(20);
        System.out.println("Employee new Salary after 20 percent raise: " + aushveen.getSalary());

    }
}
