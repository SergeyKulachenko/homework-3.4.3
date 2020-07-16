public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();

        int payment1 = (int) payment.calculate(1_000_000, 9.99f, 1);
        System.out.println("Ежемесячный платёж при кредитовании на 1 год составляет  " + payment1 + " рублей");

        int payment2 = (int)payment.calculate(1_000_000, 9.99f, 2);
        System.out.println("Ежемесячный платёж при кредитовании на 2 года составляет  " + payment2 + " рублей");

        int payment3 = (int)payment.calculate(1_000_000, 9.99f, 3);
        System.out.println("Ежемесячный платёж при кредитовании на 3 года составляет  " + payment3 + " рублей");


    }
}
