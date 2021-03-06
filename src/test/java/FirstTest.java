import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

    @AfterTest
    public void closeWebdriver(){
        System.out.println("test passed");
    }

    @BeforeTest
    public void init(){
        System.out.println("before");
    }

    @Test
    public void testTrueNotEqualsTOFalse(){
        System.out.println("this is test1");
    }

    @BeforeMethod
    public void beforeEveryTest(){
        System.out.println("I'm running before each test");
    }

    @Test(dependsOnMethods = "test2", alwaysRun = true)
    public void myTest(){
        System.out.println("this is test 2");
    }

    @Test
    public void bcdef(){
        System.out.println("this is test 2");
    }
}
