package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
    public WebDriver driver;

    @Test
    public void automationMethod(){
        //deschidem un browser de Chrome

        driver=new ChromeDriver();

        //accesam o pagina Web
        driver.get("https://demoqa.com");

        //facem browser-ul in modul maximize
        driver.manage().window().maximize();

        //facem un scroll
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0.400)"); //0 este x si 400 este y

        //declaram un element
        WebElement elementsField=driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsField.click();

        WebElement webTableField= driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTableField.click();

        WebElement addNewRecordButtonField = driver.findElement(By.id("addNewRecordButton"));
        addNewRecordButtonField.click();

        WebElement firstNameField = driver.findElement(By.id("firstName"));
        String firstNameValue = "Alina";
        firstNameField.sendKeys(firstNameValue);

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        String lastNameValue = "Alex";
        lastNameField.sendKeys(lastNameValue);

        WebElement userEmailField = driver.findElement(By.id("userEmail"));
        String userEmailValue = "alex.alina@gmail.com";
        userEmailField.sendKeys(userEmailValue);

        WebElement ageField = driver.findElement(By.id("age"));
        String ageValue = "34";
        ageField.sendKeys(ageValue);

        WebElement salaryField = driver.findElement(By.id("salary"));
        String salaryValue = "23456";
        salaryField.sendKeys(salaryValue);

        WebElement departmentField = driver.findElement(By.id("department"));
        String departmentValue = "Contabilitate";
        departmentField.sendKeys(departmentValue);
    }
}
