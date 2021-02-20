package firstpackage.week1;

public class SumofDigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="Tes12Le79af65";
		int count = 0;
		String str2 = str1.replaceAll("[a-zA-Z]", "");
		for (int i = 0; i<=str2.length()-1;i++) {
			char ch = str2.charAt(i);
			int num = Character.getNumericValue(ch);
			count = count+num;
		}
		System.out.println(count);
	}

}
