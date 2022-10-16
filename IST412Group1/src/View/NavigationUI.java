/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

/**
 * This class is used to display the user interface for the main navigation menu.
 * @author Kate
 */
public class NavigationUI extends javax.swing.JPanel {
    private boolean panelRunning = true;

    /**
     * Creates new form NavigationUI
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

        accountInformationButton = new javax.swing.JButton();
        parkInformationButton = new javax.swing.JButton();
        purchaseTicketsButton = new javax.swing.JButton();
        manageReservationsButton = new javax.swing.JButton();
        manageFoodOrdersButton = new javax.swing.JButton();
        manageReports = new javax.swing.JButton();
        navigationPanelTitleLabel = new javax.swing.JLabel();
        exitApplicationButton = new javax.swing.JButton();
        viewItineraryButton = new javax.swing.JButton();
        purchaseTicketsButton1 = new javax.swing.JButton();

        accountInformationButton.setText("Account Information");
        accountInformationButton.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                accountInformationButtonComponentAdded(evt);
            }
        });

        parkInformationButton.setText("Park Information");

        purchaseTicketsButton.setText("Purchase Tickets");

        manageReservationsButton.setText("Manage Reservations");

        manageFoodOrdersButton.setText("Manage Food Orders");

        manageReports.setText("Manage Reports");

        navigationPanelTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        navigationPanelTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navigationPanelTitleLabel.setText("Main Navigation Menu");

        exitApplicationButton.setText("Exit Application");

        viewItineraryButton.setText("View Itinerary");

        purchaseTicketsButton1.setText("Manage Tickets");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navigationPanelTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitApplicationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(accountInformationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parkInformationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purchaseTicketsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageReservationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageFoodOrdersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewItineraryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purchaseTicketsButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navigationPanelTitleLabel)
                .addGap(14, 14, 14)
                .addComponent(accountInformationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parkInformationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseTicketsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseTicketsButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageReservationsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageFoodOrdersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewItineraryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitApplicationButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void accountInformationButtonComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_accountInformationButtonComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_accountInformationButtonComponentAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountInformationButton;
    private javax.swing.JButton exitApplicationButton;
    private javax.swing.JButton manageFoodOrdersButton;
    private javax.swing.JButton manageReports;
    private javax.swing.JButton manageReservationsButton;
    private javax.swing.JLabel navigationPanelTitleLabel;
    private javax.swing.JButton parkInformationButton;
    private javax.swing.JButton purchaseTicketsButton;
    private javax.swing.JButton purchaseTicketsButton1;
    private javax.swing.JButton viewItineraryButton;
    // End of variables declaration//GEN-END:variables
}
