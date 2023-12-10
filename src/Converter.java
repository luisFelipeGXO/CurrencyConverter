import java.util.Date;

public class Converter {

    private String country;

    public Converter(String country) {
        this.country = country;
    }

    public Double usaConverter(Double currency) {
        return currency * ConversionRates.USA;
    }

    public Double canadaConverter(Double currency) {
        return currency * ConversionRates.CANADA;
    }

    public Double euroConverter(Double currency) {
        return currency * ConversionRates.EURO;
    }

    @Override
    public String toString() {
        return "Country: " + country;
    }
}