import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {

	static int i=1;
	String name;
	float salary;
	String dep_name;
	String company_name= "bebo";
	static int id=1;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Employee() throws IOException{
		System.out.println("Company Name= " +company_name);
		System.out.println("Employee Id= " +i);
		i++;
		System.out.println("Enter Employee Name");
		name=br.readLine();
		System.out.println("Enter Department Name");
		dep_name=br.readLine();
		System.out.println("Enter employee salary= ");
		salary=Float.parseFloat(br.readLine());
	}
	void display() {
		System.out.println("Employee Id= " +id +" "+"Name= "+name +"Department= "+dep_name +" "+"Salary= "+salary);
		id++;
	}
	
	
	public static void main(String[] args) throws IOException {
		Employee e1= new Employee();
		Employee e2=new Employee();
		e1.display();
		e2.display();
		

	}

}
