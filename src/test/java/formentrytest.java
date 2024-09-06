import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class formentrytest {

    public static void main (String[]argv)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //textboxes
        formPage.fname(driver).sendKeys("Kumar");
        formPage.lname(driver).sendKeys("Satyam");
        formPage.jobtitle(driver).sendKeys("Software Engineer");

        //radio button & Checkboxes
        formPage.gradschoolRadio(driver).click();
        formPage.maleCheckbox(driver).click();

        //dropdownmenu
        formPage.dropdownmenu(driver).click();
        formPage.dropdownoption(driver).click();

        //datepicker
        formPage.datepicker(driver).sendKeys("09/05/2024");

        //submit
        formPage.submitbutton(driver).click();

        //formconfirmation page


        driver.quit();





    }
}
