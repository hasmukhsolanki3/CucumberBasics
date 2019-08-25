package steps;
import cucumber.api.java.en.And;

public class LoginToProd {
	
	@And("^user validate captcha image$")
	public void user_validate_captcha_image() throws Throwable {
	   
		System.out.println("And --> User validate captcha image");
	}

}
