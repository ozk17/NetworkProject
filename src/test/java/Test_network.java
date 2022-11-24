import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test_network extends BaseTest {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void search_ceket() {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("ceket");
        // Arama sekmesinde “ceket” yazdırılır.
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Ürün sayfada Bulunamadı.");
    }

    @Test
    @Order(2)
    public void more_show() {
        homePage.moreShow().click(By.className("button -secondary -sm relative"));
        // Daha fazla göster butonu

    }

    @Test
    @Order(3)
    public void select_ceket() {
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Ürün detayı bulunamadı!");
        //ve arama yaptırılır.
    }

    @Test
    @Order(4)
    public void scroll_down() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        js.executeScript("window.scroll(0,13300)");
        /*size_34*/
    }

    @Test
    @Order(5)
    public void add_product_to_cart() {
       /* JavascriptExecutor js = (JavascriptExecutor)homePage;
        Thread.sleep(1000);
        js.executeScript("window.scroll(0,13300)");*/
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isOnProductCountUp(),
                "Product count did not increase!");
    }

    @Test
    @Order(6)
    public void go_to_cart() {
        /*WebElement moreShowBtn= homePage.findElement(By.ByClassName("button -secondary -sm relative"));
        moreShowBtn.click();*/
        cartPage= new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(), "Product was not added to cart!");
    }
}