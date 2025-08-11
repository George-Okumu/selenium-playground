package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver(); // initiate the chrome driver

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // wait for 15 seconds

        // URL launch
        webDriver.get("https://georgeokumu.netlify.app/");

        // This will print the source code of the website after browser launch.
        System.out.println("Title:" + webDriver.getPageSource());


    }
}