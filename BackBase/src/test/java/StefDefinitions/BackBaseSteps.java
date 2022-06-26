package StefDefinitions;


import org.openqa.selenium.WebDriver;


import Pages.backbase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackBaseSteps {


   public static WebDriver driver=null;
	backbase bk ;
	 
		

@Given("browse is open")
public void browse_is_open() {
     driver= WebDriverManager.chromedriver().create();
	//System.setProperty("webdriver.chrome.driver", "/src/test/resources/Drivers/chromedriver.exe");
    //driver = new ChromeDriver();
	driver.get("https://candidatex:qa-is-cool@qa-task.backbasecloud.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	

}

@And("user is on homepage")
public void user_is_on_homepage() throws InterruptedException {
	bk= new backbase(driver);
    bk.userHomepage();
}

@When("user click on globle feed tab")
public void user_click_on_globle_feed_tab() throws InterruptedException {
   //bk= new backbase(driver);
   bk.clickonGlobal();
}


@And("varify globle feed tab working correctly")
public void varify_globle_feed_tab_working_correctly() throws InterruptedException {
   bk.varifyGlobalfeed();
}

@When("user click on login button")
public void user_click_on_login_button() throws InterruptedException {
    bk.clickonLogin();
}

@Then("user give email and password details for login account")
public void user_give_email_and_password_details_for_login_account() throws InterruptedException {
  bk.enterEmailandPassword();
}

@And("click on submit button")
public void click_on_submit_button() throws InterruptedException {
   bk.submitButton();
}

@And("varify user sucssefully login")
public void varify_user_sucssefully_login() throws InterruptedException {
    bk.varifyLogin();
}

@Given("user is on setting page")
public void user_is_on_setting_page() throws InterruptedException {
    bk.settingPage();
}

@When("user type on short bio field")
public void user_type_on_short_bio_field() throws InterruptedException {
   bk.shortBio();
}

@Then("user click on update setting button")
public void user_click_on_update_setting_button() throws InterruptedException {
    bk.updateSetting();
}

@And("varify user sucssefully update account")
public void varify_user_sucssefully_update_account() throws InterruptedException {
    bk.varifyUpdateSetting();
}

@Given("user is on home page")
public void user_is_on_home_page() throws InterruptedException {
    bk.userHomepage();
}

@When("user click on New Article button")
public void user_click_on_new_article_button() throws InterruptedException {
	bk.newArticleButton();
   
}

@Then("provide all details in article field")
public void provide_all_details_in_article_field() throws InterruptedException {
   bk.provideArticleDetails();
}

@And("click on publish article button")
public void click_on_publish_article_button() throws InterruptedException {
    bk.publishArticle();
}

@Then("varify sucssefully add article")
public void varify_sucssefully_add_article() throws InterruptedException {
    bk.varifyArticle();
}

@And("click on delete article button")
public void click_on_delete_article_button() throws InterruptedException {
   bk.deleteArticle();
}

@Given("user on homepage")
public void user_on_homepage() throws InterruptedException {
   bk.userHomepage();
}

@When("user click on profile name button")
public void user_click_on_profile_name_button() throws InterruptedException {
   bk.profileName();
}

@Then("system showing all articles and user info")
public void system_showing_all_articles_and_user_info() throws InterruptedException {
    bk.editProfile();
}

@Then("browser close")
public void browser_close() throws InterruptedException {
    bk.logOut();
    bk.browserClose();
}

		

		
		
	}


