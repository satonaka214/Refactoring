import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class PriceTest {
    @Test
    public void priceSummerTest() {
        Date date = new Date();
        date.setYear(2019);
        date.setMonth(8);
        date.setDate(15);
        Price price = new Price(date, 10);

        int charge = price.getCharge();

        Assert.assertEquals(charge, 15);
    }

    @Test
    public void priceWinterTest() {
        Date date = new Date();
        date.setYear(2019);
        date.setMonth(12);
        date.setDate(25);
        Price price = new Price(date, 10);

        int charge = price.getCharge();

        Assert.assertEquals(charge, 125);
    }
}
