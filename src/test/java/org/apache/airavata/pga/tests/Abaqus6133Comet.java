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
 **********Executing Amber Application on BR2**********
 * Created by Eroma on 9/12/14.
 * The script generates Amber application execution on BR2
 * experiment-name and experiment-description are read from the exp.properties file
 * Modified by Eroma on 10/23/14. Base URL & Sub URL to be read from the exp.properties file
 * Updated to work with Latest PGA by Eroma 08/05/2015
*/

public class Abaqus6133Comet extends UserLogin {
  private WebDriver driver;
  private String subUrl;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private String expName = null;

  @Before
  public void setUp() throws Exception {
      driver = new FirefoxDriver();
      baseUrl = ExpFileReadUtils.readProperty("base.url");
      subUrl = ExpFileReadUtils.readProperty("sub.url");
      expName = ExpFileReadUtils.readProperty("experiment.name");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  }

  @Test
  public void testAbaqus6133Comet() throws Exception {
    driver.get(baseUrl + subUrl);
      authenticate(driver);
    driver.findElement(By.linkText("Experiment")).click();
    driver.findElement(By.cssSelector("li.dropdown.open > ul.dropdown-menu > li > #create")).click();
      waitTime(200);
    driver.findElement(By.id("experiment-name")).sendKeys(expName + "Abacus6133-Comet");
      waitTime(200);
    driver.findElement(By.id("experiment-description")).sendKeys("Test Experiment");
    new Select(driver.findElement(By.id("project"))).selectByVisibleText(ExpFileReadUtils.readProperty("project.name"));
      waitTime(200);
    new Select(driver.findElement(By.id("application"))).selectByVisibleText("Abaqus-6.13-3");
      waitTime(200);
    driver.findElement(By.name("continue")).click();
    driver.findElement(By.id("Abacus-INP-File")).sendKeys(ExpFileReadUtils.ABAQUS_INPUT1);
      waitTime(200);
    driver.findElement(By.id("ABQ_JOB")).clear();
    driver.findElement(By.id("ABQ_JOB")).sendKeys("$abq_job");
    waitTime(200);
    driver.findElement(By.id("Scratch")).clear();
    driver.findElement(By.id("Scratch")).sendKeys("$PWD");
    waitTime(200);
    driver.findElement(By.id("CPUs")).clear();
    driver.findElement(By.id("CPUs")).sendKeys("4");
    waitTime(200);
    driver.findElement(By.id("Memory")).clear();
    driver.findElement(By.id("Memory")).sendKeys("80%");
    waitTime(200);
    driver.findElement(By.id("MP_MODE")).clear();
    driver.findElement(By.id("MP_MODE")).sendKeys("threads");
    waitTime(200);
    driver.findElement(By.id("Interactive")).clear();
    driver.findElement(By.id("Interactive")).sendKeys("interactive");
    waitTime(200);
    driver.findElement(By.id("User_Sub_Option")).clear();
    driver.findElement(By.id("User_Sub_Option")).sendKeys("' '");
    waitTime(200);
    driver.findElement(By.id("Restart_Option")).clear();
    driver.findElement(By.id("Restart_Option")).sendKeys("' '");
    waitTime(200);
    driver.findElement(By.id("Datach")).clear();
    driver.findElement(By.id("Datach")).sendKeys("' '");
    waitTime(200);
    driver.findElement(By.id("Double")).clear();
    driver.findElement(By.id("Double")).sendKeys("double");
    waitTime(200);
    driver.findElement(By.id("optInputFiles")).sendKeys(ExpFileReadUtils.ABAQUS_INPUT2);
    waitTime(200);
    new Select(driver.findElement(By.id("compute-resource"))).selectByVisibleText("comet.sdsc.edu");
      waitTime(200);
    new Select(driver.findElement(By.id("select-queue"))).selectByVisibleText("compute");
      waitTime(200);
    driver.findElement(By.id("node-count")).clear();
    driver.findElement(By.id("node-count")).sendKeys("1");
    driver.findElement(By.id("cpu-count")).clear();
    driver.findElement(By.id("cpu-count")).sendKeys("24");//changed the default 16 as for Abaqus need to give 24
    driver.findElement(By.id("wall-time")).clear();
    driver.findElement(By.id("wall-time")).sendKeys("30");
    driver.findElement(By.id("memory-count")).clear();
    driver.findElement(By.id("memory-count")).sendKeys("0");
    driver.findElement(By.id("enableEmail")).click();
    driver.findElement(By.id("emailAddresses")).clear();
    driver.findElement(By.id("emailAddresses")).sendKeys(ExpFileReadUtils.readProperty("email1"));
    //driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    //driver.findElement(By.xpath("(//input[@name='emailAddresses[]'])[2]")).sendKeys(ExpFileReadUtils.readProperty("email2"));
      waitTime (200);
    driver.findElement(By.id("expLaunch")).click();//launch or save
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
