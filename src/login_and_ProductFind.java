import java.util.Scanner;

public class login_and_ProductFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st : Login with user id and password
	    
				Scanner sc = new Scanner(System.in);
				
				String validID ="inderjit";  
				String validPassword ="inderjit123";

				for (int counter = 1; counter <= 3; counter++) {
					System.out.println(counter + "Enter UserID");
					String userID = sc.next(); // UserID variable from console
					
					System.out.println(counter + "Enter Password");
					String password = sc.next(); // Password variable from console

					// Using Strg.equals(Strng1) method to compare strings (If userID and Password
					// are correct)
					if (userID.equals(validID) && password.equals(validPassword)) {
						System.out.println("You are logged in to the application");
							break;
					
					} else if (counter == 3) {
						    System.out.println("Account locked");
						    break;
					} else {
						System.out.println("Incorrect User id or password.Try again");
					}
				
				}
		        
		            //2nd : Product displaying
		            
		          // Part 1: All the available products present in that category
						String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
						String[] google = { "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" };
						String[] iPhone = { "iPhone12", "iPhone12Mini", "iPhone11", "iPhone11Mini" };

						System.out.println("Enter Brand Name");
						String brandName = sc.next();

						// Using Switch case to get the list of all the brand products
						switch (brandName) {
						case "samsung":
							for (String s : samsung) {
								System.out.println("Samsung product: " + s);
							}
							System.out.println("Enter a samsung product");
							String askUserForSamsung = sc.next(); // User asked for a Samsung product name

							for (String s : samsung) {
								if (!s.equals(askUserForSamsung)) {
									continue;
								} else if (s.equals(askUserForSamsung)) {
									System.out.println("Product selected is :" + s);
									break;
								} else {
									System.out.println("Please select a product from the Samsung list");
								}
							}
							break;

						case "google":
							for (String g : google) {
								System.out.println("Google product: " + g);
							}

							System.out.println("Enter a google product");
							String askUserForGoogle = sc.next(); // User is asked for a google product name

							for (String g : google) {
								if (!g.equals(askUserForGoogle)) {
									continue;
								} else if (g.equals(askUserForGoogle)) {
									System.out.println("Product selected is :" + g);
									break;
								} else {
									System.out.println("Please select a product from the Google list");
								}
							}
							break;

						case "iPhone":
							for (String i: iPhone) {
								System.out.println("iPhone product: " + i);
							}

							System.out.println("Enter a iPhone product");
							String askUserForiPhone = sc.next(); // User is asked for a iphone product name

							for (String i: iPhone) {
								if (!i.equals(askUserForiPhone)) {
									continue;
								} else if (i.equals(askUserForiPhone)) {
									System.out.println("Product selected is :" + i);
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

		        // Product pricing
		        double[] samsungPrice = {1,2,3,4};
		        double[] googlePrice = {5,6,7,8};
		        double[] iPhonePrice = {9,10,11,12};
		        
		        if(brandName.equals(samsung)){
		            for(int ps=0; ps<samsungPrice.length; ps++){  // ps is price of samsung
		                    System.out.println("samsung product price" + ps + samsung);
		            }
		        }  

	}

}
