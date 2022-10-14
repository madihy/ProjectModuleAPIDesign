/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestHarness;

import Controller.LoginCtrl;
import View.LoginUI;
import Controller.ReportsCtrl;
import Model.Reports;

import java.sql.SQLOutput;

/**
 *
 * @author joepompilii
 */



public class TestHarness {
    static private Reports myReportsModel;
    public static void main(String[] args) {
        System.out.println("Initiating Test Harness...");
        myReportsModel = new Reports();
        myReportsModel.setReportType("Sales");
        myReportsModel.getReportType();
    }

    public void testLoginCtrl (){
        LoginCtrl login1 = new LoginCtrl();
        
        
    }
    // public void testBlankClass(){
    
    // System.out.println("Testing Blank Class");
    
    
    // }

}
