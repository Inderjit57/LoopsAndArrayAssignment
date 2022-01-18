

public class Question1 {

	public static void main(String[] args) {
		// Q 1: What are the different ways of creating/initialising an array?
		/*
		 * Declaring an Array: Datatype[] variablename = {<list of values>}; 
		 * Datatype[] variablename = new Datatype[<length of array>]; 
		 * Indexing a variable: variablename[<location in the length of array>];
		 */
		
		// First method of initialising an Array; Using fixed/defined values.
		int[] num = {1,2,3,4,5,6,7,8};
		
		//Second method of intialising and creating an array; Using length of array to populate index values
		String[] famousNames = new String[4];
				famousNames[0] = "Amitabh bachan";
				famousNames[1] = "Donald Trump";
				famousNames[2] = "Santa Claus";
				famousNames[3] = "Xi Jinping";
				
		// Third method of creating an array; using For Loop
		for(int i=0; i<famousNames.length; i++) {
			System.out.println(famousNames[i]);
		}

	}

}
