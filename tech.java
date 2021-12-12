
public class TechDepartment extends SuperDepartment {
	
	String stackInfo; 
	
	public TechDepartment() {
		this.dName = " Tech Department ";
		this.Work = " Complete coding of Module 1";
		this.DeadLine = " Completed by EOD ";
		this.stackInfo = " core Java";
	}
	
	public String departmentName() {
		return this.dName;
	}
	
	public String getTodaysWork() {
		return this.Work;
	}
	
	public String getWorkDeadline() {
		return this.DeadLine;
	}
	
	public String getTechStackInformation() {
		return this.stackInfo;
	}
	
}
