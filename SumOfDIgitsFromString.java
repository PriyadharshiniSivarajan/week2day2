package week2.day2;

public class SumOfDIgitsFromString {

	public static void main(String[] args) {
		String str = "Welcome123456789";
		int sum = 0;
		String str1 = str.replaceAll("[\\D]", "");
		System.out.println(str1);
		char[] q = str1.toCharArray();
		for (int i = 0; i < (q.length); i++) {
			sum= sum+Character.getNumericValue(q[i]);
			
			
		}
		System.out.println("The sum is" + sum);
	}

}
