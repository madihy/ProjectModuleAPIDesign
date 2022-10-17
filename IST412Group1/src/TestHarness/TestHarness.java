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
import java.util.ArrayList;
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
        System.out.println("\n" + "Testing the Navigation classes...");
        NavigationCtrl navCtrl = new NavigationCtrl();
        NavigationUI navUI = new NavigationUI();
        navUI.isNavigationUIActive();
        TimeUnit.MILLISECONDS.sleep(500);
        navUI.setNavigationUIActive(true);
        navCtrl.handleCustomerAccountButtonAction();
        CustomerUI cusAccountUI = new CustomerUI();
        cusAccountUI.setCustomerUIActive(true);
        cusAccountUI.isCustomerUIActive();
        Customer customerModel = new Customer(1001, "user1", "password1", "firstname1", "lastname1", "01/01/2000", "email1@email.com");
        System.out.println("Current customer account information is displayed!");
        customerModel.getUsername();
        customerModel.getPassword();
        customerModel.getFirstName();
        customerModel.getLastName();
        customerModel.getDOB();
        customerModel.getEmail();
        navCtrl.handleUpdateCustomerButtonAction();
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("New customer information has been updated and is displayed!");
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
        System.out.println("\n");
        
        navCtrl.handleCustomerBackButtonAction();
        TimeUnit.MILLISECONDS.sleep(500);
        navCtrl.handleParkInformationButtonAction();
        navCtrl.handlePurchaseTicketsButtonAction();
        navCtrl.handleManageTicketsButtonAction();
        navCtrl.handleManageActivitiesButtonAction();
        navCtrl.handleManageFoodOrdersButtonAction();
        navCtrl.handleManageReportsButtonAction();
        navCtrl.handleExitButtonAction();
        TimeUnit.MILLISECONDS.sleep(500);
                     
        //Testing Manage Tickets Model, View, and Controller classes.
        System.out.println("\n Testing Manage Ticket Classes...");
        ManageTicketsCtrl ticketsCtrl = new ManageTicketsCtrl();
        PurchaseTicketsUI purchaseView = new PurchaseTicketsUI();
        purchaseView.setPurchaseTicketsUIActive(true);
        purchaseView.isPurchaseTicketsUIActive();
        ticketsCtrl.updateTicketSelectionButtonEvent();
        TicketOrder ticketOrder1 = new TicketOrder(10001, 0, 0, null, 0, 0, 0, "in-progress");
        ticketOrder1.setQuantityTickets(1);
        ticketOrder1.setQuantityDays(1);
        System.out.println("Request made to calculate the order subtotal.");
        ticketOrder1.calculateOrderSubtotal(1,1);
        System.out.println("Request made to calculate the order tax.");
        ticketOrder1.calculateTax(50.00);
        System.out.println("Request made to calculate the order total.");
        ticketOrder1.calculateTotal(50.00, 3.00);
        ticketsCtrl.purchaseTicketsButtonEvent();
        System.out.println("Ticket order variables are set and tickets are created.");
        System.out.println("Request made to create a ticket array.");
        ticketOrder1.createTicketsArray(1, 1);
        ticketOrder1.setOrderNumber(10002);
        ticketOrder1.setQuantityTickets(1);
        ticketOrder1.setQuantityDays(1);
        ticketOrder1.setOrderSubtotal(50.00);
        ticketOrder1.setOrderTax(3.00);
        ticketOrder1.setOrderTotal(53.00);
        ticketOrder1.setOrderStatus("complete");
        ticketOrder1.setOrderTax(0);
        ticketOrder1.calculateTax(50.00);
        ticketOrder1.setOrderTax(3.00); 
        Ticket ticket1 = new Ticket(53.00, 1001, null, "Unassigned", false);
        ticketsCtrl.displayTicketOrderConfirmation();
        System.out.println("\n" + "Ticket order purchase is confirmed:");
        ticketOrder1.getOrderNumber();
        ticketOrder1.getQuantityTickets();
        ticketOrder1.getQuantityDays();
        ticketOrder1.getOrderSubtotal();
        ticketOrder1.getOrderTax();
        ticketOrder1.getOrderTotal();
        ticketOrder1.getOrderStatus();
        ticketOrder1.getTicketsOrdered();
        ticketsCtrl.cancelOrderButtonEvent();
        ticketsCtrl.manageTicketsButtonEvent(); 
        ManageTicketsUI manageTicketsView = new ManageTicketsUI();
        manageTicketsView.setManageTicketsUIActive(true);
        manageTicketsView.isManageTicketsUIActive();
        ticketsCtrl.handleTicketsBackButtonAction();
       
        
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
        
        // Testing Park Information
        System.out.println("\nTesting Park Information Classes\n");
        Park parkModel = new Park();
        ParkInformationCtrl infoCtrl = new ParkInformationCtrl();
        ParkInformationUI infoUI = new ParkInformationUI();
        
        parkModel.setParkAddress("1000 Wally Way, Orlando, FL, 88375");
        parkModel.setParkName("Wally Land - Orlando");
        parkModel.setParkHours("9am - 10pm");
        parkModel.getParkName();
        parkModel.getParkAddress();
        parkModel.getParkHours();
        
        
        
        
        // Testing Food Model, View, and Controller Classes
        System.out.println("\nTesting Food Classes\n");
        Food foodModel = new Food();
        FoodOrder foodOrderModel = new FoodOrder();
	Restaurant restaurantModel = new Restaurant();
        OrderFoodUI foodView = new OrderFoodUI();
        ManageFoodCtrl manageFoodCtrl = new ManageFoodCtrl();
        
        foodModel.setFoodName("Hot Dog");
        foodModel.setFoodDescription("All beef hotdog on housemade bun");
        foodModel.setFoodPrice(4.99);
        
        restaurantModel.setRestaurantName("Wally Dog's");
        restaurantModel.setRestaurantDescription("Hot Dog's, Wally's Way!");
        restaurantModel.setRestaurantLocation("Wild West Land");
        
        foodOrderModel.setOrderNumber(1);
        foodOrderModel.setFoodOrderSubtotal(4.99);
        foodOrderModel.setFoodOrderTax(0);
        foodOrderModel.setFoodOrderTotal(4.99);
        foodOrderModel.setFoodOrderStatus("Ready for Pickup!");
        
        foodModel.getFoodName();
        foodModel.getFoodDescription();
        foodModel.getFoodPrice();
        
        restaurantModel.getRestaurantName();
        restaurantModel.getRestaurantLocation();
        restaurantModel.getRestaurantDescription();
        
        foodOrderModel.getOrderNumber();
        foodOrderModel.getFoodOrderSubtotal();
        foodOrderModel.getFoodOrderTax();
        foodOrderModel.getFoodOrderTotal();
        foodOrderModel.getFoodOrderStatus();
        
        foodView.isOrderFoodUIActive();
        
       

    }

     
    
    // public void testBlankClass(){
    
    // System.out.println("Testing Blank Class");
    
    
    // }

}
