package firstpackage.week1;

public class Divi3and7 {
	
	public static void main(String args[])	{	
		for(int i=1; i<=25; i++) {
		if (i%3==0 && i%7 ==0) System.out.println("bizfiz");
		else if (i%3==0) System.out.println("biz");
		else if(i%7==0) System.out.println("fiz");
		//else System.out.println(i+" is not divisible by 3 and 7");
	}
}
}