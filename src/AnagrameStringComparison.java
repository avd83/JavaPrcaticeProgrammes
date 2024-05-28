import java.util.Arrays;

public class AnagrameStringComparison {
	// Anagram is nothing but :
	// 1.string length should be same
	// 2.and character in both string are also same.

	public static void main(String[] args) {
		
		findAnagarm("race", "care");
	}

	public static void findAnagarm(String str1, String str2) {

		if (str1.length() != str2.length()) {
			System.out.println("both the string are not Anagram");
		} else {
			char[] a = str1.toCharArray();
			char[] b = str2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if (Arrays.equals(a, b) == true) {
				System.out.println("both the string are Anagram");
			}
		}
	}
}
