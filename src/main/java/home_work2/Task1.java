package home_work2;

import Driver_Factory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {public static void main(String[] args) throws InterruptedException {
    WebDriver driver = DriverSetUp.setUpDriver();
    driver.get("https://demo.guru99.com/test/drag_drop.html");

    By firstOrangeButton = By.xpath("//a[@class='button button-orange'][text()=' 5000 ']");
    By secondOrangeButton = By.xpath("(//li[@id='fourth']/a[@class='button button-orange' and contains(text(),'5000')])[2]");
    By bank=By.id("credit2");
    By sale=By.id("credit1");
    By debitAccountFirst=By.id("bank");
    By debitAccountSecond=By.id("amt7");
    By creditAccountFirst=By.id("loan");
    By creditAccountSecond=By.id("amt8");

    Actions actions = new Actions(driver);
    actions.dragAndDrop(driver.findElement(firstOrangeButton), driver.findElement(debitAccountSecond)).perform();
    Thread.sleep(1500);
    actions  .dragAndDrop(driver.findElement(secondOrangeButton), driver.findElement(creditAccountSecond)).perform();
    Thread.sleep(1500);
    actions . dragAndDrop(driver.findElement(bank), driver.findElement(debitAccountFirst)).perform();
    Thread.sleep(1500);
    actions . dragAndDrop(driver.findElement(sale), driver.findElement(creditAccountFirst)).perform();

    Thread.sleep(1500);
    driver.findElement(By.id("equal")).click();
    driver.quit();
}}

