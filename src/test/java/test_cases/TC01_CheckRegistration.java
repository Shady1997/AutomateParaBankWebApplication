package test_cases;

import com.example.pages.P02_SignUp;
import org.testng.annotations.Test;

public class TC01_CheckRegistration extends TestBase{

    P02_SignUp signUp;

    @Test(priority = 2 , groups = "smoke",description =" Register New Account with Valid Data")
    public void registerNewAccount() throws InterruptedException {
      signUp=new P02_SignUp(driver);
      signUp.registerNewAccount("Shady","Ahmed","Abu KAbir - El Sharkia - Egypt", "Abu Kabir", "Abu Kabir" , "44671","+201203199419","55kk","shady1997","P@ssw0rd","P@ssw0rd");
    }
}
