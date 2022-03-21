public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int paymentForTwelweMonths = (int) service.calculate(1_000_000, 12, 9.99);
        System.out.println("Размер ежемесячного платежа для кредита, сроком на 12 месяцев (руб.): " + paymentForTwelweMonths);

        int paymentForTwentyFourMonths = (int) service.calculate(1_000_000, 24, 9.99);
        System.out.println("Размер ежемесячного платежа для кредита, сроком на 24 месяца (руб.): " + paymentForTwentyFourMonths);

        int paymentForThirtySixMonths = (int) service.calculate(1_000_000, 36, 9.99);
        System.out.println("Размер ежемесячного платежа для кредита, сроком на 36 месяцев (руб.): " + paymentForThirtySixMonths);

    }

}