
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;

public class ProductsPage extends BasePage{

    By hoverProductLocator = By.xpath("//*[@id=\"products\"]/div[3]/div/div[1]/div");
    By productNameLocator = By.className("product__badges");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage()
    {
        return isDisplayed(hoverProductLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

   /* public List selectHover() {
        return null;
    }*/

    private List<WebElement> getAllProducts(){
        return  findAll(productNameLocator);
    }

}
