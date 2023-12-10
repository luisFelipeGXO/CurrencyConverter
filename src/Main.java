public class Main {
    public static void main(String[] args) {

        Currency currency = new Currency(10.0);
        Converter converter = new Converter("Brazil");

        Double converterUSA = converter.usaConverter(currency.getValue());
        Double converterCan = converter.canadaConverter(currency.getValue());
        Double converterEuro = converter.euroConverter(currency.getValue());

        System.out.println(converterUSA);
        System.out.println(converterCan);
        System.out.println(converterEuro);
    }
}