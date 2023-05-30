public class CreditPaymentService {
    public double calculate(int amountOfCredit, double loanPercentage, int creditTerm) {
        double monthlyPercentage = loanPercentage/12/100;
        double meaningOne = 1+monthlyPercentage;
        double meaning = Math.pow(meaningOne, creditTerm);
        double annuityRatio = monthlyPercentage*meaning/(meaning - 1);
        double result = annuityRatio*amountOfCredit;
        int finalResult = (int) result;
        return finalResult;


    }
}
