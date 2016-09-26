package problem3;

public class Employee {
	private int iEmpID;
	private String sEmpName;
	private float fEmpBasicsalary;
	private float fAllowance;
	private float fGrossSalary;
	private float fNetSalary;
	private float fincomeTax;
	public Employee(int iEmpID,	String sEmpName,float fEmpBasicsalary) {
		this.iEmpID=iEmpID;
		this.sEmpName=sEmpName;
		this.fEmpBasicsalary=fEmpBasicsalary;
	}	
	
	void calNetsalary(){
				fAllowance=(float) (0.46*fEmpBasicsalary);
				fGrossSalary=fGrossSalary+fAllowance;
				
				if(fGrossSalary<5000)
					fincomeTax=0;
				else if(fGrossSalary>5000 && fGrossSalary<=10000)
					fincomeTax=(float) (0.10* fGrossSalary);
				else if(fGrossSalary>10000 && fincomeTax<=20000)
					fincomeTax=(float) (.20*fGrossSalary);
				else if(fGrossSalary>20000)
					fincomeTax=(float) (.30*fGrossSalary);
				
				fNetSalary=fGrossSalary-fincomeTax;
				
    }
	
	void display(){
		System.out.println("EMPLOYEE ID\t"+iEmpID);
		System.out.println("EMPLOYEE NAME\t"+sEmpName);
		System.out.println("BASIC SALARY\t"+fEmpBasicsalary);
		System.out.println("ALLOWANCE\t"+fAllowance);
		System.out.println("GROSS PAY\t"+fGrossSalary);
		System.out.println("INCOME TAX\t"+fincomeTax);
		System.out.println("NET INCOME\t"+fNetSalary);
		
		
	}
}