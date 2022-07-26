package day3;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;  
import java.text.SimpleDateFormat;  
import java.text.ParseException;  
//===Bai1=== 
public class Practice {
	public static void doExcercise1() {
		Random r=new Random();
		int x =r.nextInt(7001);
		System.out.println("Hay nhap ten cua ban:");
		Scanner scan = new Scanner(System.in);
		 String n = scan.nextLine();
		System.out.println(n + "_" + x);
	}
//	===Bai2=== 
public static void doExercise2() {
	Calendar cal = Calendar.getInstance();
	System.out.println();
	System.out.println("Year: " + cal.get(Calendar.YEAR));
	System.out.println("Month: " + cal.get(Calendar.MONTH));
	System.out.println("Day: " + cal.get(Calendar.DATE));
	System.out.println("Hour: " + cal.get(Calendar.HOUR));
	System.out.println("Minute: " + cal.get(Calendar.MINUTE));
}
//===Bai3=== 
//Write a Java program to compare 2 inputted date with this format: dd-MM-YYYY

public static void doExcercise3() throws ParseException{
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
	Date date1=sdf.parse("25-07-2022");
	Date date2=sdf.parse("25-07-1998");
	System.out.println("Date 1: "+ sdf.format(date1));
	System.out.println("Date 2: " + sdf.format(date2));
	if(date1.compareTo(date2)>0) {
		System.out.println("date 1 comes after date 2");
	}else if(date1.compareTo(date2)<0) {
		System.out.println("date 1 comes before date 2");
	}
	else if(date1.compareTo(date2)==0) {
		System.out.println("Both dates are equal");
	}
//	Write a Java program to display the dates in the following formats:
//		2009-12-31
//		31-12-2009
//		2009-12-31 23:59:59
//		23:59.59.999
//		2009-12-31 23:59:59.999
//		2009-12-31 23:59:59.999 +0100
	

}
public static void doExcercise4() throws ParseException{
	SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
	Date date=sdf.parse("2009-12-31");
	System.out.println("Date: " + sdf.format(date));
	
	SimpleDateFormat sdf1 = new SimpleDateFormat ("dd-MM-YYYY");
	Date date1=sdf1.parse("31-12-2009");
	System.out.println("Date: " + sdf1.format(date1));
	
	SimpleDateFormat sdf2 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
	Date date2=sdf2.parse("2009-12-31 23:59:59");
	System.out.println("Date: " + sdf2.format(date2));
	
	String time1 ="23:59.59.999";
	SimpleDateFormat sdf3 = new SimpleDateFormat ("HH:mm:ss.SSS");
	Date date3 = sdf3.parse(time1);
	System.out.println(date3);
	
	SimpleDateFormat sdf4 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss.SSS");
	Date date4=sdf4.parse("2009-12-31 23:59:59.999");
	System.out.println("Date: " + sdf4.format(date4));

	SimpleDateFormat sdf5 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss.SSS Z");
	Date date5=sdf5.parse("2009-12-31 23:59:59.999 +0100");
	System.out.println("Date: " + sdf3.format(date5));
	
}


}
