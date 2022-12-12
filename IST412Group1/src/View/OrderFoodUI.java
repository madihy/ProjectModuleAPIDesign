/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ManageFoodCtrl;
import Controller.NavigationCtrl;
import Model.Food;
import Model.FoodOrder;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Kate
 */
public class OrderFoodUI extends javax.swing.JFrame {
    ArrayList<Food> menuSelections;
    ManageFoodCtrl manageFoodCtrl;
    FoodOrder newFoodOrder;

    /**
     * Creates new form OrderFoodUI2
     */
    public OrderFoodUI() {
        initComponents();
    }
    public ArrayList<Food> getSelectedFoods(){
        manageFoodCtrl = new ManageFoodCtrl();
        menuSelections = new ArrayList<Food>(); //receives the selected foods from controller method call
        
        //get quantity input values from the UI to pass to the manage food controller
        int sandwich = Integer.parseInt(this.spnDeliSandwichQty.getValue().toString());
        int sub = Integer.parseInt(this.spnDeliSubQty.getValue().toString());
        int salad = Integer.parseInt(this.spnDeliSaladQty.getValue().toString());
        int cookie = Integer.parseInt(this.spnDeliCookieQty.getValue().toString());
        int deliChips = Integer.parseInt(this.spnDeliChipsQty.getValue().toString());
        int brownie = Integer.parseInt(this.spnDeliBrownieQty.getValue().toString());
        int deliFountain = Integer.parseInt(this.spnDeliFountainQty.getValue().toString());
        int deliBottled = Integer.parseInt(this.spnDeliBottledQty.getValue().toString());
        int smallPizza = Integer.parseInt(this.spnItalianSmPizzaQty.getValue().toString());
        int largePizza = Integer.parseInt(this.spnItalianLgPizzaQty.getValue().toString());
        int pastaBowl = Integer.parseInt(this.spnItalianPastaQty.getValue().toString());
        int gelato = Integer.parseInt(this.spnItalianGelatoQty.getValue().toString());
        int dessertPizza = Integer.parseInt(this.spnItalianDesPizzaQty.getValue().toString());
        int italianFountain = Integer.parseInt(this.spnItalianFountainQty.getValue().toString());
        int italianBottled = Integer.parseInt(this.spnItalianBottledQty.getValue().toString());
        int hotdog = Integer.parseInt(this.spnGrillHotDogQty.getValue().toString());
        int hamburger = Integer.parseInt(this.spnGrillHamburgerQty.getValue().toString());
        int turkeyLeg = Integer.parseInt(this.spnGrillTurkeyLegQty.getValue().toString());
        int chickenNuggets = Integer.parseInt(this.spnGrillChickenNuggetsQty.getValue().toString());
        int grillChips = Integer.parseInt(this.spnGrillChipsQty.getValue().toString());
        int frenchFries = Integer.parseInt(this.spnGrillFriesQty.getValue().toString());
        int milkshake = Integer.parseInt(this.spnGrillMilkshakeQty.getValue().toString());
        int grillFountain = Integer.parseInt(this.spnGrillFountainQty.getValue().toString());
        int grillBottled = Integer.parseInt(this.spnGrillBottledQty.getValue().toString());
        int tacos = Integer.parseInt(this.spnMexicanTacosQty.getValue().toString());
        int burrito = Integer.parseInt(this.spnMexicanBurritoQty.getValue().toString());
        int riceBowl = Integer.parseInt(this.spnMexicanRiceBowlQty.getValue().toString());
        int churro = Integer.parseInt(this.spnMexicanChurroQty.getValue().toString());
        int chipsSalsa = Integer.parseInt(this.spnMexicanChipsSalsaQty.getValue().toString());
        int guacamole = Integer.parseInt(this.spnMexicanGuacamoleQty.getValue().toString());
        int mexicanFountain = Integer.parseInt(this.spnMexicanFountainQty.getValue().toString());
        int mexicanBottled = Integer.parseInt(this.spnMexicanBottledQty.getValue().toString());
        
        //call to method to create the selected foods array in the manage foods controller
        menuSelections = manageFoodCtrl.createSelectedFoodsArray(sandwich, sub, salad, cookie, deliChips, 
                brownie, deliFountain, deliBottled, smallPizza, largePizza, pastaBowl, gelato, dessertPizza, 
                italianFountain, italianBottled, hotdog, hamburger, turkeyLeg, chickenNuggets, grillChips, 
                frenchFries, milkshake, grillFountain, grillBottled, tacos, burrito, riceBowl, churro, 
                chipsSalsa, guacamole, mexicanFountain, mexicanBottled);
        
        this.menuSelections = menuSelections;
        this.manageFoodCtrl = manageFoodCtrl;
        
        return menuSelections;
    }
    
    public void setFoodOrderConfirmationInfo(FoodOrder inf_foodOrder){
        
        this.lblConfirmOrderNumberValue.setText(String.valueOf(newFoodOrder.getOrderNumber()));
        this.lblRestaurantNameValue.setText(newFoodOrder.getRestaurantName());
        this.lblConfirmSubtotalValue.setText("$" + String.format("%.2f", newFoodOrder.getFoodOrderSubtotal()));
        this.lblConfirmTaxValue.setText("$" + String.format("%.2f", newFoodOrder.getFoodOrderTax()));
        this.lblConfirmTotalCostValue.setText("$" + String.format("%.2f", newFoodOrder.getFoodOrderTotal()));
        
        for(int i = 0; i < menuSelections.size(); i++){
            this.taFoodsSelected.append(menuSelections.get(i).toString());
            this.taFoodsSelected.append("\n");
        }
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        pnlSelectRestaurant = new javax.swing.JPanel();
        btnSandwichShop = new javax.swing.JButton();
        btnSofiasPizza = new javax.swing.JButton();
        btnElTaco = new javax.swing.JButton();
        btnGrubGrill = new javax.swing.JButton();
        lblSelectRestaurant = new javax.swing.JLabel();
        btnMainMenuResSel = new javax.swing.JButton();
        pnlSandwichShop = new javax.swing.JPanel();
        lblSelectRestaurantTitle1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        spnDeliSandwichQty = new javax.swing.JSpinner();
        spnDeliSubQty = new javax.swing.JSpinner();
        spnDeliSaladQty = new javax.swing.JSpinner();
        spnDeliCookieQty = new javax.swing.JSpinner();
        spnDeliChipsQty = new javax.swing.JSpinner();
        spnDeliBottledQty = new javax.swing.JSpinner();
        spnDeliBrownieQty = new javax.swing.JSpinner();
        spnDeliFountainQty = new javax.swing.JSpinner();
        btnDeliCancelOrder = new javax.swing.JButton();
        btnDeliPlaceOrder = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pnlSofiasPizza = new javax.swing.JPanel();
        lblSelectRestaurantTitle2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        spnItalianSmPizzaQty = new javax.swing.JSpinner();
        spnItalianLgPizzaQty = new javax.swing.JSpinner();
        spnItalianPastaQty = new javax.swing.JSpinner();
        spnItalianGelatoQty = new javax.swing.JSpinner();
        spnItalianDesPizzaQty = new javax.swing.JSpinner();
        spnItalianFountainQty = new javax.swing.JSpinner();
        spnItalianBottledQty = new javax.swing.JSpinner();
        btnItalianCancelOrder = new javax.swing.JButton();
        btnItalianPlaceOrder = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        pnlGrubGrill = new javax.swing.JPanel();
        lblSelectRestaurantTitle3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        spnGrillHotDogQty = new javax.swing.JSpinner();
        spnGrillHamburgerQty = new javax.swing.JSpinner();
        spnGrillTurkeyLegQty = new javax.swing.JSpinner();
        spnGrillChickenNuggetsQty = new javax.swing.JSpinner();
        spnGrillChipsQty = new javax.swing.JSpinner();
        spnGrillFountainQty = new javax.swing.JSpinner();
        spnGrillFriesQty = new javax.swing.JSpinner();
        spnGrillMilkshakeQty = new javax.swing.JSpinner();
        btnGrillCancelOrder = new javax.swing.JButton();
        btnGrillPlaceOrder = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel55 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        spnGrillBottledQty = new javax.swing.JSpinner();
        pnlElTaco = new javax.swing.JPanel();
        lblSelectRestaurantTitle4 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        spnMexicanTacosQty = new javax.swing.JSpinner();
        spnMexicanBurritoQty = new javax.swing.JSpinner();
        spnMexicanRiceBowlQty = new javax.swing.JSpinner();
        spnMexicanChurroQty = new javax.swing.JSpinner();
        spnMexicanChipsSalsaQty = new javax.swing.JSpinner();
        spnMexicanFountainQty = new javax.swing.JSpinner();
        spnMexicanGuacamoleQty = new javax.swing.JSpinner();
        btnMexicanCancelOrder = new javax.swing.JButton();
        btnMexicanPlaceOrder = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel76 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        spnMexicanBottledQty = new javax.swing.JSpinner();
        pnlFoodOrderConfirmation = new javax.swing.JPanel();
        lblFoodOrderConfTitle = new javax.swing.JLabel();
        lblOrderNumber = new javax.swing.JLabel();
        lblRestaurant = new javax.swing.JLabel();
        lblConfirmSubtotal = new javax.swing.JLabel();
        lblConfirmTax = new javax.swing.JLabel();
        lblConfirmTotalCost = new javax.swing.JLabel();
        lblConfirmTotalCostValue = new javax.swing.JLabel();
        lblConfirmTaxValue = new javax.swing.JLabel();
        lblConfirmSubtotalValue = new javax.swing.JLabel();
        lblRestaurantNameValue = new javax.swing.JLabel();
        lblConfirmOrderNumberValue = new javax.swing.JLabel();
        lblListFoodsSelected = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taFoodsSelected = new javax.swing.JTextArea();
        btnMainMenuOrdCon = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmOrderFood"); // NOI18N
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlSelectRestaurant.setLayout(new java.awt.GridBagLayout());

        btnSandwichShop.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSandwichShop.setText("Sandwich Shop");
        btnSandwichShop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSandwichShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSandwichShopActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 32, 0, 10);
        pnlSelectRestaurant.add(btnSandwichShop, gridBagConstraints);

        btnSofiasPizza.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSofiasPizza.setText("Sofia's Pizza");
        btnSofiasPizza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSofiasPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSofiasPizzaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 185;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 10);
        pnlSelectRestaurant.add(btnSofiasPizza, gridBagConstraints);

        btnElTaco.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnElTaco.setText("El Taco");
        btnElTaco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnElTaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElTacoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 221;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 10);
        pnlSelectRestaurant.add(btnElTaco, gridBagConstraints);

        btnGrubGrill.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGrubGrill.setText("Grub Grill");
        btnGrubGrill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGrubGrill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrubGrillActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 10);
        pnlSelectRestaurant.add(btnGrubGrill, gridBagConstraints);

        lblSelectRestaurant.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSelectRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectRestaurant.setText("Select a Restaurant");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 10);
        pnlSelectRestaurant.add(lblSelectRestaurant, gridBagConstraints);

        btnMainMenuResSel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnMainMenuResSel.setText("Main Menu");
        btnMainMenuResSel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMainMenuResSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuResSelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 32, 179, 10);
        pnlSelectRestaurant.add(btnMainMenuResSel, gridBagConstraints);

        getContentPane().add(pnlSelectRestaurant);

        pnlSandwichShop.setLayout(new java.awt.GridBagLayout());

        lblSelectRestaurantTitle1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSelectRestaurantTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectRestaurantTitle1.setText("Sandwich Shop Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlSandwichShop.add(lblSelectRestaurantTitle1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Sandwich");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlSandwichShop.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Sub");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 93;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlSandwichShop.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Salad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlSandwichShop.add(jLabel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Chips");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlSandwichShop.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Cookie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlSandwichShop.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Fountain Drink");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlSandwichShop.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Brownie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 66;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlSandwichShop.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Bottled Drink");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlSandwichShop.add(jLabel9, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("$ 9.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlSandwichShop.add(jLabel4, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("$ 12.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlSandwichShop.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("$ 7.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlSandwichShop.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("$ 3.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlSandwichShop.add(jLabel12, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("$ 4.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlSandwichShop.add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("$ 2.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlSandwichShop.add(jLabel14, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("$ 4.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlSandwichShop.add(jLabel15, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("$ 3.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlSandwichShop.add(jLabel16, gridBagConstraints);

        spnDeliSandwichQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSandwichShop.add(spnDeliSandwichQty, gridBagConstraints);

        spnDeliSubQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSandwichShop.add(spnDeliSubQty, gridBagConstraints);

        spnDeliSaladQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSandwichShop.add(spnDeliSaladQty, gridBagConstraints);

        spnDeliCookieQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSandwichShop.add(spnDeliCookieQty, gridBagConstraints);

        spnDeliChipsQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSandwichShop.add(spnDeliChipsQty, gridBagConstraints);

        spnDeliBottledQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSandwichShop.add(spnDeliBottledQty, gridBagConstraints);

        spnDeliBrownieQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSandwichShop.add(spnDeliBrownieQty, gridBagConstraints);

        spnDeliFountainQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSandwichShop.add(spnDeliFountainQty, gridBagConstraints);

        btnDeliCancelOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDeliCancelOrder.setText("Cancel Order");
        btnDeliCancelOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeliCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliCancelOrderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 124, 0);
        pnlSandwichShop.add(btnDeliCancelOrder, gridBagConstraints);

        btnDeliPlaceOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDeliPlaceOrder.setText("Place Order");
        btnDeliPlaceOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeliPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliPlaceOrderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 15, 124, 0);
        pnlSandwichShop.add(btnDeliPlaceOrder, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Menu Options");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 10, 0, 0);
        pnlSandwichShop.add(jLabel17, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Select Quantity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 34, 0, 0);
        pnlSandwichShop.add(jLabel18, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlSandwichShop.add(jSeparator1, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Price Each");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 20, 0, 0);
        pnlSandwichShop.add(jLabel19, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 10, 0, 0);
        pnlSandwichShop.add(jSeparator2, gridBagConstraints);

        getContentPane().add(pnlSandwichShop);

        pnlSofiasPizza.setLayout(new java.awt.GridBagLayout());

        lblSelectRestaurantTitle2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSelectRestaurantTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectRestaurantTitle2.setText("Sofia's Pizza Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        pnlSofiasPizza.add(lblSelectRestaurantTitle2, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel20.setText("Small Pizza");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlSofiasPizza.add(jLabel20, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel21.setText("Large Pizza");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlSofiasPizza.add(jLabel21, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel22.setText("Pasta Bowl");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlSofiasPizza.add(jLabel22, gridBagConstraints);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel23.setText("Dessert Pizza");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlSofiasPizza.add(jLabel23, gridBagConstraints);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel24.setText("Gelato");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlSofiasPizza.add(jLabel24, gridBagConstraints);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel25.setText("Bottled Drink");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlSofiasPizza.add(jLabel25, gridBagConstraints);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel26.setText("Fountain Drink");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlSofiasPizza.add(jLabel26, gridBagConstraints);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("$ 9.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlSofiasPizza.add(jLabel28, gridBagConstraints);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("$ 12.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlSofiasPizza.add(jLabel29, gridBagConstraints);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("$ 7.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlSofiasPizza.add(jLabel30, gridBagConstraints);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("$ 9.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlSofiasPizza.add(jLabel31, gridBagConstraints);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("$ 4.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlSofiasPizza.add(jLabel32, gridBagConstraints);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("$ 2.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlSofiasPizza.add(jLabel33, gridBagConstraints);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("$ 4.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlSofiasPizza.add(jLabel34, gridBagConstraints);

        spnItalianSmPizzaQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSofiasPizza.add(spnItalianSmPizzaQty, gridBagConstraints);

        spnItalianLgPizzaQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSofiasPizza.add(spnItalianLgPizzaQty, gridBagConstraints);

        spnItalianPastaQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSofiasPizza.add(spnItalianPastaQty, gridBagConstraints);

        spnItalianGelatoQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSofiasPizza.add(spnItalianGelatoQty, gridBagConstraints);

        spnItalianDesPizzaQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSofiasPizza.add(spnItalianDesPizzaQty, gridBagConstraints);

        spnItalianFountainQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSofiasPizza.add(spnItalianFountainQty, gridBagConstraints);

        spnItalianBottledQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        pnlSofiasPizza.add(spnItalianBottledQty, gridBagConstraints);

        btnItalianCancelOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnItalianCancelOrder.setText("Cancel Order");
        btnItalianCancelOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnItalianCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItalianCancelOrderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 20, 124, 0);
        pnlSofiasPizza.add(btnItalianCancelOrder, gridBagConstraints);

        btnItalianPlaceOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnItalianPlaceOrder.setText("Place Order");
        btnItalianPlaceOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnItalianPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItalianPlaceOrderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 15, 124, 0);
        pnlSofiasPizza.add(btnItalianPlaceOrder, gridBagConstraints);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Menu Options");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 20, 0, 0);
        pnlSofiasPizza.add(jLabel36, gridBagConstraints);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Select Quantity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 34, 0, 0);
        pnlSofiasPizza.add(jLabel37, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlSofiasPizza.add(jSeparator3, gridBagConstraints);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("Price Each");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 20, 0, 0);
        pnlSofiasPizza.add(jLabel38, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 10, 0, 0);
        pnlSofiasPizza.add(jSeparator4, gridBagConstraints);

        getContentPane().add(pnlSofiasPizza);

        pnlGrubGrill.setLayout(new java.awt.GridBagLayout());

        lblSelectRestaurantTitle3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSelectRestaurantTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectRestaurantTitle3.setText("Grub Grill Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 140;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlGrubGrill.add(lblSelectRestaurantTitle3, gridBagConstraints);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel27.setText("Hot Dog");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlGrubGrill.add(jLabel27, gridBagConstraints);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel35.setText("Hamburger");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlGrubGrill.add(jLabel35, gridBagConstraints);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel39.setText("Turkey leg");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlGrubGrill.add(jLabel39, gridBagConstraints);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel40.setText("Chips");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlGrubGrill.add(jLabel40, gridBagConstraints);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel41.setText("Chicken Nuggets");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlGrubGrill.add(jLabel41, gridBagConstraints);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel42.setText("Milkshake");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlGrubGrill.add(jLabel42, gridBagConstraints);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel43.setText("French Fries");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlGrubGrill.add(jLabel43, gridBagConstraints);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel44.setText("Fountain Drink");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlGrubGrill.add(jLabel44, gridBagConstraints);

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("$ 6.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlGrubGrill.add(jLabel45, gridBagConstraints);

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("$ 8.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlGrubGrill.add(jLabel46, gridBagConstraints);

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("$ 7.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlGrubGrill.add(jLabel47, gridBagConstraints);

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("$ 3.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlGrubGrill.add(jLabel48, gridBagConstraints);

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("$ 6.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlGrubGrill.add(jLabel49, gridBagConstraints);

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("$ 5.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlGrubGrill.add(jLabel50, gridBagConstraints);

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("$ 4.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlGrubGrill.add(jLabel51, gridBagConstraints);

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("$ 2.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlGrubGrill.add(jLabel52, gridBagConstraints);

        spnGrillHotDogQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        pnlGrubGrill.add(spnGrillHotDogQty, gridBagConstraints);

        spnGrillHamburgerQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        pnlGrubGrill.add(spnGrillHamburgerQty, gridBagConstraints);

        spnGrillTurkeyLegQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        pnlGrubGrill.add(spnGrillTurkeyLegQty, gridBagConstraints);

        spnGrillChickenNuggetsQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        pnlGrubGrill.add(spnGrillChickenNuggetsQty, gridBagConstraints);

        spnGrillChipsQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        pnlGrubGrill.add(spnGrillChipsQty, gridBagConstraints);

        spnGrillFountainQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        pnlGrubGrill.add(spnGrillFountainQty, gridBagConstraints);

        spnGrillFriesQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        pnlGrubGrill.add(spnGrillFriesQty, gridBagConstraints);

        spnGrillMilkshakeQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        pnlGrubGrill.add(spnGrillMilkshakeQty, gridBagConstraints);

        btnGrillCancelOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGrillCancelOrder.setText("Cancel Order");
        btnGrillCancelOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGrillCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrillCancelOrderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 20, 124, 0);
        pnlGrubGrill.add(btnGrillCancelOrder, gridBagConstraints);

        btnGrillPlaceOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGrillPlaceOrder.setText("Place Order");
        btnGrillPlaceOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGrillPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrillPlaceOrderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 25, 124, 0);
        pnlGrubGrill.add(btnGrillPlaceOrder, gridBagConstraints);

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel53.setText("Menu Options");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 10, 0, 0);
        pnlGrubGrill.add(jLabel53, gridBagConstraints);

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setText("Select Quantity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 34, 0, 0);
        pnlGrubGrill.add(jLabel54, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlGrubGrill.add(jSeparator5, gridBagConstraints);

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setText("Price Each");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 20, 0, 0);
        pnlGrubGrill.add(jLabel55, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        pnlGrubGrill.add(jSeparator6, gridBagConstraints);

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel56.setText("Bottled Drink");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlGrubGrill.add(jLabel56, gridBagConstraints);

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("$ 3.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlGrubGrill.add(jLabel57, gridBagConstraints);

        spnGrillBottledQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 32, 0, 0);
        pnlGrubGrill.add(spnGrillBottledQty, gridBagConstraints);

        getContentPane().add(pnlGrubGrill);

        pnlElTaco.setLayout(new java.awt.GridBagLayout());

        lblSelectRestaurantTitle4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSelectRestaurantTitle4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectRestaurantTitle4.setText("El Taco Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 172;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlElTaco.add(lblSelectRestaurantTitle4, gridBagConstraints);

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel58.setText("Tacos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 20, 0, 0);
        pnlElTaco.add(jLabel58, gridBagConstraints);

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel59.setText("Burrito");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlElTaco.add(jLabel59, gridBagConstraints);

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel60.setText("Rice Bowl");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlElTaco.add(jLabel60, gridBagConstraints);

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel61.setText("Chips & Salsa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlElTaco.add(jLabel61, gridBagConstraints);

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel62.setText("Churro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlElTaco.add(jLabel62, gridBagConstraints);

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel64.setText("Guacamole");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlElTaco.add(jLabel64, gridBagConstraints);

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel65.setText("Fountain Drink");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlElTaco.add(jLabel65, gridBagConstraints);

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel66.setText("$ 9.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 14, 0, 0);
        pnlElTaco.add(jLabel66, gridBagConstraints);

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel67.setText("$ 12.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlElTaco.add(jLabel67, gridBagConstraints);

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel68.setText("$ 12.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlElTaco.add(jLabel68, gridBagConstraints);

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel69.setText("$ 6.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlElTaco.add(jLabel69, gridBagConstraints);

        jLabel70.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("$ 4.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlElTaco.add(jLabel70, gridBagConstraints);

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("$ 3.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlElTaco.add(jLabel72, gridBagConstraints);

        jLabel73.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel73.setText("$ 2.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlElTaco.add(jLabel73, gridBagConstraints);

        spnMexicanTacosQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 27, 0, 0);
        pnlElTaco.add(spnMexicanTacosQty, gridBagConstraints);

        spnMexicanBurritoQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 27, 0, 0);
        pnlElTaco.add(spnMexicanBurritoQty, gridBagConstraints);

        spnMexicanRiceBowlQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 27, 0, 0);
        pnlElTaco.add(spnMexicanRiceBowlQty, gridBagConstraints);

        spnMexicanChurroQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 27, 0, 0);
        pnlElTaco.add(spnMexicanChurroQty, gridBagConstraints);

        spnMexicanChipsSalsaQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 27, 0, 0);
        pnlElTaco.add(spnMexicanChipsSalsaQty, gridBagConstraints);

        spnMexicanFountainQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 27, 0, 0);
        pnlElTaco.add(spnMexicanFountainQty, gridBagConstraints);

        spnMexicanGuacamoleQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 27, 0, 0);
        pnlElTaco.add(spnMexicanGuacamoleQty, gridBagConstraints);

        btnMexicanCancelOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnMexicanCancelOrder.setText("Cancel Order");
        btnMexicanCancelOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMexicanCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMexicanCancelOrderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 20, 123, 0);
        pnlElTaco.add(btnMexicanCancelOrder, gridBagConstraints);

        btnMexicanPlaceOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnMexicanPlaceOrder.setText("Place Order");
        btnMexicanPlaceOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMexicanPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMexicanPlaceOrderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 123, 0);
        pnlElTaco.add(btnMexicanPlaceOrder, gridBagConstraints);

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel74.setText("Menu Options");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 24, 0, 0);
        pnlElTaco.add(jLabel74, gridBagConstraints);

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel75.setText("Select Quantity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 20, 0, 0);
        pnlElTaco.add(jLabel75, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlElTaco.add(jSeparator7, gridBagConstraints);

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel76.setText("Price Each");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 20, 0, 0);
        pnlElTaco.add(jLabel76, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 10, 0, 0);
        pnlElTaco.add(jSeparator8, gridBagConstraints);

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel77.setText("Bottled Drink");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        pnlElTaco.add(jLabel77, gridBagConstraints);

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText("$ 3.99");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 14, 0, 0);
        pnlElTaco.add(jLabel78, gridBagConstraints);

        spnMexicanBottledQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 27, 0, 0);
        pnlElTaco.add(spnMexicanBottledQty, gridBagConstraints);

        getContentPane().add(pnlElTaco);

        pnlFoodOrderConfirmation.setLayout(new java.awt.GridBagLayout());

        lblFoodOrderConfTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblFoodOrderConfTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoodOrderConfTitle.setText("Food Order Confirmation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnlFoodOrderConfirmation.add(lblFoodOrderConfTitle, gridBagConstraints);

        lblOrderNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOrderNumber.setText("Order Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblOrderNumber, gridBagConstraints);

        lblRestaurant.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRestaurant.setText("Restaurant:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblRestaurant, gridBagConstraints);

        lblConfirmSubtotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmSubtotal.setText("Subtotal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 101;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblConfirmSubtotal, gridBagConstraints);

        lblConfirmTax.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmTax.setText("Tax Amount:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblConfirmTax, gridBagConstraints);

        lblConfirmTotalCost.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmTotalCost.setText("Total Cost:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblConfirmTotalCost, gridBagConstraints);

        lblConfirmTotalCostValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmTotalCostValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmTotalCostValue.setText("$0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblConfirmTotalCostValue, gridBagConstraints);

        lblConfirmTaxValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmTaxValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmTaxValue.setText("$0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblConfirmTaxValue, gridBagConstraints);

        lblConfirmSubtotalValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmSubtotalValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmSubtotalValue.setText("$0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblConfirmSubtotalValue, gridBagConstraints);

        lblRestaurantNameValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRestaurantNameValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRestaurantNameValue.setText("Restaurant Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblRestaurantNameValue, gridBagConstraints);

        lblConfirmOrderNumberValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmOrderNumberValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmOrderNumberValue.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblConfirmOrderNumberValue, gridBagConstraints);

        lblListFoodsSelected.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblListFoodsSelected.setText("Foods Selected:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 88;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        pnlFoodOrderConfirmation.add(lblListFoodsSelected, gridBagConstraints);

        taFoodsSelected.setColumns(20);
        taFoodsSelected.setRows(5);
        jScrollPane2.setViewportView(taFoodsSelected);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 225;
        gridBagConstraints.ipady = 166;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        pnlFoodOrderConfirmation.add(jScrollPane2, gridBagConstraints);

        btnMainMenuOrdCon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnMainMenuOrdCon.setText("Main Menu");
        btnMainMenuOrdCon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMainMenuOrdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuOrdConActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 57, 0);
        pnlFoodOrderConfirmation.add(btnMainMenuOrdCon, gridBagConstraints);

        getContentPane().add(pnlFoodOrderConfirmation);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSandwichShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSandwichShopActionPerformed
        this.pnlSelectRestaurant.setVisible(false);
        this.pnlSandwichShop.setVisible(true);
       
    }//GEN-LAST:event_btnSandwichShopActionPerformed

    private void btnSofiasPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSofiasPizzaActionPerformed
        this.pnlSelectRestaurant.setVisible(false);
        this.pnlSofiasPizza.setVisible(true);
         
    }//GEN-LAST:event_btnSofiasPizzaActionPerformed

    private void btnElTacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElTacoActionPerformed
        this.pnlSelectRestaurant.setVisible(false);
        this.pnlElTaco.setVisible(true);
            
    }//GEN-LAST:event_btnElTacoActionPerformed

    private void btnGrubGrillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrubGrillActionPerformed
        this.pnlSelectRestaurant.setVisible(false);
        this.pnlGrubGrill.setVisible(true);
    
    }//GEN-LAST:event_btnGrubGrillActionPerformed

    private void btnDeliPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliPlaceOrderActionPerformed
        menuSelections = this.getSelectedFoods();
        manageFoodCtrl.createFoodOrder("Sandwich Shop"); 
        newFoodOrder = manageFoodCtrl.getFoodOrderInformation();
        this.newFoodOrder = newFoodOrder;
        this.setFoodOrderConfirmationInfo(newFoodOrder);
        
        this.pnlFoodOrderConfirmation.setVisible(true); 
        this.pnlSandwichShop.setVisible(false);
        
    }//GEN-LAST:event_btnDeliPlaceOrderActionPerformed

    private void btnDeliCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliCancelOrderActionPerformed
        NavigationCtrl navCtrl = new NavigationCtrl();
        this.dispose();
    }//GEN-LAST:event_btnDeliCancelOrderActionPerformed

    private void btnItalianCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItalianCancelOrderActionPerformed
        NavigationCtrl navCtrl = new NavigationCtrl();
        this.dispose();
    }//GEN-LAST:event_btnItalianCancelOrderActionPerformed

    private void btnItalianPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItalianPlaceOrderActionPerformed
        menuSelections = this.getSelectedFoods();
        manageFoodCtrl.createFoodOrder("Sofia's Pizza");
        newFoodOrder = manageFoodCtrl.getFoodOrderInformation();
        this.newFoodOrder = newFoodOrder;
        setFoodOrderConfirmationInfo(newFoodOrder);
        
        this.pnlFoodOrderConfirmation.setVisible(true);
        this.pnlSofiasPizza.setVisible(false);
    }//GEN-LAST:event_btnItalianPlaceOrderActionPerformed

    private void btnGrillCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrillCancelOrderActionPerformed
        NavigationCtrl navCtrl = new NavigationCtrl();
        this.dispose();
    }//GEN-LAST:event_btnGrillCancelOrderActionPerformed

    private void btnGrillPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrillPlaceOrderActionPerformed
        menuSelections = this.getSelectedFoods();
        manageFoodCtrl.createFoodOrder("Grub Grill");
        newFoodOrder = manageFoodCtrl.getFoodOrderInformation();
        this.newFoodOrder = newFoodOrder;
        setFoodOrderConfirmationInfo(newFoodOrder);
        
        this.pnlFoodOrderConfirmation.setVisible(true);
        this.pnlGrubGrill.setVisible(false);
    }//GEN-LAST:event_btnGrillPlaceOrderActionPerformed

    private void btnMexicanCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMexicanCancelOrderActionPerformed
        NavigationCtrl navCtrl = new NavigationCtrl();
        this.dispose();
    }//GEN-LAST:event_btnMexicanCancelOrderActionPerformed

    private void btnMexicanPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMexicanPlaceOrderActionPerformed
        menuSelections = this.getSelectedFoods();
        manageFoodCtrl.createFoodOrder("El Taco"); 
        newFoodOrder = manageFoodCtrl.getFoodOrderInformation();
        this.newFoodOrder = newFoodOrder;
        setFoodOrderConfirmationInfo(newFoodOrder);        
        
        this.pnlFoodOrderConfirmation.setVisible(true);
        this.pnlElTaco.setVisible(false);
    }//GEN-LAST:event_btnMexicanPlaceOrderActionPerformed

    private void btnMainMenuOrdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuOrdConActionPerformed
        NavigationCtrl navCtrl = new NavigationCtrl();
        //add code to set the food orders array in the customer object and save to customer file to persist 
        
        this.dispose();
    }//GEN-LAST:event_btnMainMenuOrdConActionPerformed

    private void btnMainMenuResSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuResSelActionPerformed
        NavigationCtrl navCtrl = new NavigationCtrl();
        
    }//GEN-LAST:event_btnMainMenuResSelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderFoodUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFoodUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFoodUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFoodUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFoodUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDeliCancelOrder;
    public javax.swing.JButton btnDeliPlaceOrder;
    public javax.swing.JButton btnElTaco;
    public javax.swing.JButton btnGrillCancelOrder;
    public javax.swing.JButton btnGrillPlaceOrder;
    public javax.swing.JButton btnGrubGrill;
    public javax.swing.JButton btnItalianCancelOrder;
    public javax.swing.JButton btnItalianPlaceOrder;
    public javax.swing.JButton btnMainMenuOrdCon;
    public javax.swing.JButton btnMainMenuResSel;
    public javax.swing.JButton btnMexicanCancelOrder;
    public javax.swing.JButton btnMexicanPlaceOrder;
    public javax.swing.JButton btnSandwichShop;
    public javax.swing.JButton btnSofiasPizza;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JLabel lblConfirmOrderNumberValue;
    private javax.swing.JLabel lblConfirmSubtotal;
    public javax.swing.JLabel lblConfirmSubtotalValue;
    private javax.swing.JLabel lblConfirmTax;
    public javax.swing.JLabel lblConfirmTaxValue;
    private javax.swing.JLabel lblConfirmTotalCost;
    public javax.swing.JLabel lblConfirmTotalCostValue;
    private javax.swing.JLabel lblFoodOrderConfTitle;
    private javax.swing.JLabel lblListFoodsSelected;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblRestaurant;
    public javax.swing.JLabel lblRestaurantNameValue;
    private javax.swing.JLabel lblSelectRestaurant;
    private javax.swing.JLabel lblSelectRestaurantTitle1;
    private javax.swing.JLabel lblSelectRestaurantTitle2;
    private javax.swing.JLabel lblSelectRestaurantTitle3;
    private javax.swing.JLabel lblSelectRestaurantTitle4;
    public javax.swing.JPanel pnlElTaco;
    public javax.swing.JPanel pnlFoodOrderConfirmation;
    public javax.swing.JPanel pnlGrubGrill;
    public javax.swing.JPanel pnlSandwichShop;
    public javax.swing.JPanel pnlSelectRestaurant;
    public javax.swing.JPanel pnlSofiasPizza;
    public javax.swing.JSpinner spnDeliBottledQty;
    public javax.swing.JSpinner spnDeliBrownieQty;
    public javax.swing.JSpinner spnDeliChipsQty;
    public javax.swing.JSpinner spnDeliCookieQty;
    public javax.swing.JSpinner spnDeliFountainQty;
    public javax.swing.JSpinner spnDeliSaladQty;
    public javax.swing.JSpinner spnDeliSandwichQty;
    public javax.swing.JSpinner spnDeliSubQty;
    public javax.swing.JSpinner spnGrillBottledQty;
    public javax.swing.JSpinner spnGrillChickenNuggetsQty;
    public javax.swing.JSpinner spnGrillChipsQty;
    public javax.swing.JSpinner spnGrillFountainQty;
    public javax.swing.JSpinner spnGrillFriesQty;
    public javax.swing.JSpinner spnGrillHamburgerQty;
    public javax.swing.JSpinner spnGrillHotDogQty;
    public javax.swing.JSpinner spnGrillMilkshakeQty;
    public javax.swing.JSpinner spnGrillTurkeyLegQty;
    public javax.swing.JSpinner spnItalianBottledQty;
    public javax.swing.JSpinner spnItalianDesPizzaQty;
    public javax.swing.JSpinner spnItalianFountainQty;
    public javax.swing.JSpinner spnItalianGelatoQty;
    public javax.swing.JSpinner spnItalianLgPizzaQty;
    public javax.swing.JSpinner spnItalianPastaQty;
    public javax.swing.JSpinner spnItalianSmPizzaQty;
    public javax.swing.JSpinner spnMexicanBottledQty;
    public javax.swing.JSpinner spnMexicanBurritoQty;
    public javax.swing.JSpinner spnMexicanChipsSalsaQty;
    public javax.swing.JSpinner spnMexicanChurroQty;
    public javax.swing.JSpinner spnMexicanFountainQty;
    public javax.swing.JSpinner spnMexicanGuacamoleQty;
    public javax.swing.JSpinner spnMexicanRiceBowlQty;
    public javax.swing.JSpinner spnMexicanTacosQty;
    public javax.swing.JTextArea taFoodsSelected;
    // End of variables declaration//GEN-END:variables
}
