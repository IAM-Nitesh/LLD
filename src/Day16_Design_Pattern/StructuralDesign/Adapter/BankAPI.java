package Day16_Design_Pattern.StructuralDesign.Adapter;

public interface BankAPI {
    double getBalance(String accountNumber);

    boolean sendMoney(String fromAcc,
                      String toAcc,
                      double amount);
}
