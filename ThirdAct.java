public void launchbrowser() {
		System.setProperty("webdriver.gecko.driver", "/Users/biniy/OneDrive/Desktop/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.elgiganten.se/");
		//driver.get("https://c70c70323be7.ngrok.io/");

		//driver.get("https://c70c70323be7.ngrok.io_Welcome");
	}
	
	public void searchProduct() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.xpath("//div//div//div//div//div[2]//div[1]//a[1]//button[1]")).click();
		driver.findElement(By.id("main-search")).sendKeys("JBL Speakers");
		
		Thread.sleep(3000);
		driver.findElement(By.className("search-icon-svg")).click();
	}
	public void navigate() throws InterruptedException {
		Thread.sleep(3000);
	driver.navigate().to("https://www.newton.se/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	System.out.println("The title of this page is:" + driver.getTitle());
	}
	
		
	public void closeBrowser() {
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		FirstScript obj = new FirstScript();
		obj.launchbrowser();
		obj.searchProduct();
		obj.navigate();
		obj.closeBrowser();
	}		
	
	
}
