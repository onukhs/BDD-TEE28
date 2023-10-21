import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

    private final WebDriver driver = Hooks.getDriver();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://www.saucedemo.com/");
        System.out.println("Step - 1 : LOGIN PAGE IS OPENED");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        System.out.println("Step - 2 : I ENTER VALID USERNAME AND PASSWORD");
    }

    @When("I enter username and password for blocked user")
    public void i_enter_invalid_username_and_password() {
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        System.out.println("Step - 2 : I ENTER BLOCKED USER USERNAME AND PASSWORD");
    }

    @When("I click on Login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
        System.out.println("Step - 3 : I CLICKED ON LOGIN BUTTON");
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        driver.findElement(By.id("shopping_cart_container"));

        System.out.println("Step - 4 : I AM LOGGED IN");
    }

}
