import com.demoqa.entities.PracticeFormEntity;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest{
    @Test
    public void textBoxText(){
        driver.get("https://demoqa.com/automation-practice-form");
        PracticeFormEntity practiceFormEntity = randomUtils.generateRandomPracticeFormEntity();
        demoQAPages.getPracticeFormPage().fillUpPracticeForm(practiceFormEntity);
    }

}
