public class Converter {
    double rateUSD;
    double rateEUR;
    double rateJPY;

    Converter(double usd, double eur, double jpy) {
        rateUSD = usd;
        rateEUR = eur;
        rateJPY = jpy;
    }

    void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + String.format("%.2f", rubles / rateUSD));
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " +  String.format("%.2f",rubles / rateEUR));
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " +  String.format("%.2f",rubles / rateJPY));
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}