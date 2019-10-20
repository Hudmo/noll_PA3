public class Application {
    public static void main (String [] args) {

        int i;
        SavingsAccount saver1 = new SavingsAccount();       //creates objects s1/2 of class SA
        SavingsAccount saver2 = new SavingsAccount();

        saver1.modifyInterestRate(0.04);        //couldn't call mIR without ref. to saver1/2
        saver2.modifyInterestRate(0.04);

        saver1.setSavingsBalance(3000.00);
        saver2.setSavingsBalance(2000.00);
        for (i = 1; i < 13; ++i) {
            System.out.println("---------------Month " + i + "---------------");
            saver1.calculateMonthlyInterest();
            System.out.println("Savings balance: " + saver1.getSavingsBalance());
            saver2.calculateMonthlyInterest();
            System.out.println("Savings balance: " + saver2.getSavingsBalance());
            System.out.print("\n");
        }
        //repeat at 5% interest:
        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        System.out.println("-------------Month 1 at 5%-------------");
        saver1.calculateMonthlyInterest();
        System.out.println("Savings balance: " + saver1.getSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.println("Savings balance: " + saver2.getSavingsBalance());
        System.out.print("\n");
    }
}
