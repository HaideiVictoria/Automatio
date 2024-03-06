package home_work2;

import Driver_Factory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 {public static void main(String[] args) throws InterruptedException {
    WebDriver driver = DriverSetUp.setUpDriver();
    driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
    WebElement carWebElement = driver.findElement(By.id("Carlist"));
    Select carList = new Select(carWebElement);
    carList.selectByValue("Renault Car");


    WebElement selectElement = driver.findElement(By.xpath("//select[@name='FromLB']"));
    Select select = new Select(selectElement);
    select.selectByVisibleText("France");
    select.selectByVisibleText("Germany");
    select.selectByVisibleText("Italy");
    select.selectByVisibleText("Spain");
    Thread.sleep(1500);

    WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[2]/table/tbody/tr/td[2]/input[1]"));
    button.click();
    Thread.sleep(1500);


    driver.quit();

}}