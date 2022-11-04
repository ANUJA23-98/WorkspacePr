package utility;
import cucumber.api.java.en.Given;
public class Login 
{
	@Given ("^User provide browser name as \"(.*)\" and exe location as \"(.*)\"$")
	public void bLaunch(String name,String location ) throws InterruptedException
	{Thread.sleep(5000);
		Object[] input=new Object[2];
           input[0]=name;
           input[1]=location;
         SeleniumOperations.browserLaunch(input);	
	}

@Given ("^User enter url as \"(.*)\"$")
public void openApp(String url) throws InterruptedException
	{Thread.sleep(5000);
	Object[] input1=new Object[1];
	input1[0]=url;
	SeleniumOperations.openApplication(input1);
	}
}