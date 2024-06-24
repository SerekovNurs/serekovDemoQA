import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxPageTest extends BaseTest {
    @Test(groups = {"Smoke","7654"},description = "Check Box Page Test")
    @Owner("NS")
    @Tag("Smoke")
    public void CheckBoxTest() {
        driver.get("https://demoqa.com/checkbox");
        demoQAPages.getCheckBoxPage().fillUpCheckBoxForm();

        String value = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assert.assertEquals(value, demoQAPages.getCheckBoxPage().fullResult.getText());

    }

}
