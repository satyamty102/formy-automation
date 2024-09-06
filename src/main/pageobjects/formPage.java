import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class formPage {
    private static WebElement element = null;

    //Textbox Elements
    public static WebElement fname(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        return element;
    }
    public static WebElement lname(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        return element;
    }
    public static WebElement jobtitle(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"job-title\"]"));
        return element;
    }

    //Radio Buttons Elements
    public static WebElement highSchoolRadio(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"radio-button-1\"]"));
        return element;
    }
    public static WebElement collegeRadio(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"radio-button-2\"]"));
        return element;
    }
    public static WebElement gradschoolRadio(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"radio-button-3\"]"));
        return element;
    }

    //Checkboxes
    public static WebElement maleCheckbox(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]"));
        return element;
    }

    //dropdown menu

    public static WebElement dropdownmenu(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"select-menu\"]"));
        return element;
    }
    public static WebElement dropdownoption(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[3]"));
        return element;
    }

    public static WebElement datepicker(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        return element;
    }

    public static WebElement submitbutton(WebDriver driver)
    {
        element = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        return element;
    }

    public static WebElement waitmethod(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div")));
        return element;
    }

}
