import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Emp_Record {
	static int i=1;
	int emp_id=1;
	String emp_name;
	int total_leaves=20;
	double total_salary;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Emp_Record() throws IOException{
		
		System.out.println("Employee Id= " +i);
		i++;
		System.out.println("Enter Employee Name");
		emp_name=br.readLine();
		
	}
	void calculate_salary() throws NumberFormatException, IOException {
		double basic_salary,hra,pf;
		System.out.println("Enter basic salary");
		basic_salary=Double.parseDouble(br.readLine());
		hra=basic_salary*50/100;
		pf=basic_salary*12/100;
		total_salary=basic_salary+hra-pf;
		System.out.println("Total salary= " +total_salary);
	}
	void balance_leaves() throws NumberFormatException, IOException {
		System.out.println("NO. of leaves req.");
		int n=Integer.parseInt(br.readLine());
		int r;
		if(n<=total_leaves) {
			r=total_leaves-n;
			System.out.println("Congrats!!"+" " +n +" "+"leaves granted");
			System.out.println("Remaining leaves= " +r);
		}
		else {
			System.out.println("sorry, limit exceeds");
		}
	}
	
	public static void main(String[] args) throws IOException {
	Emp_Record e1=new Emp_Record();
	e1.calculate_salary();
	e1.balance_leaves();
	}

}
