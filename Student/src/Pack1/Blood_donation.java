package Pack1;

public class Blood_donation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=20;
		double weight=50.56;
		if(age>=18)
		{
			if (weight<18)
			{
				System.out.println("you r eligible for blooddonation");
			}
			else {
				System.out.println("invalid");
			}
		}else {
			System.out.println("you r not eligible for blooddonation");
		}
		
			

	}

}
