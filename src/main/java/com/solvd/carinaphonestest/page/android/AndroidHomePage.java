package com.solvd.carinaphonestest.page.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carinaphonestest.page.base.BaseHomePage;
import com.solvd.carinaphonestest.service.SearchWindowFrameService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BaseHomePage.class)
public class AndroidHomePage extends BaseHomePage {

    private SearchWindowFrameService searchWindowFrameService;
    @FindBy(xpath = "//input[contains(@class,'fast-search')]")
    private ExtendedWebElement searchButton;

    public AndroidHomePage(WebDriver driver) {
        super(driver);
    }

    private void clickSearchButton() {
        this.searchButton.click();
    }

    @Override
    public void searchProduct(String text) {
        this.searchButton.click();
        this.searchWindowFrameService = new SearchWindowFrameService();
        this.searchWindowFrameService.writeInSearchLine(text);
    }

    @Override
    public SearchWindowFrameService getSearchWindowFrameService() {
        return this.searchWindowFrameService;
    }

}
