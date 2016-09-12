import java.util.*;
public class MyCalendar {

	public static void main(String[] args) {
    int year = Integer.parseInt(args[0]);
    int month = Integer.parseInt(args[1]);
    if (month==0){
    	for (int k=1;k<=12;k++){
    		month=k;
    Calendar cal = new GregorianCalendar(year,(month-1),1);
    int Maxdate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    int Day = cal.get(Calendar.DAY_OF_WEEK);
    System.out.println("西元"+year+" "+month+"月");
    System.out.println("  日  "+" 一   "+" 二   "+" 三   "+" 四   "+" 五   "+" 六   ");
    System.out.println("======================");
    for (int i=0;i<(Day-1);i++)
    	System.out.print("   ");
    
    for (int j=0;j<Maxdate;j++){
    	if (cal.get(Calendar.DAY_OF_MONTH) < 10) {
    		System.out.print(" "+cal.get(Calendar.DAY_OF_MONTH)+" ");
    	}else {
    		System.out.print(" "+cal.get(Calendar.DAY_OF_MONTH));
    	}
    		
    	if (cal.get(Calendar.DAY_OF_WEEK)==7)
    		System.out.printf("%n");	
    	
    	cal.add(Calendar.DAY_OF_MONTH, +1);
    }
    System.out.printf("%n");
    System.out.println("----------------------");        
    System.out.printf("%n");	
    }// end of first for
    }// end of first if
    else {
    	Calendar cal = new GregorianCalendar(year,(month-1),1);
        int Maxdate = cal.getActualMaximum(Calendar.DATE);
        int Day = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("西元"+year+" "+month+"月");
        System.out.println("  日  "+" 一   "+" 二   "+" 三   "+" 四   "+" 五   "+" 六   ");
        System.out.println("======================");
        for (int i=0;i<(Day-1);i++)
        	System.out.print("   ");
        
        for (int j=0;j<Maxdate;j++){
        	if (cal.get(Calendar.DAY_OF_MONTH) < 10) {
        		System.out.print(" "+cal.get(Calendar.DAY_OF_MONTH)+" ");
        	}else {
        		System.out.print(" "+cal.get(Calendar.DAY_OF_MONTH));
        	}
        		
        	if (cal.get(Calendar.DAY_OF_WEEK)==7)
        		System.out.printf("%n");	
        	
        	cal.add(Calendar.DAY_OF_MONTH, +1);
        }
    }

	}// end of main

	

}// end of class
