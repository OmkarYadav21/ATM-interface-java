
package atm.pkginterface;
import java.util.*;
public class ATMINTERFACE {

    public static void main(String[] args) {
       AtmOperation op=new AtmOperationImpl();
       int atmnum=12345;
       int pin=123;
       Scanner sc=new Scanner(System.in);
       System.out.println("Welcome to ATM machine !!");
       System.out.print("Enter ATM number: ");
       int atmNum=sc.nextInt();
       System.out.print("Enter ATM pin: ");
       int atmPin=sc.nextInt();
       
       if((atmnum==atmNum)&&(pin==atmPin)){
           while(true){
               System.out.println("     1.View Available Balance \n    2.Withdraw Amount \n    3.Deposit Amount \n    4.View Mini Statement \n    5.Exit");
               System.out.print("Enter Choice :");
               int ch=sc.nextInt();
               if(ch==1){
                   op.viewBalance();
               }else if(ch==2){
                   System.out.print("Enter amount to withdrawn :");
                   double withrawAmt=sc.nextInt();
                   op.withdrawAmount(withrawAmt);
                   
               }else if(ch==3){
                   System.out.print("Enter Amount to Deposit :");
                   double deposit=sc.nextInt();
                   op.depositAmount(deposit);
               }else if(ch==4){
                   op.viewMinStatement();
               }else if(ch==5){
                   System.out.println("Collect Your Card \n Thank You & Have a Nice Day!!");
                   System.exit(0);
               } else{
                   System.out.println("Please Enter Correct Choice.");
               }
               
           }
       }else{
           System.out.println("Incorrect pin or atm number");
       }
    }
    
}
