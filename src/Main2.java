import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc  = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5444");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        dc.setCapability("appPackage", "com.example.loginflow");
        dc.setCapability("appActivity", "MainActivity");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        MobileElement el1 = (MobileElement) driver.findElementById("com.example.loginflow:id/login");
        el1.sendKeys("sandeep");
        MobileElement el2 = (MobileElement) driver.findElementById("com.example.loginflow:id/password");
        el2.sendKeys("123456");
        MobileElement loginButton = driver.findElementById("com.example.loginflow:id/buttonLogin");
        loginButton.click();
    }
}