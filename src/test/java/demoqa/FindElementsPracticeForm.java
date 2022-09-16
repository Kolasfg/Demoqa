package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FindElementsPracticeForm {
    @BeforeAll
    static void a(){
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void Finds(){
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("as@gmail.com");
        $x("//label[contains(text(),'Male')]").click();
        $("#userNumber").setValue("+73451233426");
        $("#dateOfBirthInput").setValue("");
        $x("//input[@id='subjectsInput']").setValue("English").pressEnter();
        $x("//label[@for='hobbies-checkbox-1']").click();
        $x("//label[@for='hobbies-checkbox-2']").click();
        $x("//label[@for='hobbies-checkbox-3']").click();
        $x("//input[@id='uploadPicture']").doubleClick();
        $x("//textarea[@placeholder='Current Address']").setValue("Moscow,Bolshaya sadovaya street,243");

        $x("//input[@id='react-select-3-input']").setValue("NCR").pressEnter();
        $x("//input[@id='react-select-4-input']").setValue("Delhi").pressEnter();
        //
        $x("//button[@id='submit']]").click();

    }
}
