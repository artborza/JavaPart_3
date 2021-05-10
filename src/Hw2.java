
public class Hw2 {
	
	public static void main(String[] agrs) {
		Employee[] employee = new Employee[3];
		for(int i=0;i<employee.length;i++) {
			employee[i]= new Employee("name"+i,"latname"+i,i*10000,"CEO");
		}
	}
}
