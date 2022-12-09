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
        this.btnAccountInformation.setVisible(false);
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
        btnAccountInformation = new javax.swing.JButton();
        btnParkInformation = new javax.swing.JButton();
        btnManageActivities = new javax.swing.JButton();
        btnManageFoodOrders = new javax.swing.JButton();
        btnPurchaseTickets = new javax.swing.JButton();
        navigationPanelTitleLabel = new javax.swing.JLabel();
        btnExitApplication = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WallyLand--Main Menu");

        pnlMainMenu.setMinimumSize(new java.awt.Dimension(300, 590));
        pnlMainMenu.setName(""); // NOI18N

        btnAccountInformation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAccountInformation.setText("Account Information");
        btnAccountInformation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAccountInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountInformationActionPerformed(evt);
            }
        });

        btnParkInformation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnParkInformation.setText("Park Information");
        btnParkInformation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnParkInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParkInformationActionPerformed(evt);
            }
        });

        btnManageActivities.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnManageActivities.setText("Manage Activities");
        btnManageActivities.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnManageFoodOrders.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnManageFoodOrders.setText("Order Food");
        btnManageFoodOrders.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageFoodOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFoodOrdersActionPerformed(evt);
            }
        });

        btnPurchaseTickets.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnPurchaseTickets.setText("Purchase Tickets");
        btnPurchaseTickets.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        btnExitApplication.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addGroup(pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(navigationPanelTitleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMainMenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(btnAccountInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnParkInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnManageActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnManageFoodOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPurchaseTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMainMenuLayout.createSequentialGroup()
                                .addComponent(btnExitApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMainMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAccountInformation, btnManageActivities, btnManageFoodOrders, btnParkInformation, btnPurchaseTickets});

        pnlMainMenuLayout.setVerticalGroup(
            pnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(navigationPanelTitleLabel)
                .addGap(18, 18, 18)
                .addComponent(btnAccountInformation)
                .addGap(13, 13, 13)
                .addComponent(btnParkInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPurchaseTickets)
                .addGap(11, 11, 11)
                .addComponent(btnManageActivities)
                .addGap(11, 11, 11)
                .addComponent(btnManageFoodOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnExitApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        pnlMainMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAccountInformation, btnManageActivities, btnParkInformation, btnPurchaseTickets});

        pnlMainMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnExitApplication, btnManageFoodOrders});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountInformationActionPerformed
        CreateCustomerUI createCustUI = new CreateCustomerUI();
        this.dispose();
    }//GEN-LAST:event_btnAccountInformationActionPerformed

    private void btnParkInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParkInformationActionPerformed
        ParkInformationCtrl parkInfoCtrl = new ParkInformationCtrl();
        this.dispose();
    }//GEN-LAST:event_btnParkInformationActionPerformed

    private void btnPurchaseTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseTicketsActionPerformed
        PurchaseTicketsUI purchaseTicketsUI = new PurchaseTicketsUI();
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
       orderFoodUI.setVisible(true);
       
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
    public javax.swing.JButton btnAccountInformation;
    public javax.swing.JButton btnExitApplication;
    public javax.swing.JButton btnManageActivities;
    public javax.swing.JButton btnManageFoodOrders;
    public javax.swing.JButton btnParkInformation;
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
     * @param navigationUI sets the boolean status for the navigation interface screen status.
     * @param navigationUIActive the navigationUIActive to set
     */
    public void setNavigationUIActive(boolean navigationUIActive) {
        this.navigationUIActive = navigationUIActive;
    }
}

