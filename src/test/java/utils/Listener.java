package test.java.utils;

import org.openqa.selenium.WebDriver;
import org.testng.*;

public class Listener implements ISuiteListener, ITestListener, IInvokedMethodListener {


    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        //System.out.println("Start invoke " + iInvokedMethod.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        //System.out.println("Stop invoke " + "Start invoke" + iInvokedMethod.getTestMethod().getMethodName());
    }

    @Override
    public void onStart(ISuite iSuite) {

    }

    @Override
    public void onFinish(ISuite iSuite) {

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestContext  testContext = result.getTestContext();
        WebDriver driver = (WebDriver) testContext.getAttribute("driver");
   /*     Screenshot screenshot = new Screenshot(driver);
        screenshot.makeScreenshot(result);
*/
        System.out.println("success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestContext  testContext = result.getTestContext();
        WebDriver driver = (WebDriver) testContext.getAttribute("driver");
        Screenshot screenshot = new Screenshot(driver);
        screenshot.makeScreenshot(result);
        System.out.println("fail");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        //System.out.println("skipp");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        //System.out.println("test Start");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        //System.out.println("test Stop");
    }
}
