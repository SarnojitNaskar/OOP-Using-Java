import java.util.*;

public class WordAndCharCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a paragraph: ");
		String paragraph = sc.nextLine();

		int charCount = paragraph.length();
		int wordCount = paragraph.split("\\s+").length;
		
		System.out.println("Number of characters: " + charCount);
		System.out.println("Number of words: " + wordCount);
	}
}
