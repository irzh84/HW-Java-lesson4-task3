public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount;
        double numberOfMonths;
        double paymentMonthly = service.calculate(1_000_000, 12);
        System.out.println("1." + paymentMonthly);
        long payment = (long) paymentMonthly;

        System.out.println("Ежемесячный платеж: " + payment);

        paymentMonthly = service.calculate(1_000_000, 24);
        System.out.println("2." + paymentMonthly);

        payment = (long) paymentMonthly;
        System.out.println("Ежемесячный платеж: " + payment);

        paymentMonthly = service.calculate(1_000_000, 36);
        System.out.println("3." + paymentMonthly);

        payment = (long) paymentMonthly;
        System.out.println("Ежемесячный платеж: " + payment);
    }
}
