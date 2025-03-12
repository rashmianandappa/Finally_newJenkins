package pac1;
import org.testng.annotations.Test;
public class ContatTest {
	@Test()
	public void createContactTest()
	{
		String NAME = System.getProperty("name");
		String PASSWORD = System.getProperty("password");
		String URL = System.getProperty("url");
		String TOKEN = System.getProperty("token");
		System.out.println("Name is :"+ NAME);
		System.out.println("password is :"+ PASSWORD);
		System.out.println("url is :"+ URL);
		System.out.println("Token is :"+ TOKEN);
	}
	@Test()
	public void modifyContatcTest()
	{
		System.out.println("Its execting modifying Contact Test ");
	}

}
