
public class Permanent extends Staff {
	private double salary;
	private int workhour;
	
public Permanent(String name, String gender, String hiredate, String phonenumber, String address, double salary, int workhour) {			   
			
	   super(name, gender, hiredate, phonenumber, address, salary);
	   this.workhour=workhour;
}	


	public int getWorkhour() {
	return workhour;
}


public void setWorkhour(int workhour) {
	this.workhour = workhour;
}


	public double paySalary() {
		salary=super.paySalary()+(super.paySalary()/240*1.5*workhour);
		return salary;	
	}
  
}

