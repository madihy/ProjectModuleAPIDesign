/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ManageFoodCtrl;
import Model.Food;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joepompilii
 */
public class OrderFoodUI extends javax.swing.JFrame {
     private boolean orderUIActive = false;
     ManageFoodCtrl manageFoodCtrl = new ManageFoodCtrl();
     String selectedRestaurant = "El Taco";
     ArrayList<Food> menuToDisplay = manageFoodCtrl.getRestaurantMenuToDisplay(null);
     

    /**
     * Creates new form NewJFrame
     */
    public OrderFoodUI() {
        initComponents();
        //ArrayList<Food> menuToDisplay = manageFoodCtrl.getRestaurantMenuToDisplay("El Taco");
        //this.menuToDisplay = menuToDisplay;
       //addRowToMenuTable();
        
    }
    public void addRowToMenuTable(){
        
        DefaultTableModel model = (DefaultTableModel) this.tblMenu.getModel();
         Object rowData[] = new Object[4];
         for(int i = 0; i< menuToDisplay.size(); i++){
             rowData[0] = menuToDisplay.get(i).getFoodName();
             rowData[1] = menuToDisplay.get(i).getFoodPrice();
             rowData[2] = menuToDisplay.get(i).getFoodQuantity();
             rowData[3] = menuToDisplay.get(i).getFoodSubtotal();
             model.addRow(rowData);
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

        jPanel1 = new javax.swing.JPanel();
        cbRestaurantList = new javax.swing.JComboBox<>();
        lblSelectRestaurant = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbRestaurantList.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbRestaurantList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "El Taco", "Grub Grill", "Sandwich Shop", "Sofia's Pizza" }));
        cbRestaurantList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRestaurantListActionPerformed(evt);
            }
        });

        lblSelectRestaurant.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSelectRestaurant.setText("Select a Restaurant");

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Food Name", "Cost", "Quantity", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenu.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tblMenu);
        tblMenu.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSelectRestaurant)
                        .addGap(18, 18, 18)
                        .addComponent(cbRestaurantList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRestaurantList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectRestaurant))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRestaurantListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRestaurantListActionPerformed
        String selectedRestaurant = this.cbRestaurantList.getSelectedItem().toString();
        this.selectedRestaurant = selectedRestaurant;
        System.out.println(selectedRestaurant);
         ArrayList<Food> menuToDisplay;
         menuToDisplay = manageFoodCtrl.getRestaurantMenuToDisplay(selectedRestaurant);
         this.menuToDisplay = menuToDisplay;
         
         //addRowToMenuTable();
        
        
    }//GEN-LAST:event_cbRestaurantListActionPerformed

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
    
public boolean isOrderFoodUIActive() {
        if(orderUIActive = true){
            System.out.println("OrderUI is active!");
        }
        else{
            System.out.println("OrderUI is no longer active!");
        }
        return orderUIActive;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cbRestaurantList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSelectRestaurant;
    public javax.swing.JTable tblMenu;
    // End of variables declaration//GEN-END:variables
}
