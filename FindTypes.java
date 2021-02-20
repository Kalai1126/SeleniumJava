package firstpackage.week1;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="$$ Welcome to 2nd Class of Automation $$"; 
		int character=0;
		int num=0;
		int space =0;
		int specialchar=0;
		
		for(int i=0; i<=str1.length()-1;i++) {
			char ch = str1.charAt(i);
			if(Character.isLetter(ch)){
				character++;
			}
			else if(Character.isDigit(ch))num++;
			else if(Character.isSpace(ch))space++;
			else specialchar++;
		}
				
		System.out.println("The digit in the given sentence is: "+num);
		System.out.println("The alphabets in the given sentence is: "+character);
		System.out.println("The space in the given sentence is: "+space);
		System.out.println("The special character in the given sentence is: "+specialchar);

	}

}
