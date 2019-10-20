public class SavingsAccount {

    private static double annualInterestRate;      //instance vars modified by class SavingsTest ~
    private double currentMonthlyInterest;
    private double savingsBalance;


    public void setSavingsBalance(double userSavingsBalance) {
        savingsBalance = userSavingsBalance;
    }
    public double getSavingsBalance () {
        return savingsBalance;
    }
    public void calculateMonthlyInterest () {
        currentMonthlyInterest = savingsBalance * (annualInterestRate / 12.0); //calc interest on balance ~
        savingsBalance = savingsBalance + currentMonthlyInterest;              //add to account ~
    }
    public static void modifyInterestRate (double modifiedInterestRate) {
        annualInterestRate = modifiedInterestRate;
    }
}
