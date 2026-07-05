package selenium.cdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v148.network.Network;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Optional;

public class _1_NetworkCaptureAllRequestResponse {
    WebDriver driver;
    DevTools devTools;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        devTools = ((ChromeDriver)driver).getDevTools();
        devTools.createSession();
    }

    @Test
    public void captureAllNetworkRequests() {
        // Enable Network domain
        devTools.send(Network.enable(
                Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.empty()
        ));

        // Listen for requests SENT by browser
        devTools.addListener(Network.requestWillBeSent(), request -> {
            System.out.println("=====REQUEST=====");
            System.out.println("URL: "+request.getRequest().getUrl());
            System.out.println("Method: "+ request.getRequest().getMethod());
            System.out.println("Type: "+request.getType());
        });

        devTools.addListener(Network.responseReceived(), response -> {
            System.out.println("=====RESPONSE=====");
            System.out.println("URL: "+response.getResponse().getUrl());
            System.out.println("Status: "+response.getResponse().getStatus());
            System.out.println("MIME: "+response.getResponse().getMimeType());
        });

        driver.get("https://www.google.com");
        //We will see all network traffic printed!!!
    }

}
