package quiz2;
public class AccountTest{   
    public static void main(String[] args){      
        Account acc1 = new Account("John", 60, 75);      
        Account acc2 = new Account("Mary", 82, 95); 
        doAccount(acc1);
        doAccount(acc2);
    }   
    public static void doAccount(Account acc){
        System.out.printf("name:%s sum of scores:%d\n",acc.getName(),acc.sum());
    }
}