package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(Employee.getSerialNum());
		
		Employee emplyeeKim = new Employee();
		emplyeeKim.setEmployeeName("김유신");
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(emplyeeKim.getEmployeeName() + "님의 사번은 " + emplyeeKim.getEmployeeId());
	}

}
