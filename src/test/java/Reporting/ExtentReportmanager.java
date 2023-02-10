package Reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExtentReportmanager {

    public static ExtentReports extentReports;
    public static ExtentReports createinstance(String filename, String reportName, String documentTitle){

        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(filename);
        extentSparkReporter.config().setReportName(reportName);
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setDocumentTitle(documentTitle);
        extentSparkReporter.config().setEncoding("utf-8");

         extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
         return extentReports;
    }

    public static String getReportName(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        LocalDate localDate = LocalDate.now();
        String formatteTime = dateTimeFormatter.format(localDate);
       String reportName=  "Test Report " + formatteTime + ".html";
        return reportName;
    }
}
