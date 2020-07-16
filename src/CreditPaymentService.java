public class CreditPaymentService {
    public float calculate(float sum, float persent, int period) {
        float payment = 0, monthly_interest = 0;
        int a, b, c = 0, period_mon;
        float monthly_payment_main = sum / (period * 12); //сумма ежемесячного платежа на погашение основного долга
        period_mon = period * 12; // срок кредита в месяцах
        for (a = period_mon, b = 1; b <= a; b++) {
            monthly_interest = sum * persent / 100 / 12; // ежемесячный % банка
            payment = payment + (monthly_interest + monthly_payment_main);
            sum = sum - monthly_payment_main;
            //c++;
            //System.out.println("процент за " + c + " месяц " + monthly_interest);
        }
        payment = payment / (period * 12);
        return payment;

    }
}
