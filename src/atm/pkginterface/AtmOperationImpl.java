
package atm.pkginterface;
import java.util.*;
public class AtmOperationImpl implements AtmOperation{
    ATM atm=new ATM();
    Map<Double, String> ministmt=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
            if(withdrawAmount<= atm.getBalance()){
                ministmt.put(withdrawAmount, "Amount Withdrawn");
                System.out.println("Collect the Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
        }else{
            System.out.println("Insufficient Balance !!");

        }
        }
        else{
            System.out.println("Please enter amount in multiple of 500rs");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount, "Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMinStatement() {
        for(Map.Entry<Double, String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    
}
