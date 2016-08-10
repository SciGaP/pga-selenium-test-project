package org.apache.airavata.pga.tests;

import java.util.concurrent.TimeUnit;

import org.apache.airavata.pga.tests.utils.UserLogin;
import org.apache.airavata.pga.tests.utils.ExpFileReadUtils;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*
 **********Executing Gromacs Application on Stampede**********
 * Created by Eroma on 9/16/14.
 * The script generates Gromacs application execution on Stampede
 * experiment-name and experiment-description are read from the exp.properties file
 * Modified by Eroma on 10/27/14. Base URL & Sub URL to be read from the exp.properties file
 * Updated to work with Latest PGA by Eroma 08/05/2015
*/

public class NEK5000BR2 extends UserLogin {
  private WebDriver driver;
  private String baseUrl;
  private String subUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private String path = null;
  private String expName = null;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = ExpFileReadUtils.readProperty("base.url");
    subUrl = ExpFileReadUtils.readProperty("sub.url");
    path = ExpFileReadUtils.readProperty("local.path");
    expName = ExpFileReadUtils.readProperty("experiment.name");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNEK5000BR2() throws Exception {
    driver.get(baseUrl + subUrl);
      authenticate(driver);
    driver.findElement(By.linkText("Experiment")).click();
    driver.findElement(By.cssSelector("li.dropdown.open > ul.dropdown-menu > li > #create")).click();
      waitTime(200);
    driver.findElement(By.id("experiment-name")).sendKeys(expName + "NEK5000-BR2");
      waitTime(200);
    driver.findElement(By.id("experiment-description")).sendKeys("Test Experiment");
      waitTime(200);
    new Select(driver.findElement(By.id("project"))).selectByVisibleText(ExpFileReadUtils.readProperty("project.name"));
      waitTime(200);
    new Select(driver.findElement(By.id("application"))).selectByVisibleText("NEK5000");
      waitTime(200);
    driver.findElement(By.name("continue")).click();
      waitTime(200);
    driver.findElement(By.id("Basename")).clear();
    driver.findElement(By.id("Basename")).sendKeys("nek6kbasename");
      waitTime(200);
    driver.findElement(By.id("User-Subroutine-File")).sendKeys(ExpFileReadUtils.NEK5000_INPUT1);
      waitTime(200);
    driver.findElement(By.id("Runtime-Parameter-File")).sendKeys(ExpFileReadUtils.NEK5000_INPUT2);
      waitTime(200);
    driver.findElement(By.id("Size-for-Memory-Allocation")).sendKeys(ExpFileReadUtils.NEK5000_INPUT3);
    waitTime(200);
    new Select(driver.findElement(By.id("compute-resource"))).selectByVisibleText("bigred2.uits.iu.edu");
      waitTime(200);
    new Select(driver.findElement(By.id("select-queue"))).selectByVisibleText("cpu");
      waitTime(200);
    driver.findElement(By.id("node-count")).clear();
    driver.findElement(By.id("node-count")).sendKeys("1");
    driver.findElement(By.id("cpu-count")).clear();
    driver.findElement(By.id("cpu-count")).sendKeys("16");
    driver.findElement(By.id("wall-time")).clear();
    driver.findElement(By.id("wall-time")).sendKeys("300");
    driver.findElement(By.id("memory-count")).clear();
    driver.findElement(By.id("memory-count")).sendKeys("0");
    driver.findElement(By.id("enableEmail")).click();
    driver.findElement(By.id("emailAddresses")).sendKeys(ExpFileReadUtils.readProperty("email1"));
   // driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
   // driver.findElement(By.xpath("(//input[@name='emailAddresses[]'])[2]")).sendKeys(ExpFileReadUtils.readProperty("email2"));
      waitTime (200);
    driver.findElement(By.id("expLaunch")).click();
      waitTime (200);
  }

    private void waitTime(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
