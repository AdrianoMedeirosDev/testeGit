package section14HerancaPolimor.Heranca00.entities;

public class BusinessAcount extends Account{

    private Double loanLimit;

    public BusinessAcount() {
        super();
    }

    public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if(amount <= loanLimit) {
            balance += amount - 10;
        }
    }
}
