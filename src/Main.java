public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(1000_000, 9.99, 12));
        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(1000_000, 9.99, 24));
        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(1000_000, 9.99, 36));




    }
}
