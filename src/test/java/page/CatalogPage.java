package page;

import enums.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CatalogPage extends AbstractPage {
    private final By catalogCategories = By.xpath("//span[@class='catalog-navigation-classifier__item-title-wrapper']");
    private final By catalogSubcategories = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]/div/div[3]/div[1]/div/div/div[1]");

    public void choseCategory(Category category) {
        String xpathValue = category.getXpathValue();
        String genderXpathPattern = "//li[@data-id='%s']";
        String xpath = String.format(genderXpathPattern, xpathValue);
        webDriver.findElement(By.xpath(xpath))
                .click();
    }

    public List<String> getCategoriesNames() {
        return getElementsText(catalogCategories);
    }

    public List<String> getSubcategoriesNames() {
        return getElementsText(catalogSubcategories);
    }

    private List<String> getElementsText(By locator) {
        List<String> elementText = new ArrayList<String>();
        List<WebElement> elements = webDriver.findElements(locator);
        for (WebElement element : elements) {
            elementText.add(element.getText());
        }
        return elementText;
    }
}