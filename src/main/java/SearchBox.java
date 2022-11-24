import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {

    By searchBoxLocator = By.id("search");
    By submitButtonLocator = By.className("sgm-search-show-all");
    By cookie = By.id("onetrust-accept-btn-handler");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        click(cookie);
        type(searchBoxLocator,text);
        click(submitButtonLocator);
    }

}
