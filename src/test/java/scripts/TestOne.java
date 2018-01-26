package scripts;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Rupesh Kumar on 1/26/2018.
 */
public class TestOne {

    @Test
    @Parameters("browser")
    public void methodOne(String browser, ITestContext itc) {
        System.out.println(browser);
        System.out.println(itc.getSuite().getName());
        System.out.println(itc.getCurrentXmlTest().getAllParameters());
        System.out.println(itc.getCurrentXmlTest().getName());
    }

}
