
public class Firstmgr extends Employee {
	private double salary;
	
	public Firstmgr(String name, String gender, String hiredate, String phonenumber, String address, double salary) {
		   super(name, gender, hiredate, phonenumber, address);
		   this.salary=salary;
		}
		public double getSalary() {
			return salary;
		}
	
		public void setSalary(double salary) {
			this.salary = salary;
		}
	
		
		public double paySalary() {
			salary=salary+Employee.getLunchallow() + Employee.getTRANSPORTALLOW() + Employee.getADDPAY1();
			return salary;
		
		}

}
