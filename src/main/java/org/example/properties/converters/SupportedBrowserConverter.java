package org.example.properties.converters;

import org.example.enumeration.SupportedBrowsers;

public final class SupportedBrowserConverter {
    public static SupportedBrowsers valueOfWebBrowser(String webBrowser) {
        return switch (webBrowser) {
            case "chrome" -> SupportedBrowsers.CHROME;
            case "firefox" -> SupportedBrowsers.FIREFOX;
            default -> throw new IllegalArgumentException("No appropriate browser found");
        };
    }
}
