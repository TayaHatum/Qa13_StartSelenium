import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsXPath {



        //WebDriver wd = new ChromeDriver();
        WebDriver wd = new FirefoxDriver();

        @Test
        public void test(){
//implementation 'org.seleniumhq.selenium:selenium-java:3.141.59'
        }

        @Test
        public void fromCssToxPath(){
            wd.findElement(By.cssSelector("a[href]"));

            wd.findElement(By.cssSelector("[href ^='/ho']"));

            wd.findElement(By.cssSelector("div.focus"));

            wd.findElement(By.cssSelector("input[type='text']"));

            wd.findElement(By.cssSelector("div #host"));

            wd.findElement(By.cssSelector("table#country tr:nth-child(3) td:last-child"));

            wd.findElement(By.cssSelector("div#idName li:first-child"));

            wd.findElement(By.cssSelector("div.sort>div:nth-child(2)"));


        }


        @Test
        public void fromXPathToCss(){
            wd.findElement(By.xpath("//*[@id='host']"));

            wd.findElement(By.xpath("//button[@class='submit']"));

            wd.findElement(By.xpath("//div/div/img[@src='paris.jpg']"));

            wd.findElement(By.xpath("//div[@class='first' and @class='list']"));

            wd.findElement(By.xpath("//div[contains(@class,'st')]"));

            wd.findElement(By.xpath("//div[@id= 'idName']//h1[last()]"));

            wd.findElement(By.xpath("//table[@id]//tr[last()]"));

            wd.findElement(By.xpath("//a[starts-with(@id,'ret')]"));


        }
    }

