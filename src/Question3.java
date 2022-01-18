
/*
		 * Q3. Part 1 : Write a program which when given a phone brand name, shows all
		 * the available products present in that category. Please use the below table
		 * to create list of products for each category. Part 2: After displaying all
		 * the available products, ask user to enter one product name. Ensure user
		 * enters one of the displayed names. If user enters a name which is present in
		 * list, print “product selected is : name of product “ otherwise display an
		 * error message – “Please select a product from the list”
		 * 
		 */
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		// Part 1: All the available products present in that category
		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] google = { "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" };
		String[] iPhone = { "iPhone12", "iPhone12Mini", "iPhone11", "iPhone11Mini" };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Brand Name");
		String brandName = sc.next();

		// Using Switch case to get the list of all the brand products
		switch (brandName) {
		case "samsung":
			for (int s = 0; s < samsung.length; s++) {
				System.out.println("Samsung product: " + samsung[s]);
			}

			System.out.println("Enter a samsung product");
			String askUserForSamsung = sc.next(); // User asked for a Samsung product name

			for (int s = 0; s < samsung.length; s++) {
				if (!samsung[s].equals(askUserForSamsung)) {
					continue;
				} else if (samsung[s].equals(askUserForSamsung)) {
					System.out.println("Product selected is :" + samsung[s]);
					break;
				} else {
					System.out.println("Please select a product from the Samsung list");
				}
			}
			break;

		case "google":
			for (int g = 0; g < google.length; g++) {
				System.out.println("Google product: " + google[g]);
			}

			System.out.println("Enter a google product");
			String askUserForGoogle = sc.next(); // User is asked for a google product name

			for (int g = 0; g < google.length; g++) {
				if (!google[g].equals(askUserForGoogle)) {
					continue;
				} else if (google[g].equals(askUserForGoogle)) {
					System.out.println("Product selected is :" + google[g]);
					break;
				} else {
					System.out.println("Please select a product from the Google list");
				}
			}
			break;

		case "iPhone":
			for (int i = 0; i < iPhone.length; i++) {
				System.out.println("iPhone product: " + iPhone[i]);
			}

			System.out.println("Enter a iPhone product");
			String askUserForiPhone = sc.next(); // User is asked for a iphone product name

			for (int i = 0; i < iPhone.length; i++) {
				if (!iPhone[i].equals(askUserForiPhone)) {
					continue;
				} else if (iPhone[i].equals(askUserForiPhone)) {
					System.out.println("Product selected is :" + iPhone[i]);
					break;
				} else {
					System.out.println("Please select a product from the iPhone list");
				}
			}
			break;

		default: {
			System.out.println("Please select a Brand from the list: samsung/google/iPhone");
		}
		}

	}

}
