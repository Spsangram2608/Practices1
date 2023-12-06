package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomfiles.Lpage;

public class MainRun extends Browser 

{
	@Test
    @Parameters("browser")
    public void run(String browser) {
        // No need to create a new instance of Browser; it's already set up in the BeforeTest method
        Lpage lp = new Lpage(driver);
        String un = "lacta";
        String pw = "school";
        lp.Utab(un);
        lp.Ptab(pw);
        lp.Loginbt();
    }
}
