package firstpackage.week1;

public class primeCheck {
	
	public void checkPrime(int num) {
		int flag=0;
		for (int i =2; i <=num; ++i) {
			if(num%i ==0) {
				flag++;		
			}
		}
		if (flag>=2) System.out.println(num + " This is not a prime number");
		else if (num==1) System.out.println(num + " is neither prime nor composite");
		else System.out.println(num+" This is a prime number");
		}
	public static void main(String args[]) {		
		primeCheck isPrime = new primeCheck();
		isPrime.checkPrime(113);		
	}
}