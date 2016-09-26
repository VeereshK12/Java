package problem.set1;

public class PurchaseBill {

	private int iBillID=1;
	private int iQty;
	private double dBillAmt;
	
	public PurchaseBill(int iQty) {
	this.iQty=iQty;
	}
	
	
	void calculateBill(ItemDetails i1){
		
		 if(iQty>=1&&iQty<=5)
			 {
			 dBillAmt=iQty*( i1.getdItemPrice());
		 if (dBillAmt>=1000)
			 dBillAmt=dBillAmt-(dBillAmt*10);
		 else if(dBillAmt<1000 && dBillAmt>=500)
			 dBillAmt=dBillAmt-(dBillAmt*.05);
			 }
		 else 
			 System.out.println("INVALID QUANTITY");
	 
	}
	
   void Display(){
	   System.out.println("BILL ID :"+iBillID);
	   System.out.println("QUANTITY : "+iQty);
	   System.out.println("BILL AMOUNT: "+ dBillAmt);
   }
}
