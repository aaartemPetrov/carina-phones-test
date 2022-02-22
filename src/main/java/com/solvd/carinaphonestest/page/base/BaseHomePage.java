package com.solvd.carinaphonestest.page.base;


import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carinaphonestest.service.SearchWindowFrameService;
import org.openqa.selenium.WebDriver;

public abstract class BaseHomePage extends AbstractPage {

    public BaseHomePage(WebDriver driver) {
        super(driver);
    }

    public abstract void searchProduct(String text);

    public abstract SearchWindowFrameService getSearchWindowFrameService();

}
