package com.solvd.carinaphonestest.page.desktop.components;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carinaphonestest.page.base.components.BaseSearchWindowFrame;
import com.solvd.carinaphonestest.page.base.components.BaseSearchedItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BaseSearchWindowFrame.class)
public class DesktopSearchWindowFrame extends BaseSearchWindowFrame {

    @FindBy(xpath = "//*[@id='search-page']//li[contains(@class, 'search__result')]")
    private List<DesktopSearchedItem> searchedItems;

    @FindBy(xpath = "//*[@class='search__input']")
    private ExtendedWebElement searchInput;

    public DesktopSearchWindowFrame(WebDriver driver) {
        super(driver);
        setRootElement(driver.findElement(this.rootElement));
        this.getDriver().switchTo().frame(this.getRootElement());
    }

    public List<? extends BaseSearchedItem> getSearchedItems() {
        return this.searchedItems;
    }

    @Override
    public void writeInSearchLine(String text) {
        this.searchInput.type(text);
    }

}
