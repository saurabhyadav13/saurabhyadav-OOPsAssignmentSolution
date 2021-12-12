

public class AdminDepartment extends SuperDepartment {
	
	
	public AdminDepartment() {
		this.dName = " Admin Department ";
		this.todWork = " Complete your documents Submission";
		this.workDeadLine = " Complete by EOD ";
	}
	
	public String departmentName() {
		return this.dName;
	}
	
	public String getTodaysWork() {
		return this.todWork;
	}
	
	public String getWorkDeadline() {
		return this.workDeadLine;
	}	
}
