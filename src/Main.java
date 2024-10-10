public class Main {
    public static void main(String[] args) {
        EmployeeBook test = new EmployeeBook();
        System.out.println(test.addEmployee(new Employee("test", 3000, 3)));
        test.addEmployee(new Employee("test1", 2000, 2));
        test.getAllEmployeeInfo();
        test.removeEmployee(2);
        test.getAllEmployeeInfo();
        System.out.println(test.getEmployeeById(1));
    }
}