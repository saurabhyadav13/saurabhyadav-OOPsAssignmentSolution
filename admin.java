

public class AdminDepartment extends SuperDepartment {
	
	
	public AdminDepartment() {
		this.dName = " Admin Department ";
		this.Work = " Complete your documents Submission";
		this.DeadLine = " Complete by EOD ";
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
}
