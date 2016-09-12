import java.io.*;

public class Demo {
 public static void main(String[] args) {
    String[] element = new String[7];
    Employee[] e = new Employee[6];
    String str;
    try {
		BufferedReader in = new BufferedReader(new FileReader("res/employee.txt"));
		while ((str = in.readLine()) != null)
		element =str.split(",");
		for (int i=0;i<e.length;i++)
	    for (int j=0;j<element.length;j++){
	    	
		    System.out.print(element[j]+" ");
		    System.out.println(i);
	    }
		in.close();
	} catch (IOException es) {
		es.printStackTrace();
	}
    
    

	}
}

