import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc  = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5444");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", ".Calculator");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el6.click();

    }
}