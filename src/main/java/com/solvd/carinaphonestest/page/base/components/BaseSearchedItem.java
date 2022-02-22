package com.solvd.carinaphonestest.page.base.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class BaseSearchedItem extends AbstractUIObject {

    public BaseSearchedItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract String getProductTitle();

}
