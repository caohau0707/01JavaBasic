package day1;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Operators {
	 //====Bai1====
	public static void doExcercise1() {
		int x =20;
		String sup =(x<15) ? "small" : (x<22)? "tiny": "huge";
		System.out.println(sup);
	}

	 //====Bai2====
	    public static void doExcercise2() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Input distance in meters: ");
		int n = scan.nextInt();
		System.out.println("Input hour: ");
		int h = scan.nextInt();
		System.out.println("Input minutes: ");
		int m = scan.nextInt();
		System.out.println("Input seconds: ");
		int s = scan.nextInt();
		int timeSeconds = h*3600 + m*60 + s;
		float speedMeterAndSeconds = (float)n/timeSeconds;
		float speedKiloAndHours =    (float)((float)(n/1000))/((float)(timeSeconds/3600));
		float speedMilesAndHours = (float)((float)(n/1609))/((float)(timeSeconds/3600));
		System.out.println("Your speed in meter/second is " + speedMeterAndSeconds);
		System.out.println("Your speed in km/h is " + speedKiloAndHours);
		System.out.println("Your speed in miles/h is " + speedMilesAndHours);
		
	
	}
	 
	//====Bai3====
	public static void doExcercise3() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Input 1st interger: ");
		int firstInt = scan.nextInt();
		System.out.println("Input 2nd interder: ");
		int secondInt = scan.nextInt();
		System.out.printf("Sum of two integers: %d%n", firstInt + secondInt); //%d laf kieu du lieu cho bien double %n la xuong dong
		System.out.printf("Difference of two intergers: %d%n", firstInt - secondInt);
		System.out.printf("Product of two interger: %d%n", firstInt*secondInt);
		System.out.printf("Average of two interger: %.2f%n", (double)(firstInt + secondInt)/2);//%.2f la lay 2 so thap phan sau dau phay
		System.out.printf("Distance of two interger: %d%n", Math.abs(firstInt - secondInt));
		System.out.printf("Max interger: %d%n", Math.max(firstInt, secondInt));
		System.out.printf("Min interder: %d%n", Math.min(firstInt, secondInt));
		
	}
	
	
	
	   //====Bai4====
		public static void doExcercise4() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Input six non-negative digits: ");
		int n = scan.nextInt();
		int a = n/100000; //chia de lay so dau
		int b = n%1000000/10000;//chia lay du mat so dau roi moi chia tiep
		int c = n%10000/1000;
		int d = n%1000/100;
		int e = n%100/10;
		int f = n%10;
		System.out.println(a + " " + b + " " + c + " " +  d + " " + e + " " + f );
		
		
	}

}
