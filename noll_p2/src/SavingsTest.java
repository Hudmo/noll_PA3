public class SavingsTest {
    public static void main (String [] args) {

        int i;
        SavingsAccount saver1 = new SavingsAccount();       //creates objects s1/2 of class SA
        SavingsAccount saver2 = new SavingsAccount();

        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest(3000.00);
        saver2.calculateMonthlyInterest(2000.00);

        for (i = 1; i < 13; ++i) {
            System.out.println("---------------Month " + i + "---------------");
            saver1.calculateMonthlyInterest(1);
            saver2.calculateMonthlyInterest(1);
            System.out.print("\n");
        }
        //repeat at 5% interest:
        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest(1);
        saver2.calculateMonthlyInterest(1);
    }
}