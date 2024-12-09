package stringprograms;

public class ReverseString {

	public static void main (String[] args) {
		String word = "sachin hande";
		String statement = "I Love Java Programming";
		reverseString(word);

		// using StringBuilder
		StringBuilder sb = new StringBuilder(word);

		System.out.printf("\nReverse of '%s' using String Builder is: %s", word, sb.reverse());

		reverseWordOfStatement(statement);

	}

	// Reverse a string using loop

	public static void reverseString (String word) {
		char[] chars = word.toCharArray();
		String reversed = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			reversed += chars[i];
		}
		System.out.printf("Reverse of '%s' using loop is : %s", word, reversed);
	}

	// Revers a words from the statement
	public static void reverseWordOfStatement (String statement) {
		String[] words = statement.split(" ");
		System.out.println("\n");
		StringBuilder reversedStatement = new StringBuilder();
		String s1 = "";
		for (String s : words) {
			char[] chars = s.toCharArray();
			for (int i = chars.length - 1; i >= 0; i--) {
				s1 += chars[i];
			}
			s1 += " ";
		}
		reversedStatement.append(s1);
		System.out.printf("Each Word Reverse from %s is: %s", statement, reversedStatement);

	}

}
