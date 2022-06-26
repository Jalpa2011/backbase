package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class backbase {
	
   public static WebDriver driver;
	
  By txt_email= By.xpath("//input[@formcontrolname='email']");
  By button_login = By.xpath("//a[contains(text(),'Sign in')]");
  By txt_password= By.xpath("//input[@formcontrolname='password']");
  By button_signin= By.xpath("//button[contains(text(),'Sign in')]");
  By button_globlefeed= By.xpath("//a[contains(text(),'Global Feed')]");
  By button_settings= By.xpath("//a[@routerlink='/settings']");
  //By button_settings= By.cssSelector("nav.navbar.navbar-light div.container ul.nav.navbar-nav.pull-xs-right li.nav-item:nth-child(3) > a.nav-link");
  By txt_shortbio= By.xpath("//body/app-root[1]/app-settings-page[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/fieldset[3]/textarea[1]");
  By button_updatesetting= By.xpath("//button[contains(text(),'Update Settings')]");
  By button_Newarticle= By.xpath("//app-layout-header/nav[1]/div[1]/ul[1]/li[2]/a[1]");
  By txt_Articletitle= By.xpath("//input[@formcontrolname='title']");
  By txt_writearticle= By.xpath("//textarea[@formcontrolname='body']");
  By txt_entertags = By.xpath("//input[@placeholder='Enter tags']");
  By button_deletearti= By.xpath("//button[@class='btn btn-sm btn-outline-danger']");
  By button_publisharticle = By.xpath("//button[contains(text(),'Publish Article')]");
  By button_jalpa = By.xpath("//app-layout-header/nav[1]/div[1]/ul[1]/li[4]/a[1]");
  By button_editprofile= By.xpath("//a[@class='btn btn-sm btn-outline-secondary action-btn']");
  By button_logout= By.xpath("//button[contains(text(),'Or click here to logout.')]");
  
  
  public backbase( WebDriver driver) {
	  
	  
	backbase.driver= driver;
  }
  





public void userHomepage() throws InterruptedException {
	 String gk= driver.getTitle();
	 System.out.println(gk);
	 Thread.sleep(2000);
	 
  }
  
  public void clickonGlobal() throws InterruptedException {
	  driver.findElement(button_globlefeed).click();
	  Thread.sleep(2000);
  }
  
  public void varifyGlobalfeed() throws InterruptedException {
	  String Cr=driver.getCurrentUrl();
	  System.out.println(Cr);
	  Thread.sleep(2000);
	  }
  
  public void clickonLogin() throws InterruptedException {
	  driver.findElement(button_login).click();
	  Thread.sleep(2000);
  }
  public void enterEmailandPassword() throws InterruptedException {
	  driver.findElement(txt_email).sendKeys("jalpabavishi01@gmail.com");
	  driver.findElement(txt_password).sendKeys("1234567");
	  Thread.sleep(2000);
  }
  public void submitButton() throws InterruptedException {
	  driver.findElement(button_signin).click();
	  Thread.sleep(2000);
  }
  public void varifyLogin() throws InterruptedException {
	  String Tl=driver.getTitle();
	  System.out.println(Tl);
	  Thread.sleep(2000);
  }
  public void settingPage() throws InterruptedException {
	  driver.findElement(button_settings).click();
	  Thread.sleep(2000);
	  
  }
  public void shortBio() throws InterruptedException {
	  driver.findElement(txt_shortbio).sendKeys("Hi I am New");
	  Thread.sleep(2000);
  }
  public void updateSetting() throws InterruptedException {
	  driver.findElement(button_updatesetting).click();
	  Thread.sleep(2000);
  }
  public void varifyUpdateSetting() throws InterruptedException {
	 String KK= driver.getTitle();
	 System.out.println(KK);
	  Thread.sleep(2000);
  }
  public void newArticleButton() throws InterruptedException {
	  driver.findElement(button_Newarticle).click();
	  Thread.sleep(2000);
  }
  public void provideArticleDetails() throws InterruptedException {
	  driver.findElement(txt_Articletitle).sendKeys("Pop");
	  driver.findElement(txt_writearticle).sendKeys("Automation and Manual");
	  driver.findElement(txt_entertags).sendKeys("ssh");
	  Thread.sleep(2000);
	  
  }
  public void publishArticle() throws InterruptedException {
	  driver.findElement(button_publisharticle).click();
	  Thread.sleep(2000);
  }
  public void varifyArticle() throws InterruptedException {
	  String ss=driver.getTitle();
	  System.out.println(ss);
	  Thread.sleep(2000);
  }
  public void deleteArticle() throws InterruptedException {
	  driver.findElement(button_deletearti).click();
	  Thread.sleep(2000);
  }
  public void profileName() throws InterruptedException {
	  driver.findElement(button_jalpa).click();
	  Thread.sleep(2000);
  }
  public void editProfile() throws InterruptedException {
	  driver.findElement(button_editprofile).click();
	  Thread.sleep(2000);
  }
  public void logOut() throws InterruptedException {
	  driver.findElement(button_logout).click();
	  Thread.sleep(2000);
  }
  public void browserClose() {
	  driver.close();
	  driver.quit();
  }

	
}
  


