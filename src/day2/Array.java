package day2;

import java.util.Calendar;
import java.util.Scanner;

public class Array {
//	                  ***Bai1***
	public static void doExcercise() {
		Scanner scan = new Scanner(System.in);
		{
			System.out.println("Enter the number of students: ");
			int numStudents = scan.nextInt();
			int numGrades[] = new int[numStudents];
			int averageGrade = 0;
			for (int i = 1; i <= numStudents; i++) {
				System.out.println("Enter the grade for student " + i + numGrades[numStudents - i]);
				int grade = scan.nextInt();
				averageGrade += grade;
				if (grade < 0 || grade > 100) {
					System.out.println("Invalid grade ");
					break;
				}
			}
			double average = averageGrade / numStudents;
			System.out.println("The average is " + average);
		}
	}

	public static void doExcercise1a() {
		System.out.println("Enter the number of student: ");
		Scanner scan = new Scanner(System.in);// kkoi tao cho nguoi dung nhap vao
		int numStudents = scan.nextInt();// khai bao so luong hoc sinh
		int s = 0;// khoi tao tong
		int grades[] = new int[numStudents];// khoi tao mang
		for (int i = 0; i < numStudents; i++) // duyet tuong phan tu gan gia tri
		{
			System.out.println("Enter the grade for student ");
			grades[i] = scan.nextInt(); // gan gia tri thu i
			while (grades[i] < 0 || grades[i] > 100) {
				System.out.println("Invalid grade, try again");
				System.out.println("Enter the grade for student ");
				grades[i] = scan.nextInt(); // gan gia tri lai
			}
		}
		for (int j = 0; j < numStudents; j++) {
			s = s + grades[j];// tong = tong + gia tri thu i
		}
		double average = (double) s / numStudents;
		System.out.println("The average is " + average);

	}
//		                ***Bai2***	

	public static void printArray1(int[] array) {
		if (array.length > 0) {
			System.out.print("{");
			for (int i = 0; i < array.length - 1; i++) {
				System.out.print(array[i] + ",");
			}
			System.out.print(array[array.length - 1] + "}");
		} else {
			System.out.print("Mang chua co phan tu nao");
		}
	}

	public static void printArray2(float[] array) {
		if (array.length > 0) {
			System.out.print("{");
			for (int i = 0; i < array.length - 1; i++) {
				System.out.print(array[i] + ",");
			}
			System.out.print(array[array.length - 1] + "}");
		} else {
			System.out.print("Mang chua co phan tu nao");
		}
	}

	public static void printArray3(double[] array) {
		if (array.length > 0) {
			System.out.print("{");
			for (int i = 0; i < array.length - 1; i++) {
				System.out.print(array[i] + ",");
			}
			System.out.print(array[array.length - 1] + "}");
		} else {
			System.out.print("Mang chua co phan tu nao");
		}
	}

//		                ***Bai3***
	public static String arrayToString(String[] array) {
		String s = "";
		if (array.length > 0) {
			s = ("{");
			for (int i = 0; i < array.length - 1; i++) {
				s = s + (array[i] + ",");
			}
			s = s + (array[array.length - 1] + "}");
		} else {
			s = "Mang chua co phan tu nao";
		}
		return s;
	}

//        ***Bai4***
	public static void doExcercise4(String String1, String String2) {
		char ch = String1.charAt(2);
		System.out.println(ch);
		System.out.println(String1.compareTo(String2));
		System.out.println(String1.compareToIgnoreCase(String2));//
		String str3 = String1.concat(String2);
		System.out.println(str3);
		System.out.println(String1.endsWith("n"));
		System.out.println(String1.startsWith("a"));
		System.out.println(String1.equals(String2));
		System.out.println(String1.equalsIgnoreCase(String2));
		int index = String1.indexOf("");
		System.out.println("" + index);
		int index1 = String2.lastIndexOf('s', 5);
		System.out.println(index1);
		String replaceString = String1.replace('a', 'e');
		System.out.println(replaceString);
		String replaceString1 = String2.replaceAll("a", "b");
		System.out.println(replaceString1);
		for (String w : String1.split("\\s", 0)) {
			System.out.println(w);
		}
		System.out.println(String1.substring(2));
		System.out.println(String2.substring(1, 2));
		String String1lower = String1.toLowerCase();
		System.out.println(String1lower);
		String String2upper = String2.toUpperCase();
		System.out.println(String2upper);
		System.out.println(String1.trim() + "");

	}

	public static void printArray3(int[] a) {
		if (a.length > 0) {
			System.out.print("{");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
				if (i < a.length - 1) {
					System.out.print(",");
				}

			}
			System.out.print("}");
		} else {
			System.out.print("Mang chua co phan tu nao");
		}
	}
}
