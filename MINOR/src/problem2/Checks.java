package problem2;

public class Checks {

	boolean checkBaggage(Traveller T){
		
		if(T.getfBaggageAmount()>=0&&T.getfBaggageAmount()<=0)
			return true;
		else
			return false;
		
	}
	
	boolean checkImmigration(Traveller T)
	{
		if(T.getiExpiryYear()>=2001&&T.getiExpiryYear()<=2025)
			return true;
		else
			return false;
	}
	
	boolean checkSecurity(Traveller T){
		if(T.isbNOCStatus()==true)
			return true;
		else
				return false;
	}
}
