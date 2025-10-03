package proxyPattern;

public class ProxyAtmExample {
    public static void main(String[] args) {
        BankAccount bankAccount = new ATMAccount();
        bankAccount.withDraw();
    }
}
