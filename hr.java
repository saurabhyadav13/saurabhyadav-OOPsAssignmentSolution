

public class HrDepartment extends SuperDepartment {
	
	String activity; 
	
	public HrDepartment() {
		this.dName = " HR Department ";
		this.Work = " Fill today�s timesheet and mark your attendance";
		this.DeadLine = " Complete by EOD ";
		this.activity = " team Lunch";
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
