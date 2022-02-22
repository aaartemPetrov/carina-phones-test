package com.solvd.carinaphonestest.page.desktop;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carinaphonestest.page.base.BaseHomePage;
import com.solvd.carinaphonestest.service.SearchWindowFrameService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BaseHomePage.class)
public class DesktopHomePage extends BaseHomePage {

    private SearchWindowFrameService searchWindowFrameService;
    @FindBy(xpath = "//*[@id='fast-search']//input[@type='text']")
    private ExtendedWebElement searchLine;

    public DesktopHomePage(WebDriver driver) {
        super(driver);
    }

    private void writeInSearchLine(String text) {
        this.searchLine.type(text);
    }

    @Override
    public void searchProduct(String text) {
        this.writeInSearchLine(text);
        this.searchWindowFrameService = new SearchWindowFrameService();
    }

    @Override
    public SearchWindowFrameService getSearchWindowFrameService() {
        return this.searchWindowFrameService;
    }

}
