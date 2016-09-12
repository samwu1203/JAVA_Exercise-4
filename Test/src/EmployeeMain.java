public class EmployeeMain {
 public static void main(String[] args) {
    Employee[] e = new Employee[6];
	e[0] = new Firstmgr("Tom", "M", "19831203", "09XXXX", "ABCD", 60000);
	e[1] = new Secmgr("Mary", "F", "19850304", "09XXXX", "EFGH", 50000);
	e[2] = new Staff("James", "M", "19900401", "09XXXX", "IJKM", 40000);
	e[3] = new Staff("Peter", "M", "19951231", "09XXXX", "ASJHEY", 45000);
	e[4] = new Permanent("Barry", "M", "19950731", "09XXXX", "NOPQ", 35000, 5);
	e[5] = new Permanent("Jason", "F", "19960321", "09XXXX", "GHKIYTT", 30000, 5);
	for (int i = 0; i < e.length; i++) {
	e[i].display();	
    System.out.println("Salary= "+e[i].paySalary());
	}

	}
}

