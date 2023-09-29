public class CreditPaymentService {
    public static double calculate (int summ, double years, double percents) {
        int months = 12; // переменная для вычисления количества месяцев в сроке кредита
        double term = years * months; // вычисляем количество месяцев в сроке кредита (тип double для возможности ввода не целых лет, наприм. 1.5 = полтора года)
        double monthly = percents / 12 / 100; // ежемесячная процентная ставка
        double coefficient = (monthly * Math.pow(1 + monthly, term)) / (Math.pow(1 + monthly, term) - 1); // вычисляем коэффициент
        double payment = summ * coefficient; // умножаем сумму на коэф. и получаем ежемесячный платеж
        return (int) payment;
    }
}