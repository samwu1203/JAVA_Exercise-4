
public class Secmgr extends Employee {
	
		private double salary;
		
			
		public Secmgr(String name, String gender, String hiredate, String phonenumber, String address, double salary) {
			   
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
				salary=salary+ Employee.getLunchallow() + Employee.getTRANSPORTALLOW() + Employee.getADDPAY2();
				return salary;
				
			}
	
	
} // end of class
