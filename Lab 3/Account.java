
package lab4;


public class Account {
    double balance;
    String Account_Num;
    public Account(){
        Account_Num = "00000";
        balance = 4000;
        
    }
    public Account(double bal , String num){
        balance = bal;
        Account_Num = num;
    }
    public void deposit(double dep , String num){
        double d = dep;
        String n = num;
        System.out.println("account number " + n +" has balance " + balance);
        double newBalance = balance  + d;
        System.out.println("After deposit " + d + "account number " + n +" has balance "  + newBalance);
        balance = newBalance;
    }
    public void withDraw(double wit , String num){
        double w  = wit;
        String n = num;
        System.out.println("account number " + n +" has balance " + balance);
        double newBalance = balance - wit;
        System.out.println("After withdraw " + w +" account number " + n +" has balance "  + newBalance);
    }
}
