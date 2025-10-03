package proxyPattern;

public class SBIAccount implements BankAccount{
    @Override
    public void withDraw() {
        System.out.println("Withdraw from sbi");
    }
}
