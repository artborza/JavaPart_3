
public class CEO extends Employee {



	public CEO(String firstnameInput, String lastnameInput, double salaryInput, String positionInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() * 2;
	}

	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstName + "!");
	}

	public void fire(Employee employee) {
		System.out.println(employee.firstName + " has been fired!");
	}

}
