/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestHarness;

import Controller.LoginCtrl;
import View.LoginUI;
import Controller.ReportsCtrl;
import Model.Reports;
import Model.*;
import View.*;
import Controller.*;

import java.sql.SQLOutput;

/**
 *
 * @author joepompilii
 */



public class TestHarness {
    public static void main(String[] args) {
        System.out.println("Initiating Test Harness...");
        Reports myReportsModel = new Reports();
        ReportsCtrl myReportsCtrl = new ReportsCtrl();
        myReportsModel.setReportType("Test Report Type");
        myReportsModel.getReportType();
        myReportsModel.setReportDate("Test Report Date");
        myReportsModel.getReportDate();
        myReportsModel.setReportTime("Test Report Time");
        myReportsModel.getReportTime();
        myReportsModel.setReportDescription("Test Report Description");
        myReportsModel.getReportDescription();
        myReportsModel.setReportID("Test Report ID");
        myReportsModel.getReportID();


        myReportsCtrl.createReport();
        myReportsCtrl.modifyReport();
        myReportsCtrl.submitReport();
        myReportsCtrl.deleteReport();
        myReportsCtrl.returnReport();
        myReportsCtrl.approveReport();

    }

    public void testLoginCtrl (){
        LoginCtrl login1 = new LoginCtrl();
        
        
    }
    
    public void testItineraryCtrl() {
        System.out.println("Testing Itinerary Classes:\n");
        Itinerary itin1 = new Itinerary();
        
        
    }
    // public void testBlankClass(){
    
    // System.out.println("Testing Blank Class");
    
    
    // }

}
