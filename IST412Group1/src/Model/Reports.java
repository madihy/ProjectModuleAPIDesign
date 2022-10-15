package Model;

/**
 * This class contains the model for the reports
 * @author hythammadi
 */

public class Reports {
    private String reportType;
    private String reportDate;
    private String reportTime;
    private String reportLocation;
    private String reportDescription;
    private String reportStatus;
    private String reportID;
    /**
     * Reports constructor
     * @author hythammadi
     */
    public void ReportsSets(String reportType, String reportDate, String reportTime, String reportLocation, String reportDescription, String reportStatus, String reportID) {
        this.reportType = reportType;
        this.reportDate = reportDate;
        this.reportTime = reportTime;
        this.reportLocation = reportLocation;
        this.reportDescription = reportDescription;
        this.reportStatus = reportStatus;
        this.reportID = reportID;
    }


    /**
     * This method gets the type of report
     * @author hythammadi
     */
    public void getReportType() {
        System.out.println("Report type is... " + reportType);
    }
    /**
     * This method sets the report type.
     * @author hythammadi
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
        System.out.println("Setting report type to... " + reportType);
    }
    /**
     * This method sets the report type.
     * @author hythammadi
     */
    public String getReportDate() {
        return reportDate;
    }
    /**
     * This method sets the report date.
     * @author hythammadi
     */
    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }
    /**
     * This method gets the report time.
     * @author hythammadi
     */
    public String getReportTime() {
        System.out.println("Report time is... " + reportTime);
        return reportTime;
    }
    /**
     * This method sets the report time.
     * @author hythammadi
     */
    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }
    /**
     * This method gets the report description.
     * @author hythammadi
     */
    public String getReportDescription() {
        System.out.println("Report description is... " + reportDescription);
        return reportDescription;
    }
    /**
     * This method sets the report description.
     * @author hythammadi
     */
    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }
    /**
     * This method gets the report status.
     * @author hythammadi
     */
    public String getReportID() {
        System.out.println("Report ID is... " + reportID);
        return reportID;
    }
    /**
     * This method sets the report ID.
     * @author hythammadi
     */
    public void setReportID(String reportID) {
        this.reportID = reportID;
    }
    /**
     * This toString returns the Reports parameters.
     * @author hythammadi
     */
    @Override
    public String toString() {
        return "Reports{" + "reportType=" + reportType + ", reportDate=" + reportDate + ", reportTime=" + reportTime + ", reportLocation=" + reportLocation + ", reportDescription=" + reportDescription + ", reportStatus=" + reportStatus + ", reportID=" + reportID + '}';
    }

}