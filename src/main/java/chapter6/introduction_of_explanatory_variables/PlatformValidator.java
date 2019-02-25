package chapter6.introduction_of_explanatory_variables;

public class PlatformValidator {
    public void validate(String platform, String browser, int resize) {
        final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;

        if (isMacOs && isIEBrowser && wasInitialized() && wasResized) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private boolean wasInitialized() {
        return true;
    }
}
