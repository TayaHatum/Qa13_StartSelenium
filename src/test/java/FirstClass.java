import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstClass {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
    WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","/Users/tayahatum/Downloads/chromedriver");
        wd = new ChromeDriver();


        //wd.get("https://selenium.dev"); // without history
        wd.navigate().to("https://selenium.dev");  // with history
       // wd.navigate().back();
      //  wd.navigate().forward();
       // wd.navigate().refresh();

    }

    @Test
    public void loginSuccess(){
        // open form login   ---> LoginTab + click
        // fill email valid data  ----> email +click +clear+type email
        //fill password valid data  -----> password + +click +clear+type password
        //click login button  ----> login button +click

        // Expected result = Actual result


    }



}
