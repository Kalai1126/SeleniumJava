package firstpackage.week1;

public class mobile {

	public int getPrice(int mobPrice) {
		if(mobPrice == 1){
			return 10000;}
		else if (mobPrice ==2) {
			return 20000;}
		else if(mobPrice ==3) {
			return 30000;}
		else {return 40000;}      

	}

	public String getModel() {
		return "Samsung s5";
	}

	private void getPicture() {
		System.out.println("This is my family");
	}

	public static void main(String args[])
	{
		mobile myMobile = new mobile();
		System.out.println(myMobile.getPrice(1));
		System.out.println(myMobile.getModel());
        myMobile.getPicture();
	}
}



