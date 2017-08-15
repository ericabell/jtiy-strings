import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.leftPad;

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


        // lastIndexOf
        System.out.println(" * lastIndexOf:");
        if( original.lastIndexOf("b") == 21) {
            System.out.println("SUCCESS: located last instance of b in the string.");
        } else {
            System.out.println("FAILURE: did not find substring or incorrect index.");
        }


        // toLowerCase
        System.out.println(" * toLowerCase:");
        if( original.toLowerCase().equals("my favorite color is blue.")) {
            System.out.println("SUCCESS: converted string to all lower case");
        } else {
            System.out.println("FAILURE: string did not come back lower case");
        }


        // ADVENTURE
        // to get a string literal that spans multiple lines
        String multipleLineString = "This is the first line\n" +
                "This is the second line\n" +
                "This is the third line\n";

        System.out.println("Multiple line string:\n" + multipleLineString);


        // EPIC using StringUtils (loaded commons library per misc insructions)
        if(isBlank(null)) {
            System.out.println("SUCCESS: using StringUtils isBlank method");
        } else {
            System.out.println("FAILURE: isBlank should be true for null");
        }

        // equalsIgnoreCase
        if(equalsIgnoreCase("abc", "ABC") == true) {
            System.out.println("SUCCESS: the two strings are equal, ignoring case");
        } else {
            System.out.println("FAILURE: the two strings should have been equal, ignoring case");
        }

        // leftPad
        if( leftPad(null, 3) == null){
            System.out.println("SUCCESS: null string padded is still null");
        } else {
            System.out.println("FAILURE: null string padded should have been null");
        }

        if( leftPad("bat", 5).equals("  bat")) {
            System.out.println("SUCCESS: padded bat correctly with two leading spaces");
        } else {
            System.out.println("FAILURE: did not pad bat correctly");
        }

        if( leftPad("cat", 6, "e").equals("eeecat")) {
            System.out.println("SUCCESS: padded cat with leading e");
        } else {
            System.out.println("FAILURE: did not pad cat correctly");
        }
    }
}
