import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class TicketService {
    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://ticket-service-69443.firebaseapp.com/");
    }

    @Test
    public void goToRegistrationForm(){
     WebElement loginBtn=wd.findElement(By.cssSelector("a[href='/login']"));
     loginBtn.click();
     WebElement registerBtn =wd.findElement(By.cssSelector("button.mb-4"));
     registerBtn.click();

    }








    @Test
    public void cssLocatorsTest(){
        // By.id
        wd.findElement(By.id("root"));   //<div id="root"></div>

        // By tagName
        wd.findElement(By.tagName("div"));//<div></div>
        wd.findElement(By.tagName("a"));  // <a></a>
        wd.findElement(By.tagName("button"));   // <button></button>

        //By.className  <div class='nameclass"></div>
        WebElement el = wd.findElement(By.className("fa"));
        List<WebElement> lis = wd.findElements(By.className("fa"));

       //  By.name   <div name= "textName"></div>
        // By.linkText By.partialLinkText   ["","","","",""]
        wd.findElement(By.linkText("Login"));
        wd.findElement(By.partialLinkText("Log"));


        /// cssLocators
        wd.findElement(By.cssSelector(""));

        // cssLocators  find by tagname
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("input"));
        // // cssLocators  find by id --->#
        wd.findElement(By.cssSelector("#root"));

        // cssLocators  find by class --->  .
        wd.findElement(By.cssSelector(".fa"));

        // // cssLocators  find by attribute  [attribute='value']
        wd.findElement(By.cssSelector("[href='/login']"));


        // practics
        wd.findElement(By.cssSelector("div.container-fluid.header"));


    }
}
