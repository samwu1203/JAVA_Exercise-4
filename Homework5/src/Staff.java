
public class Staff extends Employee {
	private double salary;	
    
	public Staff(String name, String gender, String hiredate, String phonenumber, String address, double salary) {			   
			
	   super(name, gender, hiredate, phonenumber, address);
	   this.salary = salary;
}	
		
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double paySalary() {
		return salary;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
