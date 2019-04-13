import java.util.*;
public class Account {
 int accountId;
 String accountType;
 public static int balance;
 int netbalance;
 
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public int getBalance(){
    
    System.out.println("GetMethod:"+ balance);
    return balance;
}
public boolean withdraw(int a) {
	System.out.println("withDraw value:"+ a);
	int sbalance=getBalance();
	if(sbalance<a)
	{
		System.out.println("Invalid Amount");
		return false;
		
	}
	//netbalance=getBalance();
	sbalance-=a;
	System.out.println("Balance amount to be withdraw:"+ sbalance);
	return true;	
}




}
