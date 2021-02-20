package firstpackage.week1;

public class Fibinocciseries {

	public static void main(String[] args) {
		int range = 8;
		int firstfib=0;
		int secondfib=1;
		System.out.println(firstfib);
		System.out.println(firstfib+secondfib);
		
		for(int i=1; i<=range-2; i++) {
			
			int fibseries = firstfib + secondfib;
			firstfib = secondfib;
			secondfib = fibseries;
			System.out.println(fibseries);
		}
		
	}

}
