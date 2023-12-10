import java.util.Date;

class Currency {

    private final Double value;
    private final Date date;

    public Currency(Double value) {
        this.value = value;
        this.date = new Date();
    }

    public Double getValue() {
        return value;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }
}