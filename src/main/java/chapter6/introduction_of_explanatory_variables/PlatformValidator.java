package chapter6.introduction_of_explanatory_variables;

public class PlatformValidator {
    public void validate(String platform, String browser, int resize) {
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
                wasInitialized() && resize > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private boolean wasInitialized() {
        return true;
    }
}
