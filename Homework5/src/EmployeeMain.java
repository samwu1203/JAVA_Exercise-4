import java.io.*;

public class EmployeeMain {
 public static void main(String[] args) {
	    String[] element = new String[8];
	    Employee[] e = new Employee[6];
	    String str;
	    try {
			BufferedReader in = new BufferedReader(new FileReader("res/emp.txt"));
			for (int i=0;i<e.length;i++){
			str = in.readLine();
			element =str.split(",");
			String name = element[1];
			String gender = element[2];
			String hiredate = element[3]; 
			String phonenumber = element[4];
			String address = element[5];
			double salary =Double.parseDouble(element[6]);
			int workhour = Integer.parseInt(element[7]);
		
		    if (element[0].equals("一級主管")){
		    	e[i]= new Firstmgr(name, gender, hiredate, phonenumber, address, salary);

		    } else if(element[0].equals("二級主管")){
		    	e[i]= new Secmgr(name, gender, hiredate, phonenumber, address, salary);
	
		    } else if(element[0].equals("一般職員")){
		    	e[i]= new Staff(name, gender, hiredate, phonenumber, address, salary);

		    } else {
		    	e[i]= new Permanent(name, gender, hiredate, phonenumber, address, salary, workhour);

		    }	// end of else
		    	e[i].display();	
		        System.out.println("Salary= "+e[i].paySalary()); 
			 }// end of for	 
			 	
			in.close();
		} catch (IOException es) {
			es.printStackTrace();
		}// end of catch
    
 }// end of main
}// end of class

