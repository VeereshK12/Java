package problem2;

public class Traveller {
private int iTravellerId;
private float fBaggageAmount;
private int iExpiryYear;
private boolean bNOCStatus;

public Traveller(int iTravellerId,float fBaggageAmount,int iExpiryYear,boolean bNOCStatus) {
 this.iTravellerId=iTravellerId;
 this.fBaggageAmount=fBaggageAmount;
 this.iExpiryYear=iExpiryYear;
 this.bNOCStatus=bNOCStatus;
}

public float getfBaggageAmount() {
	return fBaggageAmount;
}
public int getiExpiryYear() {
	return iExpiryYear;
}
public int getiTravellerId() {
	return iTravellerId;
}

public boolean isbNOCStatus() {
	return bNOCStatus;
}







}
