public class Person {
    private String name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return this.name;
    }

    public String getOfficeAreaCode() {
        return this.officeTelephone.getAreaCode();
    }

    public String getOfficeNumber() {
        return this.officeTelephone.getNumber();
    }

    public String getTelephoneNumber() {
        return ("(" + this.officeTelephone.getAreaCode() + ")" + this.officeTelephone.getNumber());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeTelephone.setAreaCode(officeAreaCode);
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeTelephone.setNumber(officeNumber);
    }
}
