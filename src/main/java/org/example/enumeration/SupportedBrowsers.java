package org.example.enumeration;

import org.example.invoker.WebDriverInvoker;
import org.example.invoker.implementations.ChromeInvoker;
import org.example.invoker.implementations.FireFoxInvoker;
import org.openqa.selenium.WebDriver;

public enum SupportedBrowsers {

    CHROME(new ChromeInvoker()),
    FIREFOX(new FireFoxInvoker());

    private WebDriverInvoker webDriverInvoker;

    SupportedBrowsers(WebDriverInvoker webDriverInvoker) {
        this.webDriverInvoker = webDriverInvoker;
    }

    public WebDriver getWebDriver () {
        return webDriverInvoker.invokeWebDriver();
    }
}
