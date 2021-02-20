package firstpackage.week1;

public class Armstrong {
	
	public void getArmstrong(int num)
	{
		int calculated = 0;
		int remainder;
		int original= num;
		while(num > 0) {
			
			remainder = num%10;
			num = num/10;
			calculated = calculated +(remainder*remainder*remainder);
		}
			if(calculated==original) System.out.println(original + " is an armstrong number");
			else System.out.println(original + " is not an armstrong number");			
		}
				
	
	public static void main(String args[]) {
		
		Armstrong myNum = new Armstrong();
		myNum.getArmstrong(307);
		
			}
}


