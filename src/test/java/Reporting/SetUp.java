package Reporting;

import com.aventstack.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.ITestListener;

public class SetUp implements ITestListener {
    ExtentReports extentreports;
    public void onStart(ITestContext context) {
        String reportName = ExtentReportmanager.getReportName();
        String extentreportname = System.getProperty("user.dir") + "\\Reports\\" + reportName;
        extentreports = ExtentReportmanager.createinstance(extentreportname, "Automation Test Results", "Test Results");
    }

    public void onFinish(ITestContext context) {
        if(extentreports!=null){
            extentreports.flush();
        }
    }
}
