package q22545;

import java.util.Scanner;

public class FloatToInt {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        float floatValue = scanner.nextFloat();

		// write your code here
int intvalue = (int) floatValue;
	    System.out.println(intvalue);
		scanner.close();
       

    }
}
