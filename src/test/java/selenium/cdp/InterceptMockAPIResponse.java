package selenium.cdp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v149.fetch.Fetch;
import org.openqa.selenium.devtools.v149.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v149.fetch.model.RequestStage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

public class InterceptMockAPIResponse {

    ChromeDriver driver;
    DevTools devTools;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        devTools = driver.getDevTools();
        devTools.createSession();
    }

//    @Test
//    public void mockAPIResponse{
//        // Enable Fetch domain (more powerful than Network for interception)
//        devTools.send(Fetch.enable(
//                Optional.of(List.of(
//                        new RequestPattern(
//                                Optional.of("**/api/users*"), // URL Pattern to intercept
//                                Optional.empty(),
//                                Optional.of(RequestStage.RESPONSE) // Intercept at response stage
//                        )
//                )),
//                Optional.of(false)
//        ));
//        devTools.addListener(Fetch.requestPaused(), pausedRequest -> {
//            // Check if this is the API call we want to mock
//            if(pausedRequest.getRequest().getUrl().contains("/api/users")){
//
//                //Our Fake Reponse body
//                String mockBody = """
//                        """;
//
//            }
//        });
//    }
}
