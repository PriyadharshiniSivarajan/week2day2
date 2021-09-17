package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
	String str="Welcome to testleaf institute";
	String[] str2 = str.split(" ");
	String str3="";
	for(int i=str2.length;i>-1;i--)
	{
		if(i%2!=0)
		{
			str3=str3+str2[i];
			
			}
	}
	
System.out.println(" The reversed even words are:"+ str3);
}
}