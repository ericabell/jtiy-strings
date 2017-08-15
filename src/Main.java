public class Main {

    public static void main(String[] args) {
	// write your code here

        String original = "My favorite color is blue.";

        // contains
        System.out.println(" * contains:");
        if( original.contains("c") ) {
            System.out.println("SUCCESS: contains found a char in the string.");
        } else {
            System.out.println("FAILURE: should have found a char in the string.");
        }
        if( original.contains("z") ) {
            System.out.println("FAILURE: found a char in original that is not there");
        } else {
            System.out.println("SUCCESS: should not find a char that is not in original");
        }

        
    }
}
