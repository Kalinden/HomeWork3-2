
import org.testng.annotations.*;

public class TestBase {
    @BeforeTest
    public void dataSeed(){
        System.out.println("Seeding data");
    }
    @AfterTest
    public void dataClean(){
        System.out.println("clean");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Openning Browser");
    }
    @AfterMethod
    public void teardown(){
        System.out.println("close browser");
    }
}
