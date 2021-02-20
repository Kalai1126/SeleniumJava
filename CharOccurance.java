package firstpackage.week1;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1="Welcome to Chennai";
     int count = 0;
     char[] str2 = str1.toCharArray();
     int len = str2.length;
     for(int i=0; i<=len-1;i++) {
    	if(str2[i]=='e') {
    		count=count+1;
    	}       
     }
     System.out.println("The occurance of e is: "+count);
	}

}
