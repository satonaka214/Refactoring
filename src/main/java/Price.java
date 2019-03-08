import java.util.Date;

public class Price {
    private static final Date SUMMER_START = new Date(2019, 8, 1);
    private static final Date SUMMER_END = new Date(2019, 9, 30);
    private static final double SUMMER_RATE = 1.5;
    private static final double WINTER_RATE = 2.5;
    private static final double WINTER_SERVICE_CHARGE = 100;
    private Date date;
    private int quantity;

    public Price(Date date, int quantity) {
        this.date = date;
        this.quantity = quantity;
    }

    public int getCharge() {
        return notSummer() ? winterCharge() : summerCharge();
    }

    private int winterCharge() {
        return (int) (this.quantity * WINTER_RATE + WINTER_SERVICE_CHARGE);
    }

    private int summerCharge() {
        return (int) (this.quantity * SUMMER_RATE);
    }

    private boolean notSummer() {
        return this.date.before(SUMMER_START) || this.date.after(SUMMER_END);
    }

}
