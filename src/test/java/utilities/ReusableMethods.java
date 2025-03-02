package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReusableMethods {

    public static void wait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {

        }
    }

    public static void openNewTab() {
        try {
            ((ChromeDriver) Driver.getDriver()).executeScript("window.open();");
        } catch (Exception e) {
            try {
                ((FirefoxDriver) Driver.getDriver()).executeScript("window.open();");
            } catch (Exception ex) {
                try {
                    ((EdgeDriver) Driver.getDriver()).executeScript("window.open();");
                } catch (Exception exc) {
                    ((SafariDriver) Driver.getDriver()).executeScript("window.open();");
                }
            }
        }
    }

    public static void changeTab() {
        String currentHandle = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            if (!handle.equals(currentHandle)) {
                Driver.getDriver().switchTo().window(handle);
                break;
            }
        }
    }

    public static String takeTheSelectedText() {

        String jsScript = "return window.getSelection().toString();";

        String selectedText = (String) ((JavascriptExecutor) Driver.getDriver()).executeScript(jsScript);

        System.out.println("Seçilen metin: " + selectedText);
        return selectedText;
    }
}
