/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import View.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Account;
import Model.Authentication;
import View.LoginUI;
import View.NavigationUI;

import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;


/**
 *
 * @author Kate
 * This class manages the actions to facilitate the login process for all users of this application.
 */
public class LoginCtrl {
    public ArrayList<Account> usersArray = new ArrayList<>();
    public String currentUsername;
    public String currentPassword;
    private String event;
    File f = new File("USERDATA.txt");
    int ln;
    private LoginUI2 loginUI2;
    String Username,Password,Email,fname, lname;
    public Boolean getSuccess = false;

    
    /**
     * Login method to authenticate user login credentials.
     */
    public void login(String username, String password) {
        Authentication auth = new Authentication(usersArray, currentUsername, currentPassword);
        auth.readUserDataFile();



        auth.createTestUsers();
        
    }


    /**
     * Establishes the action event to be carried out when the new user button is selected on the login screen.
     * Directs the user to the new user login screen to set up a user account.
     */
    public void handleNewUserButtonAction(String usr,String pswd){
                
        /**try {
            RandomAccessFile raf = new RandomAccessFile(inputFile, "rw");
            for(int i=0;i<ln;i++){
                raf.readLine();
            }
            if(ln>0){
                raf.writeBytes("\r\n");
                raf.writeBytes("\r\n");
            }
            raf.writeBytes(usr+ ",");
            raf.writeBytes(pswd + "\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginCtrl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }


    /**
     * Creates new form notepad
     */

   public void createFolder(){
        if(!f.exists()){
            f.mkdirs();
        }
    }

   public void readFile(){
        try {
            FileReader fr = new FileReader(f);
            System.out.println("file exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(f);
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(LoginCtrl.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

    }

    public void addData(String usr,String pswd,String mail, String fname, String lname){
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for(int i=0;i<ln;i++){
                raf.readLine();
            }
            if(ln>0){
                raf.writeBytes("\r\n");
                raf.writeBytes("\r\n");
            }
            raf.writeBytes("Username:"+usr+ "\r\n");
            raf.writeBytes("Password:"+pswd+ "\r\n");
            raf.writeBytes("Email:"+mail+ "\r\n");
            raf.writeBytes("First Name:"+fname + "\r\n");
            raf.writeBytes("Last Name:"+lname);


        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginCtrl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Establishes the action event to be carried out when the submit button is selected on the login screen.
     * Authenticates the user name and password from the list of accounts stored in a data file.
     * Throws an exception and provides an message on the screen if the login information is not found.
     */
    public void logic(String usr,String pswd){
        NavigationUI navigationUI = new NavigationUI();
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for(int i=0;i<ln;i+=6){System.out.println("count "+i);

                String forUser = raf.readLine().substring(9);
                String forPswd = raf.readLine().substring(9);
                if(usr.equals(forUser) & pswd.equals(forPswd)){
                    navigationUI.setVisible(true);
                    getSuccess = true;
                    break;
                }else if(i==(ln-5)){
                    JOptionPane.showMessageDialog(null, "incorrect username/password");
                    break;
                }
                for(int k=1;k<=4;k++){
                    raf.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginCtrl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Counts the number of lines in the txt file.
     * Prints out number of lines.
     * Throws exception if there is an error.
     */
   public void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginCtrl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
