package firstpackage.week1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "We learn java basics as part of java sessions in java week1";		
		int count = 0;
		String[] str2 = str1.split(" ");
		for(int i=0; i<=str2.length-1;i++) {
		 for(int j=i+1; j<=str2.length-1; j++) {
			 if(str2[i].equals(str2[j])){
				 count++;
				 str2[j]="";
			 }
			}
		}
		 if(count>0) {
			 for(int k=0; k<=str2.length-1;k++) {
				 
					System.out.print(str2[k]+" ");
		 }
			
	
		 }
 		}
	
	}


