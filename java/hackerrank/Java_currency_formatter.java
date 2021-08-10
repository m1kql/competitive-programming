package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Java_currency_formatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        Locale unitedStates = Locale.US;
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;

        NumberFormat usCurrency = NumberFormat.getCurrencyInstance(unitedStates);
        NumberFormat chinaCurrency = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat frenchCurrency = NumberFormat.getCurrencyInstance(franceLocale);

        String us = usCurrency.format(payment);
        String china = chinaCurrency.format(payment);
        String france = frenchCurrency.format(payment);

        String india = us.replaceAll("\\$", "Rs.");

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
