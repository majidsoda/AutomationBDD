package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class UserMgtPage {

    public UserMgtPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(id = "login-btn")
    public WebElement loginPageBtn;

    @FindBy(xpath = "//h2[text()='Register New User']")
    public WebElement pageTitle;

    @FindBy(id = "access-db-btn")
    public WebElement accessDBBtn;

    @FindBy(id = "Firstname")
    public WebElement firstName;

    @FindBy(id = "Lastname")
    public WebElement lastName;
    @FindBy(id = "Phonenumber")
    public WebElement phoneNumber;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Select-role")
    public WebElement roleSelect;

    @FindBy(id = "submit-btn")
    public WebElement userMgtSubmitBtn;

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[.='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//h1/span")
    public WebElement portalName;



    public void fillNewUserForm(String fName, String lName, String phone,
                                String emailInp, String roleInput) {
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        phoneNumber.sendKeys(phone);
        email.sendKeys(emailInp);
        roleSelect.sendKeys(roleInput);
        userMgtSubmitBtn.click();
    }

    @FindBy(xpath = "//i[text()='Delete']")
    public List<WebElement> deleteBtn;

    @FindBy(xpath = "//table[@id='list-table']/tbody/tr[last()]//i[text()='Delete']")
    public WebElement lastDeleteBtn;

}
