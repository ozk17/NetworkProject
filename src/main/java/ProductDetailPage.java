import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/* By hoverProductSize = By.id("");*/
public class ProductDetailPage extends BasePage {

    By addToCartButtonLocator = By.className("product__button -addToCart btn -black");
    By productSize = By.className("size_34");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return  isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {
        click(productSize);
        click(addToCartButtonLocator);
    }

}
