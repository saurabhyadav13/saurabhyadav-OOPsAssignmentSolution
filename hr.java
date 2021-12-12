

public class HrDepartment extends SuperDepartment {
	
	String activity; 
	
	public HrDepartment() {
		this.dName = " HR! Deprtment ";
		this.Work = " Fill today,s timesheet and mark yours  attendence";
		this.DeadLine = " Completed by EOD ";
		this.activity = " teams Lumch";
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
	
	public String doActivity() {
		return this.activity;
	}
	
}
