package firstpackage.week1;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,18};
		
		for (int o=0; o<=arr.length-1; o++) {
			int count=0;
				for(int i=o+1; i<=arr.length-1; i++) {
					if (arr[o]==arr[i]) {
						count++;
						arr[i]=0;
				}

			}
				if(count>0&&arr[o]!=0)System.out.println(arr[o]);

		}
	}

}
