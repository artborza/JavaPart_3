
public class Day10 {
	public static void main(String[] args) {
		Employee dang = new Employee("Dang","Red", 10000,"CEO");
		System.out.println(dang.getSalary()); // 10000
		dang.hello(); // Hello Dang 
		CEO ceo = new CEO("Somchai","Sudlor", 30000,"CEO");
		System.out.println(ceo.getSalary()); // 60000
		ceo.hello(); 
		// Hi, nice to meet you. Somchai!
		ceo.fire(dang); 
		// Dang has been fired!}
	}

}
