Group 1: 
Hytham Madi
Joseph Pompilii
Kate Rineer
Brandon Worley

Use Case: Login to WallyWorld Application

Description:  
To complete this use case for a user to be able to create an account and log into the WallyWorld application, 
we used the Model package classes of Account, Customer, and Authentication, the View package LoginUI
and the Controller package LoginCtrl class.  To initiate this use case, the LoginCtrl is launched from the Main 
class in the application.  The LoginCtrl launches the LoginUI where the user can create a new account or login
using the username and password with an existing account.  Logic is in place to check the credentials and 
provide an error as appropriate. If successful, a pop-up appears indicating it was successful.  With future
use cases it will then, take them to the Navigation Menu.  The user information is stored in the USERDATA.txt 
file in the application files for data persistence. 