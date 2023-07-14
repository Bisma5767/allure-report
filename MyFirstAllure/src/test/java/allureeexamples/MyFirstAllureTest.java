package allureeexamples;


import io.qameta.allure.Epic;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class MyFirstAllureTest {

    @Epic("Allure test epic")
    @DisplayName("first Allure test")
    @Test

    public void tc1() {
        Assert.assertTrue(true);
    }
}