package day1;

import java.util.Scanner;

public class DecisionMaking {
//	===Bai1===
	public static void doExercise1() {
		System.out.println("Input an interger between 0 and 1000: ");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt(); //345
		int firstDigit = num%10;  //5
		int remainingNumber = num/10;  //34
		int secondDigit = remainingNumber % 10;  //4
		remainingNumber = remainingNumber/10; //3
		int thirdDigit = num%10;   //3
		remainingNumber = remainingNumber/10;  //0
		int fourthDigit = remainingNumber%10;  //0
		int sum = thirdDigit + secondDigit + firstDigit + fourthDigit;
		System.out.println("The sum of all 1 in " + num + " is " + sum);

	}
	
//	===Bai2===
	
	public static void doExcercise2() {
		int m = 3456789;
		int y = 3456789/(1440*365);
		int d = 3456789/1440%365;
		System.out.println(m + "minutes is approximately " + y + " years and " + d + " days");
	}
	
	public static void doExcercise2a() {
		double minutesInYear = 60*24*365;
		System.out.println("Input the number of minutes: ");
		Scanner scan = new Scanner (System.in);
		double min = scan.nextDouble();
		long years = (long)(min/minutesInYear);
		int days = (int)(min/60/24)%365;//chia lay du
		System.out.println((int)min + " minutes is approximately " + years + " years and " + days + " days ");
		 
	}
	
//	===Bai3===	
	
	
	public static void doExercise3() {
		System.out.println("Hay nhap n=");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n%2==0) {
			System.out.println(n + " la so chan");
		}
	}

	
//	===Bai4===
	
	public static void doExcercise4() {
		System.out.println("Hay nhap n=");
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		if(n%2==0) {
			System.out.println(n + "la so chan");
	}
		{
			System.out.println(n + " la so le");
		}
	}
	
//	===Bai5=== 
	
	public static void doExcercise5() {
		System.out.println("Hay nhap n=");
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		if((n<2)||(n>8)) {
			System.out.println("Nhap lai n");
		}
		else if ((n>=2)&&(n<=6)) {
			System.out.println("Thu" +n);
		}
		else if (n==7) {
			System.out.println("Ngay nghi");
		}
		else {
			System.out.println("Ngay le");
			
		}
		}
			
		}
		


