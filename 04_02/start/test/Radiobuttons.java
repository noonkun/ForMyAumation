import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\noon3\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/checkbox");

       WebElement radio1 = driver.findElement(By.cssSelector("#checkbox-1"));//(By.cssSelector("input[id='#checkbox-1']"));
       radio1.click();

       WebElement radio2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/input"));
       radio2.click();

       WebElement radio3 = driver.findElement(By.id("checkbox-3"));
       radio3.click();

        driver.quit();
    }
}
