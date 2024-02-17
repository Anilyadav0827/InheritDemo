package InheritanceApplication;

public class RetailAccount extends Insurance {
    private String minBalance;
    private String limit;
    public RetailAccount(String accountNumber, String balance, String status,String minBalance,String limit) {
        super(accountNumber, balance, status);
    }
}
