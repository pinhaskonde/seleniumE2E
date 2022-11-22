import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTests extends BaseTest {

    By elementsMenuElement = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    By headerTextElement = By.xpath("//*[@id='app']/div/div/div[1]/div");

    String elementsPageText = "Please select an item from left to start practice.";


    @Test
    public void test1OpenElementsPage() {
        click(elementsMenuElement);
        Assert.assertTrue(getElementText(headerTextElement).equalsIgnoreCase("Elements"));
    }

    public String getElementText(By locator) {
        String text = find(locator).getText();
        return text;
    }


    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    private void click(By locator) {
        find(locator).click();
    }

    public void type(By locator, String text) {
        find(locator).sendKeys(text);
    }


}













