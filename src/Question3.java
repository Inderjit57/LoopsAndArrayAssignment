
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
		String[] google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
		String[] iPhone = { "iPhone 12", "iPhone 12 Mini", "iPhone 11", "iPhone 11 Mini" };

		Scanner sc = new Scanner(System.in);
		boolean isProduct = false;

		System.out.println("Enter Brand Name");
		String brandName = sc.nextLine();

		// Using Switch case to get the list of all the brand products
		switch (brandName) {
		case "samsung":
			for (int i = 0; i < samsung.length; i++) {
				System.out.println("Samsung product: " + samsung[i]);
			}
			System.out.println("Enter a samsung product");
			String askUserForSamsung = sc.nextLine(); // User is asked for a product name

			for (int i = 0; i < samsung.length; i++) {

				if (samsung[i].equals(askUserForSamsung)) {
					isProduct = true;
					System.out.println("Product selected is :" + samsung[i]);
					break;
				} else if (isProduct) {
					System.out.println("Please select a product from the Samsung list");
					continue;
				}
			}
			break;

		case "google":
			for (int i = 0; i < google.length; i++) {
				System.out.println("Google product: " + google[i]);
			}
			System.out.println("Enter a google product");
			String askUserForGoogle = sc.nextLine(); // User is asked for a google product name

			for (int i = 0; i < google.length; i++) {
				if (google[i].equals(askUserForGoogle)) {
					isProduct = true;
					System.out.println("Product selected is :" + google[i]);
					break;
				} else if (isProduct) {
					System.out.println("Please select a product from the google list");
					continue;
				}
			}
			break;

		case "iPhone":
			for (int i = 0; i < iPhone.length; i++) {
				System.out.println("iPhone product: " + iPhone[i]);
			}
			System.out.println("Enter a iPhone product");
			String askUserForiPhone = sc.nextLine(); // User is asked for a iphone product name

			for (int i = 0; i < iPhone.length; i++) {
				if (iPhone[i].equals(askUserForiPhone)) {
					isProduct = true;
					System.out.println("Product selected is :" + iPhone[i]);
					break;
				} else if (isProduct) {
					System.out.println("Please select a product from the iPhone list");
					continue;
				}
			}
			break;

		default: {
			System.out.println("Please select a Brand from the list: samsung/google/iPhone");
		}
		}

	}

}
