package day2;

import java.util.Scanner;

public class Method {
//  ***Bai1***
	public static boolean isOdd(int number) {
		if (number % 2 == 1) {
			return true;
		}
		return false;
	}

//***Bai2***
	public static boolean hasEight(int number) {
		String s = number + "";// conver int sang string
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
			if (ch[i] == '8')
				return true;
		}
		return false;
	}

//***Bai3***
	public static void doExcercise() {
		int s =0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a positive interger: ");
			int n = scan.nextInt();
			if(n==-1)
				break;
			else {if(hasEight(n))
				s=s+n;	
			}
		}
		System.out.println("The magic sum is: " + s);
	}
}
