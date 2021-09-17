package week2.day2;

public class reverseString {

	public static void main(String[] args) {

		String str1 = "APPLE";
		String str2 = "";
		char[] p = str1.toCharArray();

		for (int i = (p.length) - 1; i > -1; i--) {
			str2 = str2 + p[i];

		}
		System.out.println(str2);
	}
}
