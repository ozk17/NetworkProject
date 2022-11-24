import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoreShow extends BasePage{

    By moreshowLocator = By.className("button -secondary -sm relative");

    public MoreShow(WebDriver driver) {
        super(driver);
    }


    public void show(String text) {
        click(moreshowLocator);

    }
}
