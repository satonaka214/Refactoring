public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getName() {
        return this.name;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public String getTelephoneNumber() {
        return ("(" + this.officeAreaCode + ")" + this.officeNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
