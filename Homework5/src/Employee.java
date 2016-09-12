
 public abstract class Employee {
		private String name;
		private String gender;
		private String hiredate;
		private String phonenumber;
		private String address;
		
		private static final int LUNCHALLOW = 1800;
		private static final int TRANSPORTALLOW = 2000;
		private static final int ADDPAY1 = 5000;
		private static final int ADDPAY2 = 3000;
		
		
		public static int getLunchallow() {
			return LUNCHALLOW;
		}
		public static int getTRANSPORTALLOW() {
			return TRANSPORTALLOW;
		}
		
		public static int getADDPAY1() {
			return ADDPAY1;
		}
		
		public static int getADDPAY2() {
			return ADDPAY2;
		}

		public Employee(String name, String gender, String hiredate, String phonenumber, String address) {
			   this.name = name;
			   this.gender = gender;
			   this.hiredate = hiredate;
			   this.phonenumber = phonenumber;
			   this.address = address;
		}
		
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getHiredate() {
			return hiredate;
		}


		public void setHiredate(String hiredate) {
			this.hiredate = hiredate;
		}


		public String getPhonenumber() {
			return phonenumber;
		}


		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}

		public void display () {
			System.out.print("name = " + name+  ',');
			System.out.print("gender = " + gender+  ',');
			System.out.print("hiredate = " + hiredate+  ',');
			System.out.print("phonenumber = " + phonenumber+  ',');
			System.out.print("address = " + address+  ',');
		}
		public abstract double paySalary();
		
}// end of class
