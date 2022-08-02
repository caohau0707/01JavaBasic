package day2;

import java.util.Scanner;

import org.openqa.selenium.By;

public class Switch {
	// ***Bai1***
	public static void printDayOfWeek(int n) {
		switch (n) {
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
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n < 2 || n > 8) {
			System.out.println("Hay nhap lai n: ");
		} else if ((n >= 2) && (n < 6)) {
			System.out.println("Thu" + n);
		} else if (n == 7) {
			System.out.println("Thu" + n);
		} else {
			System.out.println("Chu nhat");
		}
	}

	// ***Bai2***
	public static void doExcercise2() {
		System.out.println("Enter Locator Type: ");
		Scanner scan = new Scanner(System.in);
		String locatorType = scan.nextLine();
		System.out.println("Enter Locator Value: ");
		Scanner scan1 = new Scanner(System.in);
		String locatorValue1 = scan.nextLine();
		System.out.println("By." + locatorType + "(" + locatorValue1 + ")");
	}

	public By getLocator(String locatorType, String locatorValue) {
		By result = null ;// hung gia tri tra ve
		switch (locatorType) {
		case "id": {
			result = By.id(locatorValue);
			break;
		}
		case "name":  {
			result = By.name(locatorValue);
			break;
		}
		case "linkText": {
			result = By.linkText(locatorValue);
			break;
		}
		case "cssSelector": {
			result = By.cssSelector(locatorValue);
			break;
		}
		case "partialLinkText": {
			result = By.partialLinkText(locatorValue);
			break;
		}
		case "tagName": {
			result = By.tagName(locatorValue);
			break;
		}
		case "xpath": {
			result = By.xpath(locatorValue);
			break;
		}
	default:
		System.out.println("HiHi");
		
		}
		return result;
	}
}
	

