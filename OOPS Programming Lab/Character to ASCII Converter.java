package q22546;
import java.util.Scanner;

public class CharCodeQuest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char magicalChar = scanner.next().charAt(0);

       // write your code here..
       int asciivalue = (int) magicalChar;
		System.out.println(asciivalue);
		scanner.close();


    }
}
