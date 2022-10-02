import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class W3schools {
    WebDriver wd;

    @BeforeMethod
    public void precondition(){
        wd=new ChromeDriver();
        wd.manage().window().maximize();
        //wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void w3schoolsTest(){
        //numbers of rows
        List<WebElement> tr = wd.findElements(By.cssSelector("tr"));
        wd.findElements(By.xpath("//tr"));

        System.out.println("Rows in table-->" +tr.size());
        //numbers of columns
        List<WebElement> columns = wd.findElements(By.cssSelector("tr th"));
        wd.findElements(By.xpath("//tr/th"));

        System.out.println("Columns in table -->" +columns.size());

        //print rows 3
        List<WebElement> row3 = wd.findElements(By.cssSelector("tr:nth-child(3) td"));
        List<WebElement>ro3_1 =wd.findElements(By.xpath("//tr[3]//td"));

        for (WebElement el:ro3_1) {
            System.out.println(el.getText());
        }
        for (WebElement el:row3) {
            System.out.println(el.getText());
        }
        //print lastColumns
        List<WebElement> lastcolumn = wd.findElements(By.cssSelector("tr td:last-child"));
        wd.findElements(By.xpath("//tr/td[last()]"));

        for (WebElement el:lastcolumn) {
            System.out.println(el.getText());
        }
        //print Maria Anders
        System.out.println(wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)")).getText());
        System.out.println(wd.findElement(By.xpath("//*[text()='Maria Anders']")).getText());
        System.out.println(wd.findElement(By.xpath("//*[contains(.,'Maria')]")).getText());

    }
    @AfterMethod
    public void postConditions(){
        wd.close();
    }
}
