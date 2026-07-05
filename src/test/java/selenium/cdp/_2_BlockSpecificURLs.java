package selenium.cdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v149.network.model.BlockPattern;
import org.openqa.selenium.devtools.v149.network.Network;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;


//Block Ads/Images
public class _2_BlockSpecificURLs {
    WebDriver driver;
    DevTools devTools;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        devTools = ((ChromeDriver)driver).getDevTools();
        devTools.createSession();
    }

    @Test
    public void blockNetworkRequests() {
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));

        List<BlockPattern> blockPatterns = List.of(
                new BlockPattern("*://*/*.png", true),  // block all PNG images
                new BlockPattern("*://*/*.jpg", true),     // block all JPG images
                new BlockPattern("*://*/*.gif", true),     // block all GIFs
                new BlockPattern("*://*/*ads*", true),       // block ad URLs
                new BlockPattern("*://*/*analytics*", true) // block analytics
//                new BlockPattern("*://*/*token*", true), // block token
//                new BlockPattern("*://*/*challenge.js*", true),
//                new BlockPattern("*://*/*.js", true) // block js scripts

        );
        // Block specific URL patterns
        devTools.send(Network.setBlockedURLs( Optional.of(blockPatterns), Optional.empty()));

//        devTools.addListener(org.openqa.selenium.devtools.v148.network.Network.requestWillBeSent(), request -> {
//            System.out.println("=====REQUEST=====");
//            System.out.println("URL: "+request.getRequest().getUrl());
//            System.out.println("Method: "+ request.getRequest().getMethod());
//            System.out.println("Type: "+request.getType());
//        });
//
//        devTools.addListener(org.openqa.selenium.devtools.v148.network.Network.responseReceived(), response -> {
//            System.out.println("=====RESPONSE=====");
//            System.out.println("URL: "+response.getResponse().getUrl());
//            System.out.println("Status: "+response.getResponse().getStatus());
//            System.out.println("MIME: "+response.getResponse().getMimeType());
//        });
        driver.get("https://www.amazon.com");
        // Page loads MUCH faster without images & ads!
    }
}
