package depinfo;

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment d1 = new AdminDepartment();
		HrDepartment d2 = new HrDepartment();
		TechDepartment d3 = new TechDepartment();
		
		System.out.println(" Welcome to " + d1.dName);
		System.out.println(d1.todWork);
		System.out.println(d1.workDeadLine);
		System.out.println(d1.holiday);
		
		System.out.println();
		
		System.out.println(" Welcome to " + d2.dName);
		System.out.println(d2.activity);
		System.out.println(d2.todWork);
		System.out.println(d2.workDeadLine);
		System.out.println(d2.holiday);
		
		System.out.println();
		
		System.out.println(" Welcome to " + d3.dName);
		System.out.println(d3.todWork);
		System.out.println(d3.workDeadLine);
		System.out.println(d3.stackInfo);
		System.out.println(d3.holiday);
		

	}

}
