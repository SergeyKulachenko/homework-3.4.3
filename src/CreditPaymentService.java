public class CreditPaymentService {
    public float calculate(float sum, float persent, int period) {
        float payment = 0, monthly_interest = 0, monthly_bid = 0, coefficient = 0;
        monthly_bid = persent / 12 / 100;                             // месячная процентная ставка
        coefficient = (monthly_bid * (float) Math.pow((1 + monthly_bid), period))
                / ((float) Math.pow((1 + monthly_bid), period) - 1);  //коэффициет аннуиетета
        payment = sum * coefficient;                                  //ежемесячный платёж
        return payment;
    }
}
