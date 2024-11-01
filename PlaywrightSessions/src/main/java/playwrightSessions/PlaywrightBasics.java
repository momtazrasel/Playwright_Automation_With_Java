package playwrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		
		LaunchOptions lp = new LaunchOptions();
		
		lp.setChannel("msedge");
		lp.setHeadless(false);
		
//		Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Browser browser = playwright.chromium().launch(lp);
		Page page = browser.newPage();
		page.navigate("https://www.amazon.com/");
		
		String title = page.title();
		System.out.println("Page title is: "+title);
		
		String url = page.url();
		System.out.println("Page title is: "+url);
		
		browser.close();
		playwright.close();
		
		
		
		
		

	}

}
