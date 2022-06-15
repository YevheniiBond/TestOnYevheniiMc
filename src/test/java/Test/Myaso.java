package Test;

import PageObj.MegaSupermarketPage;
import org.testng.annotations.Test;

public class Myaso extends TestInit {
@Test
    public void myaso(){
        MegaSupermarketPage megaSupermarketPage = new MegaSupermarketPage(driver);
        driver.get("https://megamarket.zakaz.ua/uk/categories/meat-fish-poultry-megamarket/");
        megaSupermarketPage.listOfMeat().get(3).click();

    }
}
