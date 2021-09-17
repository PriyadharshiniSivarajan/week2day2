package week2.day2;

public class RemoveDulicatesString {

	public static void main(String[] args) {

		String str = "LABORATORY";
		char[] p = str.toCharArray();
		for (int i = 0; i < (p.length); i++) {
			for (int j = i+1; j < (p.length); j++)

			{
				if (p[i] == p[j]) {
					p[j]='\0';
					
				
		}
			}
			if(p[i]!='\0')
			{
			System.out.print(p[i]);

		}

	}
	}
}
