import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IndexHtml {
    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd=new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("file:///Users/tayahatum/Downloads/apk/index.html");
    }

    @Test
    public void firstTest(){
        WebElement item1 = wd.findElement(By.xpath("//a[text()='Item 1']"));
        item1.click();
        String item1Text =item1.getText();   //Item 1

        WebElement container = wd.findElement(By.cssSelector("#alert p"));
        String message = container.getText();  //Clicked by Item 1

        if(message.contains(item1Text)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        Assert.assertTrue(message.contains(item1Text));
    }
}
