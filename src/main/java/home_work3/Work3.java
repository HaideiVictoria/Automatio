package home_work3;

import Driver_Factory.DriverSetUp;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Work3 { public static void openLinkInNewTab(WebDriver driver, String url){
    Set<String> set1 = driver.getWindowHandles();
    ((JavascriptExecutor)driver).executeScript("window.open()");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e){
        System.out.println(e.getMessage());
    }
    Set<String> set2 = driver.getWindowHandles();
    set2.removeAll(set1);
    String windowDescriptor2 = set2.iterator().next();
    driver.switchTo().window(windowDescriptor2);
    driver.get(url);
}

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        openLinkInNewTab(driver, ("https://www.google.com/search"));
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//div[textarea]"));

        actions.sendKeys("https://www.guinnessworldrecords.com/account/register?").click().perform();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();


//openLinkInNewTab(driver, ("https://www.guinnessworldrecords.com/account/register?"));

        //  driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div")).click();

        driver.findElement(By.xpath("//div[@class='M2vV3 vOY7J']")).click();
        driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        actions.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html").click().perform();
        openLinkInNewTab(driver, ("https://www.hyrtutorials.com/p/alertsdemo.html"));
        openLinkInNewTab(driver, ("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit"));

        Thread.sleep(1000);
        driver.switchTo().frame("iframeResult");
        WebElement inputField = driver.findElement(By.id("fname"));
        inputField.clear();
        driver.findElement(By.id("fname")).sendKeys("Victoria");
        Thread.sleep(1000);
        WebElement inputField2 = driver.findElement(By.id("lname"));
        inputField2.clear();
        driver.findElement(By.id("lname")).sendKeys("Haidei");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//html/body/form/input[3]")).click();
        openLinkInNewTab(driver, ("https://www.guinnessworldrecords.com/account/register?"));
        driver.findElement(By.id("LastName")).sendKeys("Haidei");
        driver.findElement(By.id("FirstName")).sendKeys("Victoria");
        driver.findElement(By.id("DateOfBirthDay")).sendKeys("17");
        driver.findElement(By.id("DateOfBirthMonth")).sendKeys("03");
        driver.findElement(By.id("DateOfBirthYear")).sendKeys("1995");
        WebElement selectElement = driver.findElement(By.id("Country"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Ukraine");
        Thread.sleep(1000);
        driver.findElement(By.id("State")).sendKeys("Ivano_Franfivsk");
        driver.findElement(By.id("EmailAddress")).sendKeys("mailmail@mail.com");
        driver.findElement(By.id("ConfirmEmailAddress")).sendKeys("mailmail@mail.com");
        // driver.findElement(By.id("Password")).sendKeys("mail.mail@mail");
        //  driver.findElement(By.id("ConfirmPassword")).sendKeys("mail.mail");
        WebElement confirmPasswordField = driver.findElement(By.id("Password"));
        confirmPasswordField.sendKeys("Password");
        WebElement passwordField = driver.findElement(By.id("ConfirmPassword"));
        passwordField.sendKeys("ConfirmPassword");


        if (!passwordField.getAttribute("value").equals(confirmPasswordField.getAttribute("value"))) {
            System.out.println("Confirm password and Password do not match");
        }
        // "LastName" "FirstName" "DateOfBirthDay" "DateOfBirthMonth" "DateOfBirthYear"  "//*[@id="Country"]"
// "//*[@id="Country"]/option[247]"   "State"  "EmailAddress" "ConfirmEmailAddress"  "Password"  "ConfirmPassword"
        String desiredUrl = "https://www.hyrtutorials.com/p/alertsdemo.html";
        Set<String> windowHandles = driver.getWindowHandles();


        String newWindowHandle = windowHandles.toArray()[windowHandles.size() - 3].toString();
        driver.switchTo().window(newWindowHandle);


        Thread.sleep(2000);
        try {
            driver.switchTo().frame("aswift_3");
            driver.findElement(By.xpath("//*[@id='dismiss-button']")).click();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }//alertBox  confirmBox promptBox


driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.xpath("//*[@id='alertBox']")).click();
        Thread.sleep(2000);
        Alert alertJsAlert = driver.switchTo().alert();
        Thread.sleep(3000);
        String alertText1 = alertJsAlert.getText();
        System.out.println("Popup box output: " + alertText1);

     driver.findElement(By.xpath("//*[@id='confirmBox']")).click();
        Thread.sleep(3000);
        Alert alertConfirmBox= driver.switchTo().alert();
        Thread.sleep(3000);
        String alertText2 = alertConfirmBox.getText();
        System.out.println("Popup box output: " + alertText2);
        alertConfirmBox.dismiss();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='promptBox']")).click();
        Thread.sleep(3000);
        Alert alertPromptBox= driver.switchTo().alert();
        Thread.sleep(3000);
        alertPromptBox.sendKeys("Final step of this task");
        alertPromptBox.accept();
        System.out.println("Popup box output: Final step of this task");

    }}
//*[@id="post-body-2252040019981508971"]/div/div[4]*/
