package problem.set1;

import java.util.Scanner;

public class CustomerDemo {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
	   System.out.println("ENTER THE CUSTOMER NAME");
	   String sCustName=sc.nextLine();
	   System.out.println("ENTER THE CUSTOMER ID");
	   int iCustID=sc.nextInt();
	   System.out.println("ENTER THE CUSTOMER PHONE NUMBER");
	   long lTelephone=sc.nextLong();
	   System.out.println("ENTER ADDRESS");
	   String sAddress=sc1.nextLine();
	   
	   Customer vk=new Customer(iCustID, sCustName, sAddress, lTelephone);
	   
	   System.out.println("ENTER THE ITEM ID");
	   int iItemID=sc.nextInt();
	   ItemDetails item=new ItemDetails(iItemID);
	   item.validateItemID();
	   
	   System.out.println("ENTER THE QUANTITY");
	   int iQty=sc.nextInt();
	   PurchaseBill p1=new PurchaseBill(iQty);
	   p1.calculateBill(item);
	   
	   
	   vk.displayDetails();
	   item.displayDetails();
	   p1.Display();
	   if(vk.validateCustomerName()==false)
		   System.out.println("INVALID NAME");
	   if(vk.validateTelephoneNo()==false)
		   System.out.println(" INVALID PHONE NUMBER");
	}

}

