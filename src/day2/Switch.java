package day2;

import java.util.Scanner;

public class Switch {
	public static void printDayOfWeek(int n) {
		switch(n) {
		case 2:
			System.out.println("Thu hai");
			break;
		case 3:
			System.out.println("Thu ba");
			break;
		case 4:
			System.out.println("Thu tu");
			break;
		case 5:
			System.out.println("Thu nam");
			break;
		case 6:
			System.out.println("Thu sau");
			break;
		case 7:
			System.out.println("Thu bay");
			break;
		case 8:
			System.out.println("Chu Nhat");
			break;
			default:
			System.out.println("Nhap lai n");
			break;
			
		}
		
	}
	public static void doExcercise1() {
		System.out.println("Hay nhap gia tri cua n: ");
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		if(n<2||n>8) {
			System.out.println("Hay nhap lai n: ");
		}
		else if((n>=2)&&(n<6)) {
			System.out.println("Thu" + n);
		}else if(n==7) {
			System.out.println("Thu" +n);
		}else {
			System.out.println("Chu nhat");
		}
			
		
	}
	public static void doExcercise2() {
		int sum =0;
		float average;
		for (int i=0;i<=100;i++) {
			sum = sum+i;
		}
		System.out.println("The sum is: " + sum);
		average = (float)(sum/100);
		System.out.println("The average: " + average);
	}
	public static void doExcercise3() {
		int sum =0;
		int count = 0;
		for (int i=111;i<=8899;i++) {
			sum = sum +i;
			count ++;
		}
		System.out.println("The sum: " +sum);
		double average = (double)sum/(double)count;
		System.out.println("The average: " + Math.round(average*100.0)/100.0);
	} 
	public static void doExcercise4() {
		int sum =0;
		int count =0;
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				sum=sum+1;
				count++;
			}
			System.out.println("The sum: " +sum);
			double average = (double)sum/(double)count;
			System.out.println(Math.round(average*100.0)/100.0);
		}
	}
	public static void doExcercise5(int max) {
		double sumLeftToRight=0;
		double sumRightToLeft=0;
		for(int i=1;i<=max;i++) {
			sumLeftToRight += (double)1/i;
			sumRightToLeft += (double)1/(max - i +1);
		}
		System.out.println("sum left to right is" +sumLeftToRight);
		System.out.println("sum right to left is" +sumRightToLeft);
		
	}
	

}
