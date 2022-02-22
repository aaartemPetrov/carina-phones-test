package com.solvd.carinaphonestest.page.android.components;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carinaphonestest.page.base.components.BaseSearchedItem;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BaseSearchedItem.class)
public class AndroidSearchedItem extends BaseSearchedItem {

    @FindBy(xpath = ".//div[@class='product__title']//a[@class='product__title-link']")
    private ExtendedWebElement productTitle;

    public AndroidSearchedItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getProductTitle() {
        return this.productTitle.getText();
    }

}
