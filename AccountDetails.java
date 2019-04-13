import java.util.*;
public class AccountDetails {
	
	    int Aid;
	    String AType;
	    public static int bln;
	    int widr;
	    Scanner sc=new Scanner(System.in);
	    public Account getAccountDetails()
	{
	    Account a = new Account();
	    System.out.println("Enter account id:");
	    Aid=sc.nextInt();
	    a.setAccountId(Aid);
	    System.out.println("Enter account type:");
	    AType=sc.next();
	    a.setAccountType(AType);
	    	System.out.println("Enter balance:");
	    bln=sc.nextInt();
	    //if(bln<=0) {
	    	label1: while(bln<=0) {
	        System.out.println("Balance should be positive");
	        bln=sc.nextInt();
	        continue label1;
	        }
	        
	   // }
	    if(bln>0){
	        a.setBalance(bln);
	        
	        }
	        return a;
	    }
	
	   public int getWithdrawAmount() {
		   System.out.println("Enter the amount to be withdrawn:");
		widr=sc.nextInt();
		//outer: if(widr<=0){
		label1: while(widr<=0) {
	        System.out.println("Amount should be positive");
	        widr=sc.nextInt();
	        continue label1;
			}
			//}
	   /* else{
	    return widr;
	       
	    }*/
		 return widr;
		
	   }
	

	public static void main(String[] args) {
		AccountDetails Ad=new AccountDetails();
		Ad.getAccountDetails();
		int wamount=Ad.getWithdrawAmount();
		Account acc=new Account();
		acc.withdraw(wamount);


	}

}
