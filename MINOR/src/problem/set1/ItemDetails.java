package problem.set1;

public class ItemDetails {

		private int iItemID;
		private double dItemPrice;
		
	    ItemDetails(int iItemID) {
		  this.iItemID=iItemID;
		}
		
	    void validateItemID(){
	    	if(iItemID == 1001)
	    		dItemPrice=50.55;
	    	else if(iItemID==1002)
	    		dItemPrice=64.44;
	    	else if (iItemID==1003)
	    		dItemPrice=40.59;
	    	else if(iItemID==1004)
	    		dItemPrice=59.44;
	    	else if(iItemID==1005)
	    		dItemPrice=66.69;
	    	else
	    		System.out.println("INVALID ITEM ID ");
	    }
		
	    void displayDetails(){
	    	System.out.println("ITEM ID :"+iItemID);
	    	System.out.println("ITEM PRICE :"+dItemPrice);
	    }
	    
		public double getdItemPrice() {
			return dItemPrice;
		}

		

		
	}

