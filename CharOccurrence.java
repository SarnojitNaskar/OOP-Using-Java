import java.util.*;

public class CharOccurrence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a line: ");
		String line = sc.nextLine();
		System.out.print("Enter the character to find: ");
		char c = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("The character " + c + " appears " + count + " times.");
	}
}
