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
		String[] iPhone = { "iPhone12", "iPhone12 Mini", "iPhone11", "iPhone11 Mini" };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Brand Name");
		String brandName = sc.next();
		
		//Using Switch case to get the list of all the brand products
		switch (brandName) {
		case "samsung": {
			for (int s = 0; s < samsung.length; s++) {
				System.out.println("Samsung product: " + samsung[s]);
			}
			break;
		}

		case "google": {
			for (int g = 0; g < google.length; g++) {
				System.out.println("Google product: " + google[g]);
			}
			break;
		}

		case "iPhone": {
			for (int i = 0; i < iPhone.length; i++) {
				System.out.println("iPhone product: " + iPhone[i]);
			}
			break;
		}

		default: {
			System.out.println("Please select a product from the list");
		}

		}

		// After displaying all the available products, ask user to enter one product
		// name
		System.out.println("Enter a product");
		String askUser = sc.next();

		for (int s = 0; s < samsung.length; s++) {
			if (askUser.equals(samsung[s])) {
				System.out.println("Product selected is :" + samsung[s]);
				break;
			}
		}
		for (int g = 0; g < google.length; g++) {
			if (askUser.equals(google[g])) {
				System.out.println("Product selected is :" + google[g]);
				break;
			}
		}

		for (int i = 0; i < iPhone.length; i++) {
			if (askUser.equals(iPhone[i])) {
				System.out.println("Product selected is :" + iPhone[i]);
				break;
			}
		}

	}

}
