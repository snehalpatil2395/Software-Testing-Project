package selenium_programs;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Automation {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//launch the browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shree\\Desktop\\Selenium Jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver w = new FirefoxDriver();
		
		//open url
		w.get("https://driftaway.coffee/subscribe/");
		
		//coffee(who is the subscription for?)
		w.findElement(By.linkText("Yourself")).click();
		Thread.sleep(1000);
		
		//whole bean(type of coffee)
		w.findElement(By.xpath("//div[contains(text(),'Whole Bean')]")).click();
		Thread.sleep(1000);
		
		//(choose delivery)
		w.findElement(By.xpath("//body/div[1]/div[1]/div[4]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/div[2]")).click();
		Thread.sleep(1000);
		
		//choose future delivery
		w.findElement(By.xpath("//h1[contains(text(),'8 oz')]")).click();
		Thread.sleep(1000);
		
		//choose shipping frequency
		w.findElement(By.xpath("//div[contains(text(),'Every Week')]")).click();
		Thread.sleep(1000);
		
		//choose billing frequency
		w.findElement(By.xpath("//body[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/h3[1]")).click();
		Thread.sleep(1000);
				
		//on next page
		w.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		Thread.sleep(1000);
		
		//-----------------------Shipping--------------------------------
		w.findElement(By.xpath("//h2[contains(text(),'USPS First-Class shipping')]")).click();
		Thread.sleep(1000);
				
		w.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
				
		//-----------------------Timing-----------------------------
		//choose shipping date
		w.findElement(By.xpath("//a[contains(text(),'30')]")).click(); 
		Thread.sleep(1000);
				
		w.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		Thread.sleep(1000);
				
		//---------------------------Review------------------
		//proceed to checkout
		w.findElement(By.xpath("//a[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(10000);
				
		//Screenshot                                       //1st defect
		TakesScreenshot ts = (TakesScreenshot)w;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("E:\\Snehal\\Test Engineer\\Screenshot\\SignUp.png"));
		
		//sign up		
		w.findElement(By.name("email")).sendKeys("sarveshpatil33@gmail.com");
		//w.findElement(By.name("password")).sendKeys("Coffee456");
		//w.findElement(By.name("register")).click();
				
		w.navigate().to("https://driftaway.coffee/subscribe/");         //home page
		 
		//All links
		//mouse hovering
		Actions a = new Actions(w);
		
		//shop(for you)
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'For You')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Subscriptions")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'For You')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Single Bags")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'For You')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Cold Brew")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'For You')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Coffee Gear")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'For You')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Virtual Tasting Parties")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'For You')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Explorer Kits")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//shop (gifts)
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Subscriptions")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Single Bags")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Virtual Tasting Parties")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Explorer Kits")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Received A Gift Subscription")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//Shop (offices)
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'Offices')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Subscriptions")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'Offices')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Single Bags")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'Offices')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Corporate Tasting")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'SHOP')]"))).perform();
		Thread.sleep(1000);
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'Offices')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Corporate Gifts")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//virtual events
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'VIRTUAL EVENTS')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Virtual Coffee Tastings")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'VIRTUAL EVENTS')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Corporate Tastings")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'VIRTUAL EVENTS')]"))).perform();
		Thread.sleep(1000);
		w.findElement(By.linkText("Virtual Classes")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//reviews
		w.findElement(By.linkText("REVIEWS")).click();
		w.navigate().back();
		
		//logo of driftaway coffee
		w.findElement(By.xpath("//header/div[1]/div[1]/a[1]/img[1]")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		//sustainability
		a.moveToElement(w.findElement(By.linkText("SUSTAINABILITY"))).perform();
		Thread.sleep(500);
		w.findElement(By.linkText("Compostable Packaging")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.linkText("SUSTAINABILITY"))).perform();
		Thread.sleep(500);
		w.findElement(By.linkText("Carbon Neutral")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.linkText("SUSTAINABILITY"))).perform();
		Thread.sleep(500);
		w.findElement(By.linkText("Farmer Feedback")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.linkText("SUSTAINABILITY"))).perform();
		Thread.sleep(500);
		w.findElement(By.linkText("Bean For Bean")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.linkText("SUSTAINABILITY"))).perform();
		Thread.sleep(500);
		w.findElement(By.linkText("Price Transparency")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.linkText("SUSTAINABILITY"))).perform();
		Thread.sleep(500);
		w.findElement(By.linkText("Coffee Stories")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		//about
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'ABOUT')]"))).perform();
		Thread.sleep(500);
		w.findElement(By.linkText("About Driftaway")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		a.moveToElement(w.findElement(By.xpath("//span[contains(text(),'ABOUT')]"))).perform();
		Thread.sleep(500);
		w.findElement(By.linkText("Coffeecademy")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		//----------------cart------------------------
		//Sign Up
		w.findElement(By.xpath("//header/div[1]/nav[2]/div[1]/ul[1]/li[4]/div[1]/a[1]/div[1]/span[1]")).click();
		w.findElement(By.id("reg_email")).sendKeys("alpeshpatiljmn28@gmail.com");
		w.findElement(By.id("reg_password")).sendKeys("Coffee123");
		w.findElement(By.name("register")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		//login
		w.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();
		w.findElement(By.id("username")).sendKeys("snehalpatil2395@gmail.com");
		w.findElement(By.id("password")).sendKeys("Coffee@123");
		w.findElement(By.name("login")).click();
		
		//What would you like to update?
		//coffee history
		w.findElement(By.xpath("//div[contains(text(),'COFFEE HISTORY')]")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//next delivery
		w.findElement(By.xpath("//div[contains(text(),'NEXT DELIVERY')]")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//reset password
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/a[1]/div[1]")).click();
		Thread.sleep(1000);
		w.navigate().back();
		
		//scroll down
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor)w;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		
		//shop now
		w.findElement(By.xpath("//a[contains(text(),'Shop Now')]")).click();
		Thread.sleep(500);
		
		//scroll down
		JavascriptExecutor js1 = (JavascriptExecutor)w;
		js1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(500);
		
		//office coffee(learn more button)
		w.findElement(By.xpath("//body/div[@id='ajax-content-wrap']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/span[1]")).click();
		Thread.sleep(500);
				
		//request sample
		w.findElement(By.xpath("//body/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/p[2]/a[1]")).click();
		Thread.sleep(5000);
				
		//screenshot                                                     //2nd defect
		TakesScreenshot ts1 = (TakesScreenshot)w;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		Files.copy(src1, new File("E:\\Snehal\\Test Engineer\\Screenshot\\FullName.png"));
		
		//Sign up page not working
				
		w.navigate().to("https://driftaway.coffee/subscribe/");
		
		//homepage
		//------------------------gift---------------------------
		w.findElement(By.xpath("//div[contains(text(),'A gift')]")).click();
		Thread.sleep(1000);
				
		//w.findElement(By.xpath("//body/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		//choose coffee type
		w.findElement(By.xpath("//p[contains(text(),\"The first delivery's coffee names are hidden\")]")).click();
		Thread.sleep(1000);
				
		//choose size
		w.findElement(By.xpath("//div[contains(text(),'1 pound')]")).click();
		Thread.sleep(1000);
				
		w.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
				
		//how do you send this?
		w.findElement(By.linkText("Send the first box to me")).click();
				
		//form to fill details
		w.findElement(By.xpath("//body/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Snehal");
				
		w.findElement(By.xpath("//body/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/form[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Patil");
				
		w.findElement(By.xpath("//body/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/form[2]/div[1]/div[1]/div[3]/input[1]")).sendKeys("snehalpatil2395mail.com");
				
		w.findElement(By.xpath("//input[@id='form_2_address']")).sendKeys("New Sangavi");
			
		w.findElement(By.xpath("//input[@id='form_2_address2']")).sendKeys("Sai chowk");
				
		w.findElement(By.xpath("//input[@id='form_2_city']")).sendKeys("Pune");
		Thread.sleep(1000);
				
		//screenshot                                      //3rd defect
		TakesScreenshot ts2 = (TakesScreenshot)w;
		File src3 = ts2.getScreenshotAs(OutputType.FILE);
		Files.copy(src3, new File("E:\\Snehal\\Test Engineer\\Screenshot\\state.png"));
				
		w.navigate().to("https://driftaway.coffee/subscribe/");
				
		//Select state = new Select(w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/form[2]/div[1]/div[1]/div[7]/select[1]")));
		//state.selectByIndex(2);
				
		/*w.findElement(By.xpath("//input[@id='form_2_zip']")).sendKeys("411027");
				
		w.findElement(By.xpath("//*[@id=\"sendToMeForm\"]/div[1]/div/div[10]/label/a"));   //change country
				
		w.findElement(By.xpath("//input[@id='phone_2']")).sendKeys("8999025592");
				
		w.findElement(By.xpath("//body/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/form[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Mr. Patil");
				
		w.findElement(By.xpath("//body/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/form[2]/div[2]/div[1]/div[2]/textarea[1]")).sendKeys("Gift for you");
				
		w.findElement(By.xpath("//body/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/form[2]/div[2]/div[1]/div[3]/input[1]")).sendKeys("snehalpatil@gmail.com");
		*/
		
		//login
		w.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();
		w.findElement(By.id("username")).sendKeys("snehalpatil2395@gmail.com");
		w.findElement(By.id("password")).sendKeys("Coffee@123");
		w.findElement(By.name("login")).click();
		
		//------------sidebar-----------------
		//dashboard
		w.findElement(By.linkText("Dashboard")).click();
				
		//subscription
		w.findElement(By.linkText("Subscriptions")).click();
		Thread.sleep(500);
		w.navigate().back();
				
		//orders
		w.findElement(By.linkText("Orders")).click();
		Thread.sleep(500);
		w.navigate().back();
				
		//coffee history
		w.findElement(By.linkText("Coffee History")).click();
		Thread.sleep(500);
		w.navigate().back();
				
		//cold brew profile
		w.findElement(By.xpath("//a[contains(text(),'Cold Brew Profile')]")).click();
		Thread.sleep(500);
		w.navigate().back();
				
		//my points
		w.findElement(By.xpath("//a[contains(text(),'My Points')]")).click();
		Thread.sleep(500);
		w.navigate().back();
				
		//saved card
		w.findElement(By.xpath("//a[contains(text(),'Saved Card')]")).click();
		Thread.sleep(500);
		w.navigate().back();
				
		//email & password
		w.findElement(By.linkText("Email & Password")).click();
		Thread.sleep(500);
		w.navigate().back();
				
		//refer friends
		w.findElement(By.linkText("Refer Friends")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		//logout
		w.findElement(By.linkText("Logout")).click();
		Thread.sleep(500);
		w.navigate().back();
		
		//---------------------------------------------for console window
		//title of page 
        System.out.println("Title of page is : " + w.getTitle());           //print the title of website
		
        //current url
		System.out.println("The current URL is : " + w.getCurrentUrl()); 
		
		//total checkboxes
        List<WebElement> C = w.findElements(By.tagName("label"));
		System.out.println("Total checkbox are : " + C.size());
		
		//total radio buttons
		List<WebElement> r = w.findElements(By.tagName("label"));
		System.out.println("Total Radio Buttons are : " + r.size());
		
		//total links
		List<WebElement> L = w.findElements(By.tagName("a"));
		System.out.println("Total Links are : " + L.size());
		
	}

}
