public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculate = new CreditPaymentService();
        System.out.println(CreditPaymentService.calculate(1_000_000, 1, 9.99));
        System.out.println(CreditPaymentService.calculate(1_000_000, 2, 9.99));
        System.out.println(CreditPaymentService.calculate(1_000_000, 3, 9.99));
    }
}