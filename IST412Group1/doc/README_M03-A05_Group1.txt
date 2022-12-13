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

The Order Food use case was designed to purchase food from different restaurants. The user can select a restaurant, which
then takes them to an order page. On that page the user is able to select a quantity and place an order. There is a final
order confirmation page that displays the order details. The user can then go back to the main menu or exit the application.
This use case is initiated by the user selecting the "Order Food" option from the main menu. This brings up the OrderFoodUI.
The ManageFoodCtrl class is used to manage the food items. There are method creating various objects and adding them to
an Arraylist which  is then displayed in the UI.