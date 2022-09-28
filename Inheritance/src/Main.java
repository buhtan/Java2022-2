
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee=new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		employee.age=15;
		System.out.println(employee.age);
		employeeManager.Add();

	}

}
