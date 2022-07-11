package test;

import enums.Category;
import org.junit.Assert;
import org.junit.Test;
import page.CatalogPage;
import utils.Utilities;

import java.util.List;

public class CatalogPageTest extends AbstractTest {
    private final CatalogPage catalogPage = new CatalogPage();
    private final List<String> categories = Utilities.getCategoriesNames();
    private final List<String> ComputerAndNetworkSubcategoriesNames = Utilities.getComputerAndNetworkSubcategoriesNames();

    @Test
    public void categoryDisplayTest() {
        Utilities.sleep(2);
        List<String> expectedCategories = catalogPage.getCategoriesNames();
        Assert.assertEquals(categories, expectedCategories);
    }

    @Test
    public void subcategoryDisplayTest() {
        catalogPage.choseCategory(Category.COMPUTERS_AND_NETWORK);
        Utilities.sleep(2);
        List<String> subcategoriesNames = catalogPage.getSubcategoriesNames();
        Assert.assertTrue(subcategoriesNames.containsAll(ComputerAndNetworkSubcategoriesNames));
    }
}
