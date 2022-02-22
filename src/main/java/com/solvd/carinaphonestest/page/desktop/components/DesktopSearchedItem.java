package com.solvd.carinaphonestest.page.desktop.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carinaphonestest.page.base.components.BaseSearchedItem;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DesktopSearchedItem extends BaseSearchedItem {

    @FindBy(xpath = ".//div[@class='product__title']//a[@class='product__title-link']")
    private ExtendedWebElement productTitle;

    public DesktopSearchedItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getProductTitle() {
        return this.productTitle.getText();
    }

}
