package proxyPattern;

public class ATMAccount implements BankAccount{
    BankAccount sbiAccount;
    @Override
    public void withDraw() {
        if(isAuthenticated()){
            System.out.println("Now you are inside ATM");
            sbiAccount= new SBIAccount();
            sbiAccount.withDraw();
        }
    }

    private static boolean isAuthenticated() {
        System.out.println("User Authenticated");
        return true;
    }
}
