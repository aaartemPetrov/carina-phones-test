package com.solvd.carinaphonestest;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carinaphonestest.page.base.components.BaseSearchedItem;
import com.solvd.carinaphonestest.service.HomePageService;
import com.solvd.carinaphonestest.service.SearchWindowFrameService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Locale;


public class OnlinerTest implements IAbstractTest {

    private static final Logger LOGGER = LogManager.getLogger(OnlinerTest.class);

    @Test
    public void checkTest() {
        HomePageService homePageService = new HomePageService();
        homePageService.searchProduct("samsung");

        SearchWindowFrameService searchWindowFrameService = homePageService.getSearchWindowFrameService();
        List<? extends BaseSearchedItem> searchedItems = searchWindowFrameService.getSearchedItems();

        SoftAssert softAssert = new SoftAssert();
        searchedItems.forEach(searchedItem -> {
            LOGGER.info(searchedItem.getProductTitle());
            softAssert.assertTrue(searchedItem.getProductTitle().toLowerCase(Locale.ROOT).contains("samsung"),
                    "Product title does not contain brand name \"Samsung\".");
        });
        softAssert.assertAll();
    }

}
