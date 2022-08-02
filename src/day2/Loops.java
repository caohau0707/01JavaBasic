package day2;

public class Loops {
//	===Bai1=== 
	public static void sumAndAverage() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("The sum is: " + sum);
		float average;
		average = (float) (sum / 100);
		System.out.println("The average " + average);

	}

//	===Bai2=== 
	public static void sumAndAverage2() {
		int sum = 0;
		int count = 0;
		for (int i = 111; i <= 8899; i++) {
			sum = sum + i;
			count++;
		}
		System.out.println("The sum is" + sum);
		Double average = (double) sum / (double) count;
		System.out.println("The average " + Math.round(average * 100.0) / 100.0);
	}

//	===Bai3=== 
	public static void sumAndAverage3() {
		int sum = 0;
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
				count++;
			}
			System.out.println("The sum is" + sum);
			Double average = (double) sum / (double) count;
			System.out.println("The average " + Math.round(average * 100.0) / 100.0);
		}
//		===Bai4=== 
	}

	public static void sumAndAverage4() {
		int sum = 0;
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
				count++;
			}
			System.out.println("The sum is" + sum);
			Double average = (double) sum / (double) count;
			System.out.println("The avarage " + Math.round(average * 100.0) / 100.0);
		}
	}

//	===Bai5=== 
	public static void sum5(int lowerNumber, int upperNumber) {
		long sum = 0L;
		long count = 0L;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i * i;
			System.out.println(i * i);
			count++;
		}
		System.out.println("Sum of the squares from " + lowerNumber + "to" + upperNumber + ".");
		System.out.println("The sum is" + sum);
	}

//	===Bai6=== 
	public static void sum6() {
		int max = 50000;
		double sumleftToRight = 0;
		double sumrightToLeft = 0;
		for (int i = 1; i <= max; i++) {
			sumleftToRight += (double) (1) / i;
			sumrightToLeft += (double) (1) / (max - i + 1);
		}
		System.out.println("left to right = " + sumleftToRight);
		System.out.println("right to left = " + sumrightToLeft);

	}

//	===Bai7=== 
	public static void squareBoard(int n) // input:n de nguoi dung nhap tuy y
	{
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	// ===Bai8===

	public static void doExcercise9(int rows, int cols) {
		for (int i = 1; i <= rows; i++) {
			if (i % 2 == 0) {
				System.out.print(" ");
			}
			for (int j = 1; j <= cols; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}

	// ===Bai9===
	public static int doExcercise10(String s) {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		int index = 0;
		while (index < s.length()) {
			if (ch[index] == 'r')
				return index;
			index++;
		}
		return -1;
	}

	public static void doExcersice11(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void doExcercise12() {
		int i = 1;
		int a = ++i;
		int b = i++;
		System.out.println(a);
		System.out.println(b);

	}

	public static void doExcercise13(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
//	    public static void doExcercise14() {
//	    	int n;
//	    	while((n<2)||(n>8)) {
//	    		System.out.println("Nhap lai n =");
//	    	}
//	    }

}
