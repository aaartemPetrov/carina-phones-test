package com.solvd.carinaphonestest.service;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.solvd.carinaphonestest.page.base.components.BaseSearchWindowFrame;
import com.solvd.carinaphonestest.page.base.components.BaseSearchedItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchWindowFrameService implements ICustomTypePageFactory {

    private final BaseSearchWindowFrame baseSearchWindowFrame;

    public SearchWindowFrameService() {
        this.baseSearchWindowFrame = initPage(getDriver(), BaseSearchWindowFrame.class);
    }

    public void writeInSearchLine(String text) {
        this.baseSearchWindowFrame.writeInSearchLine(text);
    }

    public List<? extends BaseSearchedItem> getSearchedItems() {
        Wait<WebDriver> webDriverWait = new WebDriverWait(this.baseSearchWindowFrame.getDriver(), 10);
        webDriverWait.until(webDriver -> !this.baseSearchWindowFrame.getSearchedItems().isEmpty());
        return this.baseSearchWindowFrame.getSearchedItems();
    }

}
