package com.pearson.test;

import com.pearson.pages.GooglePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTest {

    private GooglePage googlePage;

    @BeforeTest
    public void setup(){
        this.googlePage = new GooglePage();
    }

    @Test(dataProvider = "keyword")
    public void searchTest(String searchKeyword){

        googlePage.launchSite();

        //enters the keyword & clicks on the search button
        googlePage.searchFor("");

        //once the search results are displayed, just print
        googlePage.printSearchResults();

        //get the results count
        int resultsCount = googlePage.getResultsCount();

        //results count should be above 0
        Assert.assertTrue(resultsCount > 0);
    }


    @DataProvider(name = "keyword")
    public Object[][] searchKeywords() {
        return new Object[][]{
                {"pearson"},
                {"qa"}
        };
    }

}
