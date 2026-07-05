package selenium.cdp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v149.fetch.Fetch;
import org.openqa.selenium.devtools.v149.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v149.fetch.model.RequestStage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public class NetworkInterceptionTWJ {
    ChromeDriver driver;
    DevTools devTools;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        devTools = driver.getDevTools();
        devTools.createSession();
    }

    @Test
    public void blockAPICalls() {
        devTools.send(Fetch.enable(Optional.of(List.of(new RequestPattern(Optional.of("*"), Optional.empty(), Optional.of(RequestStage.REQUEST)))), Optional.empty()));
//    Fetch.enable(Optional.List.RequestPattern, Optional.boolean)

        devTools.addListener(Fetch.requestPaused(), requestPaused -> {
            System.out.println("=====INTERCEPTED=====");
            System.out.println(requestPaused.getRequest().getMethod());
            System.out.println(requestPaused.getRequest().getUrl());
            String url = requestPaused.getRequest().getUrl();
            if(url.contains("verify")){
                String jsonResponse = """
                        {
                            "status": "SUCCESS",
                            "message": "Citizen registration verified successfully.",
                            "transaction_id": "TXN-SNEHA-SHRUTI",
                            "amount_deducted": "₹00.00 (~$0.00 USD)",
                            "username": "SHRUTI",
                            "timestamp": "2026-06-16T13:16:48.717Z"
                        }
                        """;
                String jsonResponseBase64 = Base64.getEncoder().encodeToString(jsonResponse.getBytes(StandardCharsets.UTF_8));
                devTools.send(Fetch.fulfillRequest(requestPaused.getRequestId(), 200, Optional.empty(), Optional.empty(), Optional.of(jsonResponseBase64), Optional.empty()));

            }else{
                devTools.send(Fetch.continueRequest(requestPaused.getRequestId(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
            }
        });

        driver.get("http://mock-api.techwithjatin.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("sneha123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("sneha123");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("registerBtn"))).click();
    }
}
