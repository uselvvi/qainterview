package com.pearson.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

    private final WebDriver driver;

    public GooglePage(){
        //download from here
        //https://chromedriver.storage.googleapis.com/index.html?path=2.37/
        System.setProperty("webdriver.chrome.driver","/home/vins/.arquillian/drone/chrome/2.37/chromedriver");
        this.driver = new ChromeDriver();
    }

    public void launchSite(){
        driver.get("https://www.google.com");
    }


    public void searchFor(String s) {

    }

    public void printSearchResults() {

    }

    public int getResultsCount() {

        return 0;
    }
}
