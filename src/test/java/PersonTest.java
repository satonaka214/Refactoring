import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void setNameTest() {
        Person person = new Person();

        person.setName("Tarou");

        Assert.assertEquals(person.getName(), "Tarou");
    }

    @Test
    public void setOfficeNumberTest() {
        Person person = new Person();

        person.setOfficeNumber("X0-1234-5678");

        Assert.assertEquals(person.getOfficeNumber(), "X0-1234-5678");
    }

    @Test
    public void setOfficeAreaCodeTest() {
        Person person = new Person();

        person.setOfficeAreaCode("81");

        Assert.assertEquals(person.getOfficeAreaCode(), "81");
    }

    @Test
    public void telephoneNumberTest() {
        Person person = new Person();

        person.setOfficeAreaCode("81");
        person.setOfficeNumber("X0-1234-5678");

        Assert.assertEquals(person.getTelephoneNumber(), "(81)X0-1234-5678");
    }
}
