package week2.day2;

public class ReverseEvenLetters {

	public static void main(String[] args) {
		String str = "LABORATORY";
		String str1 = "";
		char[] p = str.toCharArray();
		for (int i = 0; i < p.length; i++) {
			if (i % 2 != 0) {

				str1 = str1 + p[i];
			}
		}
		System.out.println(str1);
		char[] q = str1.toCharArray();
		for (int i = 0; i < q.length; i++) {
			String str2 = "";
			str2 = str2 + p[i];
			System.out.print(str2);

		}
	}

}
