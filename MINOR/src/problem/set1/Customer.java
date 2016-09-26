package problem.set1;

public class Customer {

		private int iCustID;
		private String sCustName;
		private String sAddress;
		private long lTelephone;
		
		
		boolean validateTelephoneNo(){
			if (lTelephone>=7000000000l && lTelephone<=9999999999l)
				return true;
			
			else
				return false;
		}
		
		boolean validateCustomerName(){
			if (sCustName.length()>=4 &&sCustName.length()<=20)
				return true;
			else 
				return false;
			}
		
		void displayDetails(){
			System.out.println("Customer ID : "+ iCustID);
			System.out.println("Customer name :"+ sCustName );
			System.out.println("Customer Address :" + sAddress);
			System.out.println("Customer Telephone No :"+ lTelephone);
		}        
		
		Customer(int iCustID,String sCustName,String sAddress,long lTelephone){
			this.iCustID=iCustID;
			this.sCustName=sCustName;
			this.sAddress=sAddress;
			this.lTelephone=lTelephone;
			
		}
	}


