package com.solvd.carinaphonestest.service;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.solvd.carinaphonestest.page.base.BaseHomePage;

public class HomePageService implements ICustomTypePageFactory {

    private final BaseHomePage homePage;

    public HomePageService() {
        this.homePage = initPage(getDriver(), BaseHomePage.class);
        this.homePage.open();
    }

    public void searchProduct(String text) {
        this.homePage.searchProduct(text);
    }

    public SearchWindowFrameService getSearchWindowFrameService() {
        return this.homePage.getSearchWindowFrameService();
    }

}
