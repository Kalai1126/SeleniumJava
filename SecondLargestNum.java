package firstpackage.week1;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,11,4,6,7};
		Arrays.sort(arr);
		System.out.println("The second Largest Number in the array is: "+arr[arr.length-2]);
		}
}
