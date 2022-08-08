package day5.practice;

import java.util.Scanner;

public class Practice {
	// Day 1– Java language
	// ***Bai1*** viet o ham main
	// ***Bai2***
	public static void inChuoi() {
		String a = "Hello,World";
		String b = "Hello, Java";
		System.out.println(a);
		System.out.println(b);

	}

	// ***Bai3***
	public static void doExcercise3() {
		System.out.println("hay nhap gia tri cua n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n % 2 == 1) {
			System.out.println("Weird");
		} else if ((n % 2 == 0) && (n > 2) && (n < 5)) {
			System.out.println("Not Weird");
		} else if ((n % 2 == 0) && (n > 6) && (n < 20)) {
			System.out.println("Weird");
		} else if ((n % 2 == 0) && (n > 20)) {
			System.out.println("Not Weird");
		} else {
			System.out.println("ko co gi");
		}
	}

	// ***Bai4***
	public static void doExcercise4(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
		}
	}

	// Day 3 – Data Structure – mảng 1 chiều, mảng 2 chiều,
	// ***Bai5***
	public static void doExcercise5() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Do dai cu mang la: " + arr.length);
	}

	// ***Bai6***
	public static void doExcercise6() {
		for (int i = 1; i <= 6; i++) {
			System.out.println(i);
		}
	}

	// ***Bai7***
	public static void doExcercise7() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < 8; i++)
			System.out.println(numbers[i]);
	}

	// ***Bai8***
	public static void doExcercise8() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int arr[][] = new int[3][3];// khai bao mang 2 chieu
		for (int i = 0; i < numbers.length; i++) {
			if (i < 3) {
				arr[0][i % 3] = numbers[i];
			} else if ((i >= 3) && (i < 6)) {
				arr[1][i % 3] = numbers[i];// i:3 lay phan du tuong ung 11 12 13
			} else if (i >= 6) {
				arr[2][i % 3] = numbers[i];

			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]);

			}
			System.out.println();
		}
	}

	// Java Basic
	// ***Bai1***
	public static void doExcercise1a(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("     ");
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
			// System.out.println("");
		}

	}

	// ***Bai2***
	public static void doExcercise2a() {
		int a = 10;
		float b = (float) 12.5;
		String c = "Java programming";
		System.out.println(a);
	}

	// ***Bai3***
	public static void doExcercise3a() {
		String str = "20";
		int t = Integer.parseInt(str);
		System.out.println(t);
	}

	// ***Bai4***
	public static void doExcercise4a() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hay nhap gia tri cua laptop: ");
		int laptop = scan.nextInt();

		System.out.println("Hay nhap gia tri cua PC: ");
		int PC = scan.nextInt();

		System.out.println("Hay nhap gia tri cua projection: ");
		int projection = scan.nextInt();
		double average = (double) (laptop + PC + projection) / 3;
		System.out.println("Average is" + average);

	}

	// ***Bai5***
	public static void doExcercise5a(String s) {
		s = s.replaceAll("$", "");
		System.out.println("$" + 2000);
	}

	// ***Bai6***
	public static void doExcercise6a(String s) {
		s = s.trim();
		s = s.replaceAll(" ", "_");
		System.out.println(s);
	}

	// Condition statements
	// ***Bai7***
	public static void doExcercise7a() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hay nhap gia tri cua Actual Result: ");
		String actualResult = scan.nextLine();
		System.out.println("Hay nhap gia tri cua Expect Result: ");
		String expectResult = scan.nextLine();
		if (actualResult.equals(expectResult)) {
			System.out.println("TC passed");
		} else {
			System.out.println("TC failed");
		}
	}

	// ***Bai8***
	public static void doExcercise8a() {
		Scanner scan = new Scanner(System.in);
		int herAge = scan.nextInt();
		if (herAge >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}

	}

	// ***Bai10***
	public static void doExcercise9a() {
		Scanner scan = new Scanner(System.in);
		System.out.println("hay nhap quiz score: ");
		int quiz = scan.nextInt();

		System.out.println("hay nhap midTerm score: ");
		int midTerm = scan.nextInt();

		System.out.println("hay nhap final score: ");
		int finalScores = scan.nextInt();
		float average = (float) (quiz + midTerm + finalScores) / 3;
		System.out.println(average);
		if (average >= 90) {
			System.out.println(" Quiz score: " + quiz);
			System.out.println(" Mid-term score: " + midTerm);
			System.out.println(" Final score: " + finalScores);
			System.out.println("Your grade is A");
		} else if ((average >= 70) && (average < 90)) {
			System.out.println(" Quiz score: " + quiz);
			System.out.println(" Mid-term score: " + midTerm);
			System.out.println(" Final score: " + finalScores);
			System.out.println("Your grade is B");

		} else if ((average >= 50) && (average < 70)) {
			System.out.println(" Quiz score: " + quiz);
			System.out.println(" Mid-term score: " + midTerm);
			System.out.println(" Final score: " + finalScores);
			System.out.println("Your grade is C");
		} else {
			System.out.println(" Quiz score: " + quiz);
			System.out.println(" Mid-term score: " + midTerm);
			System.out.println(" Final score: " + finalScores);
			System.out.println("Your grade is F");
		}

	}

	// ***Bai11***
	public static void doExcercise11a() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter unit price: ");
		int unitPrice = scan.nextInt();

		System.out.println("Enter unit price: ");
		int quantity = scan.nextInt();
		if ((quantity > 100) && (quantity < 200)) {
			System.out.println("After discount= " + 0.1 * quantity * unitPrice + "$");
			System.out.println("The revenue from sale= " + (unitPrice * quantity - 0.1 * quantity * unitPrice) + "$");
		} else if (quantity > 120) {
			System.out.println("After discount= " + 0.15 * quantity * unitPrice + "$");
			System.out.println("The revenue from sale= " + (unitPrice * quantity - 0.15 * quantity * unitPrice) + "$");
		} else if (quantity < 100) {
			System.out.println(quantity * unitPrice + "$");
		}
	}

	// ***Bai12***
	public static void doExcercise12a() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number keys: ");
		int a = scan.nextInt();
		if ((a >= 0) && (a <= 9)) {
			System.out.println(a);
		} else {
			System.out.println("Not allowed");
		}

	}

	// ***Bai13***
	public static void doExcercise13a() {
		System.out.println("a. int 1x=10");
		System.out.println("b. int x=10");
		System.out.println("c. float x=10.0f");
		System.out.println("d. string x=\"10\"");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		System.out.println();
		if (a.equals("a")) {
			System.out.println("int 1x=10");
		} else if (a.equals("b")) {
			System.out.println("b. int x=10");
		} else if (a.equals("c")) {
			System.out.println("float x=10.0f");
		} else if (a.equals("d")) {
			System.out.println("string x=\\\"10\\\"");
		}
	}

	// ***Bai14***
	public static void doExcercise14a() {
		int term = 7;
		for (int i = 1; i <= term; i++) {
			for (int j = term; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

	// ***Bai15***
	public static void doExcercise15a(int a, int b) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (j <= i) {
					System.out.print(j);
				} else {
					System.out.print("*");
				}
			}
			System.out.println("\n");
		}
	}
	// ***Bai16***
	public static void doExcercise16() {
		Scanner scan = new Scanner(System.in);
		String ctn;
		
		do {
			System.out.println("What is the command keyword to exit a loop in Java?\n"
			+ "a. int\n"
			+ "b. continue\n"
			+ "c. break\n"
			+ "d. exit\n");
			System.out.println("Enter your choice: ");
			String choice = scan.nextLine();
			if(choice.equals("b")) {
				System.out.println("Incorrect");
			}else {
				System.out.println("Correct");
			}
			System.out.println("Again? press y to continue: ");
			ctn = scan.nextLine();
			}while(ctn.equals("y"));	
	}
	

	// ***Bai17***
	public static void doExcercise17a() {
		for (int i = 1; i <= 122; i++) {
			System.out.print((char) i + "\t");
			if (i % 10 == 0) {
				System.out.println("");

			}
		}
	}

	// ***Bai19***
	public static void doExcercise19a() {
		int i =1;
		do {
			System.out.print((char)i+"\t");
			if(i%10==0)
				System.out.println("");
			i++;
		}while(i<=122);
	}
	public static String mangtest() {
		String result ="";
		System.out.println(result);
		result = result+"{";
	 return result;
	}
	public static String arrayToString(int[] arr) {
		String result = "";
		
		result += "{";
		for(int i =0; i < arr.length ;i++) {
			if(i<arr.length-1) {
				result += arr[i]+",";
			}
			else {
				result +=arr[i];
			}	
		}
		result += "}";
		return result;
	}
	public static void test() {
		Scanner sc = new Scanner(System.in);
		String ctn;
		do {
			System.out.println("What is the command keyword to exit a loop in Java?\n"
					+ "a. int\n"
					+ "b. continue\n"
					+ "c. break\n"
					+ "d. exit\n"
					+ "");
			System.out.println("Enter your choice: ");
			String choise = sc.nextLine();
			if(choise.equals("c")) {
				System.out.println("correct\n");
			}else {
				System.out.println("incorrect\n");
			}
			System.out.println("Again? press y to continue: \n");
			ctn =sc.nextLine();
		}while(ctn.equals("y"));
		
	}
	public static void doExcercise10a() {
		System.out.println("Enter quiz: ");
		Scanner scan = new Scanner(System.in);
		int quiz = scan.nextInt();
		while(quiz<0 || quiz>100) {
			System.out.println("Enter quiz: ");
			quiz= scan.nextInt();
		}
		System.out.println("Enter mid-term: ");
		int mid = scan.nextInt();
		while(mid<0 || mid>100) {
			System.out.println("Enter quiz: ");
			quiz= scan.nextInt();
		}
		System.out.println("Enter final: ");
		int finalScore = scan.nextInt();
		while(finalScore<0 || finalScore>100) {
			System.out.println("Enter finalScore: ");
			finalScore= scan.nextInt();
		}
		float average = (float)(quiz+mid+finalScore)/3;
		if(average>=90) {
			System.out.println("Your grade is A");
		}
		else if(average>=70 && average<90) {
			System.out.println("Your grade is B");
		}
		else if(average>=50 && average<70) {
			System.out.println("Your grade is C");	
	}
		if(average<50) {
			System.out.println("Your grade is F");
		
}
		}
	//Input: string
	//Ouput: All space => replace
	//Space dau va cuoi bi remove
	//Solution: string1.replace("","-")
	public static void doExcercise6b(String s1) {
		String s2 = s1.trim();
		String s3= s2.replaceAll(" ", "_");
		System.out.println(s3);
	
	}
	public static void doExcercise6c(String s2) {
		
		
	}
	}
