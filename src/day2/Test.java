package day2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test {
	public static void doExcercise1() {
		System.out.println("Enter the number of students: ");
		Scanner scan = new Scanner(System.in);
		int numStudents = scan.nextInt();
		int s = 0;
		int grades[] = new int[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Enter the grade for students: ");
			grades[i] = scan.nextInt();
			while ((grades[i] < 0) || (grades[i] > 100)) {
				System.out.println("Invalid grade, try again");
				System.out.println("Enter the grade for student: ");
				grades[i] = scan.nextInt();
			}
		}
		for (int j = 0; j < numStudents; j++) {
			s = s + grades[j];
		}
		double average = (double) s / numStudents;
		System.out.println("The average is: " + average);
	}

	public static void doExcercise2() {
		System.out.println("Enter the number of students: ");
		Scanner scan = new Scanner(System.in);
		int numStudents = scan.nextInt();
		int s = 0;
		int grades[] = new int[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Enter the grade for students: ");
			grades[i] = scan.nextInt();
			while ((grades[i] > 100) || (grades[i] < 0)) {
				System.out.println("Invalid, try again");
				System.out.println("Enter the grade for students: ");
				grades[i] = scan.nextInt();
			}
		}
		for (int j = 0; j < numStudents; j++) {
			s = s + grades[j];
		}
		double average = (double) s / numStudents;
		System.out.println("The average is: " + average);
	}

	public static void doExcercise3(int[] array) {
		if (array.length > 0) {
			System.out.print("{");
			for (int i = 0; i < array.length - 1; i++) {
				System.out.print(array[i] + ",");
			}
			System.out.print(array[array.length - 1] + "}");
		} else {
			System.out.println("mang chuc co phan tu nao");
		}
	}
	public static void doExcercise4(int[] array) {
		if(array.length>0) {
			System.out.print("{");
			for(int i=0;i<array.length-1;i++) {
				System.out.print(array[i] +",");
			}
			System.out.print(array[array.length-1] + "}");
		}else {
			System.out.print("mang chua co phan tu nao");
		}
	}
	public static void welcome(String name) {
		System.out.println("Xin chao" + name);
	}
	public static void doExcercise5() {
		int a[] =new int [3];
		a[0] =10;
		a[1] =12;
		a[2] =30;
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}
	}
	
}
