package firstpackage.week1;

public class Sumofdigits {
	
	public void sumOfDigits(int num) {
		
		int total=0;
		int remainder;
		while(num>0) {
			remainder = num%10;
			num=num/10;
			total=total+remainder;			
		}
		System.out.println("Sum of digit is: "+total);		
	}
public static void main(String args[]) {
	Sumofdigits digSum = new Sumofdigits();
	digSum.sumOfDigits(8888);
}
}
