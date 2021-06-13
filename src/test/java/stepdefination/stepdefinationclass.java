package stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import junit.framework.Assert;
import utilities.hooks;

public class stepdefinationclass {

	public static WebDriver driver;

	@When("^user navigates to eLearning portal$")
	public WebDriver user_navigates_to_eLearning_portal() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAGHAVENDRAS\\Documents\\Automation_Workspace\\NewProject\\src\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://elearningm1.upskills.in/");

		String title = driver.getTitle();
		try {
			Assert.assertEquals(title, "My Organization - My education");
		} catch (Exception ex) {
			driver.quit();
		}
		return driver;
	}

	@Given("^click on Sign up! link$")
	public void click_on_Sign_up_link() {

		try {

			if (driver != null) {
				WebElement signupLink = driver.findElement(By.xpath("//a[contains(text(),'Sign up!')]"));

				if (signupLink.isDisplayed()) {
					signupLink.click();

					System.out.println("Clicked on the Sign up! link");

					try {

						System.out.println("Waiting for 100 ms");

						Thread.sleep(100);
					} catch (Exception d) {
						d.printStackTrace();
					}

				}
			}
		} catch (Exception ex) {

			ex.printStackTrace();

		}
	}

	@Then("^Registration page should be opened$")
	public void registration_page_should_be_opened() {
		WebElement RegistrationHeading = driver.findElement(By.xpath("//li[contains(text(),'Registration')]"));
		if (RegistrationHeading.isDisplayed()) {
			System.out.println("Registration Page is Displayed on Screen!");
		} else {
			System.out.println("Registration Page is not Displayed on Screen!");
		}
	}

	@When("^user clicks on the \"([^\"]*)\" icon$")
	public void user_clicks_on_the_icon(String arg1) {

		try {
			if (driver != null) {
				WebElement CourseType = null;
				if (arg1.trim().equalsIgnoreCase("follow courses")) {
					CourseType = driver.findElement(By.xpath("//input[@class='register-profile' and @id='qf_ad6836']"));
				}

				if (arg1.trim().equalsIgnoreCase("Teach courses")) {
					CourseType = driver.findElement(By.xpath("//input[@class='register-profile' and @id='qf_14d892']"));
				}

				if (CourseType.isDisplayed() && CourseType.isEnabled() && !CourseType.isSelected()) {
					CourseType.click();
					System.out.println("Clicked on " + arg1 + " Radio Button");
				}
			}
		} catch (Exception d) {

		}
	}

	@When("^user enters the FirstName :\"([^\"]*)\" field value$")
	public void user_enters_the_FirstName_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					FirstName = driver.findElement(By.xpath("//input[@id='registration_firstname']"));

					if (FirstName.isDisplayed()) {
						FirstName.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Firstname field");
					}
				}
			}
		} catch (Exception ex) {

		}
	}

	@When("^user enters the LastName :\"([^\"]*)\" field value$")
	public void user_enters_the_LastName_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					LastName = driver.findElement(By.xpath("//input[@id='registration_lastname']"));

					if (LastName.isDisplayed()) {
						LastName.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under LastName field");
					}
				}
			}
		} catch (Exception ex) {

		}
	}

	@When("^user enters the Email :\"([^\"]*)\" field value$")
	public void user_enters_the_Email_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					Email = driver.findElement(By.xpath("//input[@id='registration_email']"));

					if (Email.isDisplayed()) {
						Email.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Email field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the Username :\"([^\"]*)\" field value$")
	public void user_enters_the_Username_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					Username = driver.findElement(By.xpath("//input[@id='username']"));

					if (Username.isDisplayed()) {
						Username.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Username field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the Password :\"([^\"]*)\" field value$")
	public void user_enters_the_Password_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					Password = driver.findElement(By.xpath("//input[@id='pass1']"));

					if (Password.isDisplayed()) {
						Password.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Password field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the ConfirmPassword :\"([^\"]*)\" field value$")
	public void user_enters_the_ConfirmPassword_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					Password = driver.findElement(By.xpath("//input[@id='pass2']"));

					if (Password.isDisplayed()) {
						Password.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Confirm Password field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the Phone :\"([^\"]*)\" field value$")
	public void user_enters_the_Phone_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					Phone = driver.findElement(By.xpath("//input[@id='registration_phone']"));

					if (Phone.isDisplayed()) {
						Phone.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Phone field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user selects the Language :\"([^\"]*)\" field value$")
	public void user_selects_the_Language_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Language = null;
				WebElement Code = null;
				WebElement Skype = null;

				if (arg1.trim().length() > 0) {
					Language = driver.findElement(By.xpath("//input[@id='registration_language']"));

					Select LanguageSelect = new Select(Language);

					LanguageSelect.selectByValue(arg1.trim().toLowerCase());
					System.out.println("Selected " + arg1 + " under Language field");

				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the Code :\"([^\"]*)\" field value$")
	public void user_enters_the_Code_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					Code = driver.findElement(By.xpath("//input[@id='registration_official_code']"));

					if (Code.isDisplayed()) {
						Code.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Code field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the Skype :\"([^\"]*)\" field value$")
	public void user_enters_the_Skype_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					Skype = driver.findElement(By.xpath("//input[@id='extra_skype']"));

					if (Skype.isDisplayed()) {
						Skype.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " skype field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the LinkedInProfileURL :\"([^\"]*)\" field value$")
	public void user_enters_the_LinkedInProfileURL_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					LinkedInProfileURL = driver.findElement(By.xpath("//input[@id='extra_linkedin_url']"));

					if (LinkedInProfileURL.isDisplayed()) {
						LinkedInProfileURL.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " Linked In Profile URL field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user clicks on the Register button$")
	public void user_clicks_on_the_Register_button() {

		try {
			if (driver != null) {
				WebElement FirstName = null;
				WebElement LastName = null;
				WebElement Email = null;
				WebElement Username = null;
				WebElement Password = null;
				WebElement ConfirmPassword = null;
				WebElement Phone = null;
				WebElement Code = null;
				WebElement Skype = null;
				WebElement RegisterButton = null;

				RegisterButton = driver.findElement(By.xpath("//button[@id='registration_submit']"));

				if (RegisterButton.isDisplayed() && RegisterButton.isEnabled()) {
					RegisterButton.click();
					System.out.println("Clicked Register Button");
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Then("^Registration Success Screen should be displayed$")
	public void registration_Success_Screen_should_be_displayed() {
		try {
			if (driver != null) {
				WebElement RegisterHeader = null;

				RegisterHeader = driver
						.findElement(By.xpath("//li[@class='active' and contains(text='Registration')]"));

				if (RegisterHeader.isDisplayed()) {

					System.out.println(
							"Registration Header is displayed --- this means the success screen is displayed!");
				}
			}
		} catch (Exception ex) {

		}
	}

	@When("^User clicks on the Profile Icon$")
	public void user_clicks_on_the_Profile_Icon() {
		try {
			if (driver != null) {
				WebElement ProfileIcon = null;

				ProfileIcon = driver.findElement(By.xpath("//div[@id='navbar']//ul[2]/li[2]/a"));

				if (ProfileIcon.isDisplayed()) {

					ProfileIcon.click();

					System.out.println("Profile Icon is clicked!");
				}

			}
		} catch (Exception ex) {

		}
	}

	@When("^User clicks on the Inbox Link$")
	public void user_clicks_on_the_Inbox_Link() {
		try {
			if (driver != null) {
				WebElement InboxLink = null;

				InboxLink = driver.findElement(By.xpath("//li[@class='dropdown avatar-user open']//ul//li[3]"));

				if (InboxLink.isDisplayed()) {

					InboxLink.click();

					System.out.println("Inbox link is clicked!");
				}

			}
		} catch (Exception ex) {

		}
	}

	@When("^User clicks on the Compose Message Icon$")
	public void user_clicks_on_the_Compose_Message_Icon() {
		try {
			if (driver != null) {

				WebElement Compose_Message = driver.findElement(By.xpath("//img[@title='Compose message']"));

				if (Compose_Message.isDisplayed()) {
					Compose_Message.click();

					System.out.println("Compose icon is clicked!");
				}

			}
		} catch (Exception ex) {

		}
	}

	@Then("^New Message page should be displayed$")
	public void new_Message_page_should_be_displayed() {
		try {
			if (driver != null) {

				String getURL = driver.getCurrentUrl();

				try {
					Assert.assertEquals(getURL, "http://elearningm1.upskills.in/main/messages/new_message.php");

					System.out.println("You are in the New Message composition page!");
				} catch (Exception d) {
					System.out.println("New Message Page is not displayed!");
				}

			}
		} catch (Exception ex) {

		}
	}

	@When("^User enters the Receipient address - \"([^\"]*)\" in the Send To field$")
	public void user_enters_the_Receipient_address_in_the_Send_To_field(String arg1) {
		try {
			if (driver != null) {
				Thread.sleep(500);

				List<WebElement> st = driver.findElements(By.tagName("input"));

				for (int i = 0; i < st.size(); i++) {
					System.out.println(">>> " + st.get(i).getAttribute("type"));

					if (st.get(i).getAttribute("type").trim().equalsIgnoreCase("search")) {
						st.get(i).click();
						System.out.println("Clicked on the input text field");
						Thread.sleep(100);
						st.get(i).sendKeys(String.valueOf(arg1.charAt(0)));
						System.out.println("Entered 1st Char: " + arg1.charAt(0));
						Thread.sleep(100);
						st.get(i).sendKeys(String.valueOf(arg1.charAt(1)));
						System.out.println("Entered 2nd Char: " + arg1.charAt(1));
						Thread.sleep(100);
						st.get(i).sendKeys(String.valueOf(arg1.charAt(2)));
						System.out.println("Entered 3rd Char: " + arg1.charAt(2));
						Thread.sleep(100);
						st.get(i).sendKeys(String.valueOf(arg1.charAt(3)));
						System.out.println("Entered 4th Char: " + arg1.charAt(3));
						Thread.sleep(1000);

						break;

					}
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}

	@When("^User clicks on the email popup suggestion under SendTo field$")
	public void user_clicks_on_the_email_popup_suggestion_under_SendTo_field() {
		try {
			if (driver != null) {
				Actions a = new Actions(driver);
				a.sendKeys(Keys.ARROW_DOWN).build().perform();
				a.sendKeys(Keys.ENTER).build().perform();

				System.out.println("Selected the 1st available option from the drop down!");

				Thread.sleep(500);
			}
		} catch (Exception ex) {

		}
	}

	@When("^User enters the Subject - \"([^\"]*)\" in the Subject field$")
	public void user_enters_the_Subject_in_the_Subject_field(String arg1) {

		try {
			if (driver != null) {

				WebElement Subject = driver.findElement(By.xpath("//input[@id='compose_message_title']"));

				if (Subject.isDisplayed()) {

					Subject.sendKeys(arg1);

					System.out.println("Subject field value is entered!");

					System.out.println("Waiting for 10 Seconds!");

					Thread.sleep(10000);

					Actions a = new Actions(driver);
					a.sendKeys(Keys.TAB).build().perform();
				}

			}
		} catch (Exception ex) {

		}

	}

	@When("^User enters the Message - \"([^\"]*)\" in the Message field$")
	public void user_enters_the_Message_in_the_Message_field(String arg1) {

		try {
			if (driver != null) {

				WebElement form = driver.findElement(By.xpath("//form[@id='compose_message']"));

				System.out.println("\n**** form is visible: " + form.isDisplayed());

				WebElement TextBox = driver.findElement(By.xpath("//div[@id='cke_1_contents']/iframe"));

				System.out.println("\n**** TextBox is visible: " + TextBox.isDisplayed());

				try {
					driver.switchTo().frame(TextBox);
					System.out.println("Successfully switched to iFrame");

					driver.findElement(By.tagName("body")).sendKeys(arg1);
					System.out.println("Successfully entered the message body");

					driver.switchTo().defaultContent();

					Thread.sleep(2000);

				} catch (Exception ds) {
					ds.printStackTrace();
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	@When("^User clicks on the Send Message button$")
	public void user_clicks_on_the_Send_Message_button() {
		try {
			if (driver != null) {
				WebElement SendMsgButton = driver.findElement(By.xpath("//button[@id='compose_message_compose']"));
				if (SendMsgButton.isDisplayed()) {
					SendMsgButton.click();
					System.out.println("Clicked on the Send Message Button");
				}
			}
		} catch (Exception ex) {

		}
	}

	@Then("^Mail Sending success message should be displayed on screen$")
	public void mail_Sending_success_message_should_be_displayed_on_screen() {
		try {
			if (driver != null) {

				WebElement MessageSentText = driver
						.findElement(By.xpath("//div[contains(text(),'The message has been sent to')]"));

				if (MessageSentText.isDisplayed()) {
					System.out.println("Message Successfully Sent!");
				}

			}
		} catch (Exception ex) {

		}
	}

	@When("^User clicks on the Outbox Icon$")
	public void user_clicks_on_the_Outbox_Icon() {
		try {
			if (driver != null) {

				WebElement Outbox_Title = driver.findElement(By.xpath("//img[@title='Outbox']"));

				if (Outbox_Title.isDisplayed()) {
					Outbox_Title.click();

					System.out.println("Clicked on the Outbox Icon");
				}

			}
		} catch (Exception ex) {

		}
	}

	@When("^User clicks on the \"([^\"]*)\" Link$")
	public void user_clicks_on_the_Link(String arg1) {
		try {
			if (driver != null) {

				WebElement MailSubjLink = driver.findElement(By.xpath(
						"//form[@id='form_message_outbox_id']//table//tr[2]/td[2]/a[contains(text(),'" + arg1 + "')]"));

				if (MailSubjLink.isDisplayed()) {
					MailSubjLink.click();

					System.out.println("Mail Subject Link in the Outbox is clicked!");
				}

			}
		} catch (Exception ex) {

		}
	}

	@Then("^Mail \"([^\"]*)\" should be displayed on screen with subject \"([^\"]*)\"$")
	public void mail_should_be_displayed_on_screen_with_subject(String arg1, String arg2) {

		try {
			if (driver != null) {

				WebElement MailBody = driver.findElement(By.xpath("//h3[contains(text(),'" + arg1
						+ "')]/preceding-sibling::div/..//table//td[contains(text(),'" + arg2 + "')]"));

				if (MailBody.isDisplayed()) {

					System.out.println("Mail Body is displayed on screen!");
				}

			}
		} catch (Exception ex) {

		}
	}

	@When("^User enters the Login Username : \"([^\"]*)\" field value$")
	public void user_enters_the_Login_Username_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement UN = driver.findElement(By.xpath("//input[@id='login']"));

				if (UN.isDisplayed()) {
					UN.sendKeys(arg1);

					System.out.println("Username is enterd");
				}

			}
		} catch (Exception ed) {
			ed.printStackTrace();
		}

	}

	@When("^User enters the Login Password : \"([^\"]*)\" field value$")
	public void user_enters_the_Login_Password_field_value(String arg1) {

		try {
			if (driver != null) {
				WebElement PW = driver.findElement(By.xpath("//input[@id='password']"));

				if (PW.isDisplayed()) {
					PW.sendKeys(arg1);

					System.out.println("Password is enterd");
				}

			}
		} catch (Exception ed) {
			ed.printStackTrace();
		}

	}

	@When("^User clicks on Signin button$")
	public void user_clicks_on_Signin_button() {

		try {
			if (driver != null) {
				WebElement LoginButton = driver.findElement(By.xpath("//button[@id='form-login_submitAuth']"));

				if (LoginButton.isDisplayed()) {
					LoginButton.click();

					System.out.println("Login Button is Clicked");
				}

			}
		} catch (Exception ed) {
			ed.printStackTrace();
		}

	}

	@Then("^Welcome screen or Homepage should be displayed$")
	public void welcome_screen_or_Homepage_should_be_displayed() {

	}

	@When("^user click on the Sign up link$")
	public void user_click_on_the_Sign_up_link() {

		try {

			if (driver != null) {
				WebElement signupLink = driver.findElement(By.xpath("//a[contains(text(),'Sign up!')]"));

				if (signupLink.isDisplayed()) {
					signupLink.click();

					System.out.println("Clicked on the Sign up! link");

					try {

						System.out.println("Waiting for 100 ms");

						Thread.sleep(100);
					} catch (Exception d) {
						d.printStackTrace();
					}

				}
			}
		} catch (Exception ex) {

			ex.printStackTrace();

		}

	}

	@When("^user selects the course - \"([^\"]*)\" in Courses radio button$")
	public void user_selects_the_course_in_Courses_radio_button(String arg1) {

		WebElement RegistrationHeading = driver.findElement(By.xpath("//li[contains(text(),'Registration')]"));
		if (RegistrationHeading.isDisplayed()) {
			System.out.println("Registration Page is Displayed on Screen!");
		} else {
			System.out.println("Registration Page is not Displayed on Screen!");
		}

		try {
			if (driver != null) {
				WebElement CourseType = null;
				if (arg1.trim().equalsIgnoreCase("follow courses")) {
					CourseType = driver.findElement(By.xpath("//input[@class='register-profile' and @id='qf_ad6836']"));
				}

				if (arg1.trim().equalsIgnoreCase("Teach courses")) {
					CourseType = driver.findElement(By.xpath("//input[@class='register-profile' and @id='qf_14d892']"));
				}

				if (CourseType.isDisplayed() && CourseType.isEnabled() && !CourseType.isSelected()) {
					CourseType.click();
					System.out.println("Clicked on " + arg1 + " Radio Button");
				}
			}
		} catch (Exception d) {

		}

	}

	@When("^user enters the first name - \"([^\"]*)\" in the First name field$")
	public void user_enters_the_first_name_in_the_First_name_field(String arg1) {

		try {
			if (driver != null) {
				WebElement FirstName = null;

				if (arg1.trim().length() > 0) {
					FirstName = driver.findElement(By.xpath("//input[@id='registration_firstname']"));

					if (FirstName.isDisplayed()) {
						FirstName.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Firstname field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the last name - \"([^\"]*)\" in the Last name field$")
	public void user_enters_the_last_name_in_the_Last_name_field(String arg1) {

		try {
			if (driver != null) {

				WebElement LastName = null;

				WebElement LinkedInProfileURL = null;
				if (arg1.trim().length() > 0) {
					LastName = driver.findElement(By.xpath("//input[@id='registration_lastname']"));

					if (LastName.isDisplayed()) {
						LastName.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under LastName field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the email - \"([^\"]*)\" in the Email field$")
	public void user_enters_the_email_in_the_Email_field(String arg1) {

		try {
			if (driver != null) {
				WebElement Email = null;
				if (arg1.trim().length() > 0) {
					Email = driver.findElement(By.xpath("//input[@id='registration_email']"));

					if (Email.isDisplayed()) {
						Email.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Email field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the username - \"([^\"]*)\" in the Username field$")
	public void user_enters_the_username_in_the_Username_field(String arg1) {

		try {
			if (driver != null) {
				WebElement Username = null;

				if (arg1.trim().length() > 0) {
					Username = driver.findElement(By.xpath("//input[@id='username']"));

					if (Username.isDisplayed()) {
						
						Username.sendKeys(arg1+Math.random());
						System.out.println("Entered " + arg1 + " under Username field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the password - \"([^\"]*)\" in the pass field$")
	public void user_enters_the_password_in_the_pass_field(String arg1) {

		try {
			if (driver != null) {
				WebElement Password = null;

				if (arg1.trim().length() > 0) {
					Password = driver.findElement(By.xpath("//input[@id='pass1']"));

					if (Password.isDisplayed()) {
						Password.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Password field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the confirm Password - \"([^\"]*)\" in the Confirm Password field$")
	public void user_enters_the_confirm_Password_in_the_Confirm_Password_field(String arg1) {

		try {
			if (driver != null) {
				WebElement ConfirmPassword = null;

				if (arg1.trim().length() > 0) {
					ConfirmPassword = driver.findElement(By.xpath("//input[@id='pass2']"));

					if (ConfirmPassword.isDisplayed()) {
						ConfirmPassword.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Confirm Password field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user enters the Phone num - \"([^\"]*)\" in the Phone field$")
	public void user_enters_the_Phone_num_in_the_Phone_field(String arg1) {

		try {
			if (driver != null) {
				WebElement Phone = null;

				if (arg1.trim().length() > 0) {
					Phone = driver.findElement(By.xpath("//input[@id='registration_phone']"));

					if (Phone.isDisplayed()) {
						Phone.sendKeys(arg1);
						System.out.println("Entered " + arg1 + " under Phone field");
					}
				}
			}
		} catch (Exception ex) {

		}

	}

	@When("^user selects the Language - \"([^\"]*)\" in the Language select box$")
	public void user_selects_the_Language_in_the_Language_select_box(String arg1) {

		try {
			if (driver != null) {
				WebElement Language = null;

				if (arg1.trim().length() > 0) {
					Language = driver.findElement(By.xpath("//input[@id='registration_language']"));

					Select LanguageSelect = new Select(Language);

					LanguageSelect.selectByValue(arg1.trim().toLowerCase());
					System.out.println("Selected " + arg1 + " under Language field");

				}
			}
		} catch (Exception ex) {

		}

	}

	@Then("^Signup successful message should be displayed$")
	public void signup_successful_message_should_be_displayed() {

		try {
			if (driver != null) {
				WebElement RegisterHeader = null;

				RegisterHeader = driver
						.findElement(By.xpath("//li[@class='active' and contains(text='Registration')]"));

				if (RegisterHeader.isDisplayed()) {

					System.out.println(
							"Registration Header is displayed --- this means the success screen is displayed!");
				}
			}
		} catch (Exception ex) {

		}

	}
	
	@Then("^close the browser instance$")
	public void close_the_browser_instance() throws Throwable {
		
		try
		{
			if(driver!=null)
			{
				
				driver.quit();
			}
		}
		catch(Exception d)
		{
			
		}
		
	}
	

	

}
