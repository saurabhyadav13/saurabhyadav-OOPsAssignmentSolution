

public class HrDepartment extends SuperDepartment {
	
	String activity; 
	
	public HrDepartment() {
		this.dName = " HR Department ";
		this.todWork = " Fill today�s timesheet and mark your attendance";
		this.workDeadLine = " Complete by EOD ";
		this.activity = " team Lunch";
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
	
	public String doActivity() {
		return this.activity;
	}
	
}
