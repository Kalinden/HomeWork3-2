import car.Main;
import car.Main.*;
import static org.testng.Assert.*;

import model.Model;
import org.testng.annotations.Test;

public class FirsTest extends TestBase {
    @Test(groups ="Positive")
    public void assertTest() throws InterruptedException {
        assertTrue(Model.Specs.HP > 111,"HP is bigger then 1");
        System.out.println("HP is true");
        System.out.println("Pause");
        Thread.sleep(2000);
    }
    @Test(groups ="Positive")
    public void assertTest2(){
       assertEquals(Model.Specs.engine,2.4,"2.4 is expected");
        System.out.println("Engine is true");
    }
    @Test(groups ="negative")
    public void asserTest3(){
        assertTrue(Model.Specs.type.contains("Cope"),"actual " + Model.Specs.type);
    }

}
