package firstpackage.week1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "madam";
		String str2 = "";
		for(int i = str1.length()-1;i>=0;i--) {	
			char[] rev = str1.toCharArray();
			str2 =str2+ rev[i];
		}
		if(str1.equals(str2))System.out.println("The "+str1+" is a Palindrome");
		else System.out.println("The "+str1+" is not a Palindrome");
	}

}
