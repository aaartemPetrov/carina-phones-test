package com.solvd.carinaphonestest.page.desktop;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carinaphonestest.page.base.HomePageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

}
