

public class SuperDepartment {
	
	public String dName;
	public String Work;
	public String DeadLine;
	public String holiday;
	
	public SuperDepartment() {
		this.dName = " Super Deprtment ";
		this.Work = " No Work. as of now";
		this.DeadLine = " Nil. ";
		this.holiday = " Today is not an holiday";
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
	
	public String isTodayAHoliday() {
		return this.holiday;
	}
}


