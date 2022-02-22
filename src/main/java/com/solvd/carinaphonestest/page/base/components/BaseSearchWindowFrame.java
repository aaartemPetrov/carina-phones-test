package com.solvd.carinaphonestest.page.base.components;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class BaseSearchWindowFrame extends AbstractPage {

    protected final By rootElement = By.xpath("//*[@class='modal-iframe']");

    public BaseSearchWindowFrame(WebDriver driver) {
        super(driver);
    }

    public abstract List<? extends BaseSearchedItem> getSearchedItems();

    public abstract void writeInSearchLine(String text);

}
