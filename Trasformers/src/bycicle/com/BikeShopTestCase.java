package bycicle.com;
import oop.com.PageTitleValidation;

public class BikeShopTestCase extends PageTitleValidation {

    public BikeShopTestCase(String name) {
        super(name);

    }

    @Override
    public boolean verifyTitle(String title) {
        return false;
    }
}
