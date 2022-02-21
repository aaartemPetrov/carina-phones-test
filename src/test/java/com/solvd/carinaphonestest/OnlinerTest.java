package com.solvd.carinaphonestest;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carinaphonestest.service.HomePageService;
import org.testng.annotations.Test;

public class OnlinerTest implements IAbstractTest {

    @Test
    public void checkTest() {
        HomePageService homePageService = new HomePageService();
    }

}
