package org.apache.airavata.pga.tests;

import org.apache.airavata.pga.tests.utils.UserLogin;
import org.apache.airavata.pga.tests.utils.ExpFileReadUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/*
 **********Executing Gaussian Application on Comet**********
 * Created by Eroma on 9/16/14.
 * The script generates NwChem application execution on Stampede
 * experiment-name and experiment-description are read from the exp.properties file
 * Modified by Eroma on 10/27/14. Base URL & Sub URL to be read from the exp.properties file
 * Updated to work with Latest PGA by Eroma 08/05/2015
*/

public class DDSCatComet extends UserLogin {
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
  public void testDDSCatComet() throws Exception {
    driver.get(baseUrl + subUrl);
      authenticate(driver);
    driver.findElement(By.linkText("Experiment")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Create')])[2]")).click();
    driver.findElement(By.id("experiment-name")).clear();
    driver.findElement(By.id("experiment-name")).sendKeys(expName + "DDSCat-Comet");
      waitTime(200);
    driver.findElement(By.id("experiment-description")).clear();
    driver.findElement(By.id("experiment-description")).sendKeys("Test Experiment");
      waitTime(200);
    new Select(driver.findElement(By.id("project"))).selectByVisibleText(ExpFileReadUtils.readProperty("project.name"));
      waitTime(200);
    new Select(driver.findElement(By.id("application"))).selectByVisibleText("DDSCat");//
      waitTime(200);
    driver.findElement(By.name("continue")).click();
      waitTime(200);
    driver.findElement(By.id("PAR-Input-File")).sendKeys(ExpFileReadUtils.DDSCAT_INPUT1);
      waitTime(200);
    driver.findElement(By.id("TAB-Input-File")).sendKeys(ExpFileReadUtils.DDSCAT_INPUT2);
      waitTime (200);
    new Select(driver.findElement(By.id("compute-resource"))).selectByVisibleText("comet.sdsc.edu");
      waitTime (200);
    new Select(driver.findElement(By.id("select-queue"))).selectByVisibleText("compute");
      waitTime (200);
    driver.findElement(By.id("node-count")).clear();
    driver.findElement(By.id("node-count")).sendKeys("1");
    driver.findElement(By.id("cpu-count")).clear();
    driver.findElement(By.id("cpu-count")).sendKeys("24");//Sudhakar requested it to be 4 CPUs
    driver.findElement(By.id("wall-time")).clear();
    driver.findElement(By.id("wall-time")).sendKeys("180");//60, 120 was not enough
    driver.findElement(By.id("memory-count")).clear();
    driver.findElement(By.id("memory-count")).sendKeys("0");
    driver.findElement(By.id("enableEmail")).click();
    driver.findElement(By.id("emailAddresses")).sendKeys(ExpFileReadUtils.readProperty("email1"));
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("(//input[@name='emailAddresses[]'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='emailAddresses[]'])[2]")).sendKeys(ExpFileReadUtils.readProperty("email2"));
      waitTime (200);
    driver.findElement(By.name("launch")).click();
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