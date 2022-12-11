/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.ManageTicketsCtrl;
import Controller.ParkInformationCtrl;

/**
 *
 * @author Kate
 */
public class NavigationUI extends javax.swing.JFrame {
    private boolean navigationUIActive = false;
    /**
     * Creates new form MainMenuUI
     */
    public NavigationUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainMenu = new javax.swing.JPanel();
        btnManageActivities = new javax.swing.JButton();
        btnManageFoodOrders = new javax.swing.JButton();
        btnPurchaseTickets = new javax.swing.JButton();
        navigationPanelTitleLabel = new javax.swing.JLabel();
        btnExitApplication = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WallyLand--Main Menu");
        setBounds(new java.awt.Rectangle(50, 50, 350, 650));

        pnlMainMenu.setMinimumSize(new java.awt.Dimension(300, 590));
        pnlMainMenu.setName(""); // NOI18N

        btnManageActivities.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnManageActivities.setText("Manage Activities");

        btnManageFoodOrders.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnManageFoodOrders.setText("Order Food");
        btnManageFoodOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFoodOrdersActionPerformed(evt);
            }
        });

        btnPurchaseTickets.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnPurchaseTickets.setText("Purchase Tickets");
        btnPurchaseTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseTicketsActionPerformed(evt);
            }
        });

        navigationPanelTitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        navigationPanelTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navigationPanelTitleLabel.setText("WallyLand Main Menu");

        btnExitApplication.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnExitApplication.setText("Exit Application");
        btnExitApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitApplicationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainMenuLayout = new javax.swing.GroupLayout(pnlMainMenu);
        pnlMainMenu.setLayout(pnlMainMenuLayout);
        pnlMainMenuLayout.setHorizontalGroup(
            pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainMenuLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnManageActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageFoodOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPurchaseTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExitApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(navigationPanelTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlMainMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageActivities, btnManageFoodOrders, btnPurchaseTickets});

        pnlMainMenuLayout.setVerticalGroup(
            pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(navigationPanelTitleLabel)
                .addGap(18, 18, 18)
                .addComponent(btnPurchaseTickets)
                .addGap(18, 18, 18)
                .addComponent(btnManageActivities)
                .addGap(18, 18, 18)
                .addComponent(btnManageFoodOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExitApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMainMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageActivities, btnPurchaseTickets});

        pnlMainMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnExitApplication, btnManageFoodOrders});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurchaseTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseTicketsActionPerformed
        PurchaseTicketsUI purchaseTicketsUI = new PurchaseTicketsUI();
        purchaseTicketsUI.setSize(400, 650);
        purchaseTicketsUI.setLocationRelativeTo(null);
        purchaseTicketsUI.setVisible(true);
        purchaseTicketsUI.pnlPurchaseTickets.setVisible(true);
        purchaseTicketsUI.pnlTicketOrderConfirmation.setVisible(false);        
        this.dispose();
        
    }//GEN-LAST:event_btnPurchaseTicketsActionPerformed

    private void btnExitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitApplicationActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitApplicationActionPerformed

    private void btnManageFoodOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFoodOrdersActionPerformed
       OrderFoodUI orderFoodUI = new OrderFoodUI();
       orderFoodUI.setSize(400, 650);
       orderFoodUI.setLocationRelativeTo(null);
       orderFoodUI.setVisible(true);
       orderFoodUI.pnlSelectRestaurant.setVisible(true);
       orderFoodUI.pnlElTaco.setVisible(false);
       orderFoodUI.pnlGrubGrill.setVisible(false);
       orderFoodUI.pnlSandwichShop.setVisible(false);
       orderFoodUI.pnlSofiasPizza.setVisible(false);
       orderFoodUI.pnlFoodOrderConfirmation.setVisible(false);
       
       this.dispose();
       
    }//GEN-LAST:event_btnManageFoodOrdersActionPerformed

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
            java.util.logging.Logger.getLogger(NavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NavigationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NavigationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExitApplication;
    public javax.swing.JButton btnManageActivities;
    public javax.swing.JButton btnManageFoodOrders;
    public javax.swing.JButton btnPurchaseTickets;
    private javax.swing.JLabel navigationPanelTitleLabel;
    public javax.swing.JPanel pnlMainMenu;
    // End of variables declaration//GEN-END:variables


/**
     * Gets the Boolean value representing this navigation interface screen status.
     * @return the Boolean navigationUI representing the navigation interface screen status.
     */
    public boolean isNavigationUIActive() {
        if(navigationUIActive = true){
            System.out.println("Navigation UI is active!");
        }
        else{
            System.out.println("NavigationUI is no longer active!");
        }
        return navigationUIActive;
    }

    /**
     * Sets the boolean status for this navigation interface screen status.
     * @param navigationUIActive the navigationUIActive to set
     */
    public void setNavigationUIActive(boolean navigationUIActive) {
        this.navigationUIActive = navigationUIActive;
    }
}

