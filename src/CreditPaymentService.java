public class CreditPaymentService {
    public double calculate(double amount, double numberOfMonths) {
        double rate = 9.99 / 12 / 100;
        double paymentMonthly = amount * (rate * Math.pow((1 + rate), numberOfMonths) / (Math.pow((1 + rate), numberOfMonths) - 1));
        return paymentMonthly;
    }
}
