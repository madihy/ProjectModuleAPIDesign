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
    public Reports(String reportType, String reportDate, String reportTime, String reportLocation, String reportDescription, String reportStatus, String reportID) {
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
    public String getReportType() {
        return reportType;
    }
    /**
     * This method sets the report type.
     * @author hythammadi
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
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
    public String getReportStatus() {
        return reportStatus;
    }
    /**
     * This method sets the report status.
     * @author hythammadi
     */
    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }
    /**
     * This method gets the report ID.
     * @author hythammadi
     */
    public String getReportID() {
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