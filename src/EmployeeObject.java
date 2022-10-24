public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee = new Employee("Yusuf", 2000, 45, 1985);

        System.out.println(employee.toString());
        System.out.println("tax: " + employee.tax());
        System.out.println("bonus: " + employee.bonus());
        System.out.println("maaş artışı: " + employee.raiseSalary());

        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (employee.getSalary() + employee.bonus() + employee.tax()));
        System.out.println("Toplam Maaş: " + (employee.getSalary() + employee.bonus() + employee.tax() + employee.raiseSalary()));

    }
}