package section14HerancaPolimor.Heranca00.application;

import section14HerancaPolimor.Heranca00.entities.BusinessAcount;

public class Program {

    public static void main(String[] args) {

        BusinessAcount account = new BusinessAcount(8010, "Bob Brown", 0.0, 500.0);

        System.out.println(account.getBalance());
    }
}
