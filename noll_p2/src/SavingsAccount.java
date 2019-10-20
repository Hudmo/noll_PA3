public class SavingsAccount {

    private static double annualInterestRate;      //instance vars modified by class SavingsTest ~
    private double currentMonthlyInterest;
    private double savingsBalance;


    public void calculateMonthlyInterest (double savingsBalanceSaver) {
        savingsBalance = savingsBalanceSaver;
        currentMonthlyInterest = savingsBalance * (annualInterestRate / 12.0); //calc interest on balance ~ //change monthlyInterest to currentMonthlyInterest ::
        savingsBalance = savingsBalance + currentMonthlyInterest;              //add to account ~
        System.out.println("Savings balance: " + savingsBalance);
        savingsBalanceSaver = savingsBalance;
    }
    public static void modifyInterestRate (double modifiedInterestRate) {
        annualInterestRate = modifiedInterestRate;
    }
}
