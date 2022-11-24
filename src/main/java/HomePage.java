
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage {

    SearchBox searchBox;
    MoreShow moreShow;
    scrollDown scroll;

    public HomePage(WebDriver driver)
    {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox()
    {
        return this.searchBox;
    }
    public MoreShow moreShow()
    {
        return this.moreShow;
    }

    public boolean isOnProductCountUp() {
        return this.isOnProductCountUp();
    }

    public void goToCart() {
    }

    public void scrollDown() {

    }
}
