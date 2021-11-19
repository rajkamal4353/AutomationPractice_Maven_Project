package com.Base_Class_October;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	
	public static WebDriver driver;  //--> Null driver
	
	
//------------------------- Browser launch --------------------
	
	public static WebDriver get_Driver(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+ "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+ "//Driver//chromedriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	
//-------------------------get title--------------------------
	
	public static void title() {
		
		String title = driver.getTitle();
		System.out.println("title :"+title);
	}
	
	
//-------------------------get currenturl--------------------------
	
	public static void getcurrenturl() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	
//-------------------------get text--------------------------
	
	public static void gettext(WebElement element) {
		
		String text = element.getText();	
		System.out.println(text);
	}
	
	
//--------Actions(move to ,right click, double click, click)--------
	
	public static void actionsmethod(WebElement element, String opt) {
		
	Actions act = new Actions(driver);
	
		if (opt.equalsIgnoreCase("move")) {
			act.moveToElement(element).perform();
		}
		else if (opt.equalsIgnoreCase("right")) {
			act.contextClick(element).build().perform();	
		}
		else if (opt.equalsIgnoreCase("double")) {
			act.doubleClick(element).perform();
		}
		else if (opt.equalsIgnoreCase("click")) {
			act.click(element).perform();
		}
		
	}
	
	public static void drag_dropaction(WebElement element,WebElement element1) {
		
		Actions act = new Actions(driver);
		act.dragAndDrop(element, element1).perform();
	}
	
	
//-----------------Click -----------------
	
	public static void click(WebElement element) {
		element.click();
	}
	
	
//-----------------Windows handling-----------------
	
	public static void singlewindow(String type, String opt) {
		
		if (type.equalsIgnoreCase("Single window")) {
		String windowHandle = driver.getWindowHandle();
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println(title);
		}
		
		else if (type.equalsIgnoreCase("multi window")) {
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			for (String str : windowHandles) {
				String active = driver.switchTo().window(str).getTitle();
				System.out.println(active);				
			}
			
			String s= opt;
			for (String str : windowHandles) {
			if (driver.switchTo().window(str).getTitle().equals(s)) {
				
				break;
			}
		    }
		}
	}
	
	
//----------------- Robot class-----------------
	
	public static void robotclass(WebElement element, String opt) throws Throwable {

		Robot r = new Robot();
		
		if (opt.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		else if (opt.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		else if (opt.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		else if (opt.equalsIgnoreCase("right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		else if (opt.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}
	
	
//-----------------sendkeys-----------------
	
	public static void inputelement(WebElement element, String input) {
		element.sendKeys(input);
	}
	
	
// -----------------Java script exe---------click-----------------
	
	public static void jsclick(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", element); 
	}
	
	
//--------Java script exe--------scroll(up & down)--------
	
	public static void scroll(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
//-----------------Alert-----------------
	
	public static void alert(WebElement element, String opts) {
		
		Alert a = driver.switchTo().alert();
		
		if (opts.equalsIgnoreCase("accept")) {
			a.accept();
		}
		else if (opts.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}
		else if (opts.equalsIgnoreCase("text")) {
			String text = a.getText();
			System.out.println(text);
		}
	}
	
	
//-----------------Waits-----------------
	
	public static void imwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static void expwait(int time, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));	
	}
	
	public static void fluwait(int time) {
		
		Wait wait1 = new FluentWait(driver)
				.withTimeout(time,TimeUnit.SECONDS).pollingEvery(time, TimeUnit.SECONDS)
				.ignoring(Exception.class);
	}
	
	
//-----------------close-----------------
	
	public static  void close() {
		driver.close();
	}
	
	
//-----------------quit-----------------
	
	public static void quit() {
		driver.quit();
	}
	
	
//-----------------navigate to-----------------
	
	public static void navigate_to(String url) {
		driver.navigate().to(url);
	}
	
	
//-----------------navigate back-----------------
	
	public static void navigate_back() {
		driver.navigate().back();
	}
	
	
//-----------------navigate forward-----------------
	
	public static void navigate_forward() {
		driver.navigate().forward();
	}
	
	
//-----------------navigate refresh-----------------
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	
//-----------------get-----------------
	
	public static void geturl(String url1) {
		driver.get(url1);
	}
	
	
// -----------------Screenshot-----------------
	
	public static void screenshot(String type) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\M.Rajkamal\\apache-maven-3.8.3\\apache-maven-3.8.3\\bin\\October_Automation_Maven_Project\\Screenshot\\"+type+".png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);
	}
	
	
// -----------------Drop down------------------
	
	public static void drop_down(WebElement element,String type,String value) {
			
			Select s = new Select(element);
			
			if (type.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);	
			}
			
			else if (type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);
			}
			
			else if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			}
			
			
//-----------------get all selected options-----------------
			
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement all : allSelectedOptions) {
				String all1 = all.getText();
				//System.out.println(all1);
			}
			
			
//-----------------get first selected options-----------------
			
			WebElement first = s.getFirstSelectedOption();
			String first1 = first.getText();
			//System.out.println(first1);
	}
		
		
//-----------------is multiple-----------------
		
	public static void multiple(WebElement element) {
			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
	}
	
	
//-----------------get Options-----------------
	
	public static void getoptions(WebElement element) {

		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement all : options) {
			String a = all.getText();
			System.out.println(a);	
		}
	}
	
	
//-----------------Frames-----------------
	
	public static void frames(WebElement element, String opt) {
		
		if (opt.equalsIgnoreCase("single")) {
			driver.switchTo().frame(element);
	    }
	}
	
	public static void multi_frames(String opt) {
		
		if (opt.equalsIgnoreCase("main page")) {
			driver.switchTo().defaultContent();
		}
		else if (opt.equalsIgnoreCase("parent")) {
			driver.switchTo().parentFrame();
		}
	}
	
	
//-------------------Data Driven - Read-------------------	
	
//	public static String Particular_Data_From_Excel(String path, int row_Index, int cellIndex);

//      File f = new File(path);

//      FileInputStream fis = new FileInputStream(f);
	
//      Workbook w = new XSSFWorkbook(fis);     // Up Casting

//      Sheet sheetAt = w.getSheetAt(0);
	
//      Row row = sheetAt.getRow(row_Index);
	
//      Cell cell = row.getCell(cell_Index);
	
//      CellType cellType = cell.getCellType();
	
//	    if (cellType.equals(CellType.STRING)){
	
//          value = cell.getStringCellValue();
	
//    	}
	
//      else if (cellType.equals(CellType.NUMERIC)){
	
//          double numericCellValue = cell.getNumericCellValue();
	
//          value = Double.toString(numericCellValue);
	
//     }
	
//     return value;	
	
}
