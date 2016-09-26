package problem2;

import java.util.Scanner;

public class TravellerDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter ID");
		int iTravellerId=sc.nextInt();
		System.out.println("ENTER THE BAGGAGE AMOUNT");
		float fBaggageAmount=sc.nextFloat();
		System.out.println("ENTER THE PASSORT EXPIRY YEAR");
		int iExpiryYear=sc.nextInt();
		System.out.println("ENTER THE BNOC STATUS");
		boolean bNOCStatus=sc.nextBoolean();
		Traveller veeresh= new Traveller(iTravellerId, fBaggageAmount, iExpiryYear, bNOCStatus);
		Checks check=new Checks();
		if(check.checkBaggage(veeresh)==true&&check.checkImmigration(veeresh)==true&&check.checkSecurity(veeresh)==true)
			System.out.println("ALLOW TRAvELLEr TO FLY");
		else
			System.out.println("DETAIN TRAVELLER FOR RE-CHECKING");

	}

}
