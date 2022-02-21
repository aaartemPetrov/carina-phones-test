package com.solvd.carinaphonestest.service;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.solvd.carinaphonestest.page.base.HomePageBase;

public class HomePageService implements ICustomTypePageFactory {

    private HomePageBase homePage;

    public HomePageService() {
        this.homePage = initPage(getDriver(), HomePageBase.class);
        this.homePage.open();
    }

}
