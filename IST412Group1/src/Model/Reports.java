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

    public Reports(String reportType, String reportDate, String reportTime, String reportLocation, String reportDescription, String reportStatus, String reportID) {
        this.reportType = reportType;
        this.reportDate = reportDate;
        this.reportTime = reportTime;
        this.reportLocation = reportLocation;
        this.reportDescription = reportDescription;
        this.reportStatus = reportStatus;
        this.reportID = reportID;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportLocation() {
        return reportLocation;
    }

    public void setReportLocation(String reportLocation) {
        this.reportLocation = reportLocation;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    @Override
    public String toString() {
        return "Reports{" + "reportType=" + reportType + ", reportDate=" + reportDate + ", reportTime=" + reportTime + ", reportLocation=" + reportLocation + ", reportDescription=" + reportDescription + ", reportStatus=" + reportStatus + ", reportID=" + reportID + '}';
    }

}
