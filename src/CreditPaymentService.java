public class CreditPaymentService {
    public double calculate(double credit, double date, double percent) {

        int payment = (int) (credit * ((percent / 12 / 100) + ((percent / 12 / 100) / ((Math.pow(1 + (percent / 12 / 100), date)) - 1))));

        return payment;
    }
}
