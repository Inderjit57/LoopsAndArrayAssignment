
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Q 2: What will be the output of the following program 
		 * int[] numbers=new int[5]; 
		 * for(int i=0;i<6;i++) 
		 * { System.out.println(numbers[i]); }
		 * 
		 * 
		 * Answer: Value of i will remain 0 until loop 6. 
		 * In order to populate 5 (Length of an array) values at each index in array of Variable "number", 
		 * For loop condition has to be updated, so it can read and update every value in the length of an array Variable. 
		 * for (int i=0; i<number.length; i++)
		 *  
		 * i=6, Loop will not be executed because length of an array is declared 5.
		 */
		
		int[] numbers = new int[5];
		for(int i=0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
		  
		
		

	}

}
