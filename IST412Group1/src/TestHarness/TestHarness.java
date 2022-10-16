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

import java.awt.event.ActionEvent;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author joepompilii
 */



public class TestHarness {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Initiating Test Harness...");
        TimeUnit.MILLISECONDS.sleep(500);

        // Testing Login Model, View, and Controller
        System.out.println("Testing Login UI...");
        LoginUI loginUI = new LoginUI();
        loginUI.isPanelRunning();
        System.out.println("Panel is running " + loginUI.isPanelRunning());
        System.out.println("Logging In Using Test User");
        TimeUnit.MILLISECONDS.sleep(500);
        LoginCtrl myLoginCtrl = new LoginCtrl();
        myLoginCtrl.login("admin", "password");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("Username: Admin, Password: *******");
        System.out.println("Login Successful");
        TimeUnit.MILLISECONDS.sleep(500);
        myLoginCtrl.handleNewUserButtonAction();
        TimeUnit.MILLISECONDS.sleep(500);
        myLoginCtrl.handleSubmitButtonAction();
        TimeUnit.SECONDS.sleep(1);

        // Testing Navigation Model, View, and Controller classes
        System.out.println("Testing the Navigation classes: \n");
        NavigationCtrl navCtrl = new NavigationCtrl();
        NavigationUI navUI = new NavigationUI();
        navUI.isNavigationUI();
        navUI.setNavigationUI(true);
        CustomerUI cusAccountUI = new CustomerUI();
        cusAccountUI.isCustomerUIActive();
        cusAccountUI.setCustomerUIActive(true);
        Customer customerModel = new Customer(1001, "user1", "password1", "firstname1", "lastname1", "01/01/2000", "email1@email.com");
        customerModel.setUserName("usernameNew");
        customerModel.setPassword("userpasswordNew");
        customerModel.setFirstName("firstnameNew");
        customerModel.setLastName("lastnameNew");
        customerModel.setDOB("01/02/2000");
        customerModel.setEmail("emailNew@email.com");
        customerModel.getUsername();
        customerModel.getPassword();
        customerModel.getFirstName();
        customerModel.getLastName();
        customerModel.getDOB();
        customerModel.getEmail();             

        // Testing Itinerary Model, View, and Controller classes
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
        itinView.btnAddActivity();
        TimeUnit.MILLISECONDS.sleep(500);
        itinCtrl.clickAdd();
        itinView.btnUpdateActivity();
        TimeUnit.MILLISECONDS.sleep(500);
        itinCtrl.clickUpdate();
        itinView.btnRemoveActivity();
        TimeUnit.MILLISECONDS.sleep(500);
        itinCtrl.clickRemove();
        itinView.btnReturnToNav();        
        TimeUnit.MILLISECONDS.sleep(500);
        itinCtrl.returnToNav();
        TimeUnit.SECONDS.sleep(1);
        // Testing Activity Model, View, and Controller classes
        System.out.println("Testing Activity Classes:\n");
        Activity activityModel = new Activity();
        ActivityUI activityView = new ActivityUI();
        ActivityCtrl activityCtrl = new ActivityCtrl();
        activityModel.setActivityName("Coaster 1");
        activityModel.setActivityType("Roller Coaster");
        activityModel.setActLenInMins(5);
        activityModel.setActivityAvail(true);
        activityModel.setWaitTimeInMins(15);
        activityView.ActivityUI();
        activityModel.getActivityName();
        activityModel.getActivityType();
        activityModel.getActLenInMins();
        activityModel.isActivityAvail();
        activityModel.getWaitTimeInMins();
        activityView.btnReturnToNav();
        activityCtrl.returnToNav();

        //Reports Model Logic Test Stubs
        System.out.println("\nTesting Reports Classes:\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Testing Reports UI:");
        ReportsUI reportsUI = new ReportsUI();
        reportsUI.isPanelRunning();
        System.out.println("Panel is running " + reportsUI.isPanelRunning());
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

    }

     
    
    // public void testBlankClass(){
    
    // System.out.println("Testing Blank Class");
    
    
    // }

}
