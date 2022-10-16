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
import View.ItineraryUI;
import Controller.*;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author joepompilii
 */



public class TestHarness {
    public static void main(String[] args) throws InterruptedException {


        //Reports Model Logic Test Stubs
        System.out.println("Initiating Test Harness...");
        TimeUnit.SECONDS.sleep(1);
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
        TimeUnit.SECONDS.sleep(1);
        //Reports Control Logic Test Stubs
        myReportsCtrl.createReport();
        myReportsCtrl.modifyReport();
        myReportsCtrl.submitReport();
        myReportsCtrl.deleteReport();
        myReportsCtrl.returnReport();
        myReportsCtrl.approveReport();
        
        TimeUnit.SECONDS.sleep(1);
        
        // Testing Itinerary Model, View, and Controller packages
        System.out.println("\nTesting Itinerary Classes:\n");
        Itinerary itinModel = new Itinerary();
        ItineraryCtrl itinCtrl = new ItineraryCtrl();
        ItineraryUI itinView = new ItineraryUI();
        
        itinModel.setItinView("Setting Itinerary View");
        itinModel.getItinView();
        TimeUnit.SECONDS.sleep(1);
        itinModel.getItinModel();
        TimeUnit.SECONDS.sleep(1);
        itinCtrl.printIniterary(itinModel);
        
    }

    public void testLoginCtrl (){
        LoginCtrl login1 = new LoginCtrl();
        
        
    }
    
    
    // public void testBlankClass(){
    
    // System.out.println("Testing Blank Class");
    
    
    // }

}
