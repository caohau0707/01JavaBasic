package day1;

import java.util.Scanner;

public class DataTypeAndVariable {
	public static void doExercise1() {
		System.out.println("Hello World"); //In chuoi string
	}
	public static void doExercise2() {
		System.out.println("=====Bai2=====");
		System.out.println("++++++");
		System.out.println();
		System.out.println("@@@@@@");
		System.out.println();
		System.out.println("******");
		System.out.println();
		System.out.println("######");
		System.out.println();
	}
	public static void doExercise21() {
		System.out.println("=====Bai3=====");
		System.out.println("++++++" + "\n\n" + "@@@@@@" + "\n\n" + "******" + "\n\n" + "######");
	}
	//***BAI 3***
	public static void doExercise3() {
		int a = 10;
		float b = 20.3f;
		double c = 3.14785;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	//***BAI 4***
	//Write a Java program to declare a Boolean variable with initial value of “true” and later change it to “false” before printing it.
	//Viet chuowng trinh java khai bao bien boolean voi gia tri khoi tao la true va sau do thay false va in ra no
	   
	    public static void doExercise4() {
		boolean d = true; //khai bao khoi tao gia tri
		d = false; // gan gia tri
		System.out.println(d);
	}
	    //***BAI 5***
	    public static void doExcersie5() {
	    	System.out.println("ToolQA");
	    }
	    	public static void doExcercise5a() {
	    		System.out.println("ToolsQA");
	    	}
	    	public static void doExcercise5b() {
	    		int value = 18;
	    		System.out.println("The value of interger variable is:" + value);		
	    	}
	    	public static void doExcercise5c() {
	    		int valueInt = 18;
	    		double valueDob = 10.10;
	    		boolean valueBool = true;
	    	}
	    	//***BAI 6***
	    	
	    	public static void doExcercise6() {
	    		Scanner scanner = new Scanner(System.in);
	    		int e;
	    		System.out.println("hay nhap gia tri cua e:");
	    		e = scanner.nextInt();
	    		double f =(e-32)*0.55556;
	    		System.out.println( e + " degree Fahrenheit is equal to " + f + " su");
	    	}
	    		//***BAI 7***
	    		public static void doExcercise7() {
	    			float g = 1000;
	    			float h = 0.254f; 
	    			System.out.println(g + " inch is " + h + " meters");
	    		}
	    	
	
}

