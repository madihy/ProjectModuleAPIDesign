/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ManageTicketsCtrl;
import Controller.NavigationCtrl;
import Model.Ticket;
import Model.TicketOrder;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Kate
 */
public class PurchaseTicketsUI extends javax.swing.JFrame {
    ManageTicketsCtrl manTicketsCtrl;
    /**
     * Creates new form PurchaseTickets
     */
    public PurchaseTicketsUI() {
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

        pnlTicketOrderConfirmation = new javax.swing.JPanel();
        purchaseTicketsTitleLabel1 = new javax.swing.JLabel();
        lblConfirmNumberOfTickets = new javax.swing.JLabel();
        lblConfirmNumberOfDays = new javax.swing.JLabel();
        lblConfirmSubtotal = new javax.swing.JLabel();
        lblConfirmTax = new javax.swing.JLabel();
        lblConfirmTotalCost = new javax.swing.JLabel();
        lblConfirmSubtotalValue = new javax.swing.JLabel();
        lblConfirmTotalCostValue = new javax.swing.JLabel();
        lblConfirmTaxValue = new javax.swing.JLabel();
        btnMainMenu = new javax.swing.JButton();
        lblOrderNumber = new javax.swing.JLabel();
        lblConfirmNumberOfDaysValue = new javax.swing.JLabel();
        lblConfirmNumberOfTicketsValue = new javax.swing.JLabel();
        lblConfirmOrderNumberValue = new javax.swing.JLabel();
        lblListTicketsPurchased = new javax.swing.JLabel();
        btnReserveActivities = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taPurchasedTickets = new javax.swing.JTextArea();
        pnlPurchaseTickets = new javax.swing.JPanel();
        lblPurchaseTicketsTitle = new javax.swing.JLabel();
        lblPurchaseTicketsInfo = new javax.swing.JLabel();
        tfNumberOfTickets = new javax.swing.JTextField();
        lblNumberOfTickets = new javax.swing.JLabel();
        lblNumberOfDays = new javax.swing.JLabel();
        tfNumberOfDays = new javax.swing.JTextField();
        lblPurchaseSubtotal = new javax.swing.JLabel();
        lblPurchaseTax = new javax.swing.JLabel();
        lblPurchaseTotalCost = new javax.swing.JLabel();
        lblPurchaseSubtotalValue = new javax.swing.JLabel();
        lblPurchaseTotalCostValue = new javax.swing.JLabel();
        lblPurchaseTaxValue = new javax.swing.JLabel();
        btnUpdateTicketPurchase = new javax.swing.JButton();
        btnCancelPurchase = new javax.swing.JButton();
        btnPurchaseTickets = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WallyLand--PurchaseTickets");
        getContentPane().setLayout(new java.awt.CardLayout());

        pnlTicketOrderConfirmation.setPreferredSize(new java.awt.Dimension(355, 319));

        purchaseTicketsTitleLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        purchaseTicketsTitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purchaseTicketsTitleLabel1.setText("Ticket Order Confirmation");

        lblConfirmNumberOfTickets.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmNumberOfTickets.setText("Number of Tickets:");

        lblConfirmNumberOfDays.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmNumberOfDays.setText("Number of Days:");

        lblConfirmSubtotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmSubtotal.setText("Subtotal:");

        lblConfirmTax.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmTax.setText("Tax Amount:");

        lblConfirmTotalCost.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmTotalCost.setText("Total Cost:");

        lblConfirmSubtotalValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmSubtotalValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmSubtotalValue.setText("$0");

        lblConfirmTotalCostValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmTotalCostValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmTotalCostValue.setText("$0");

        lblConfirmTaxValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmTaxValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmTaxValue.setText("$0");

        btnMainMenu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnMainMenu.setText("Main Menu");
        btnMainMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        lblOrderNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblOrderNumber.setText("Order Number:");

        lblConfirmNumberOfDaysValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmNumberOfDaysValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmNumberOfDaysValue.setText("0");

        lblConfirmNumberOfTicketsValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmNumberOfTicketsValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmNumberOfTicketsValue.setText("0");

        lblConfirmOrderNumberValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblConfirmOrderNumberValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmOrderNumberValue.setText("0");

        lblListTicketsPurchased.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblListTicketsPurchased.setText("List of Tickets Purchased:");

        btnReserveActivities.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReserveActivities.setText("Reserve Activities");
        btnReserveActivities.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReserveActivities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActivitiesActionPerformed(evt);
            }
        });

        taPurchasedTickets.setColumns(20);
        taPurchasedTickets.setRows(5);
        jScrollPane2.setViewportView(taPurchasedTickets);

        javax.swing.GroupLayout pnlTicketOrderConfirmationLayout = new javax.swing.GroupLayout(pnlTicketOrderConfirmation);
        pnlTicketOrderConfirmation.setLayout(pnlTicketOrderConfirmationLayout);
        pnlTicketOrderConfirmationLayout.setHorizontalGroup(
            pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTicketOrderConfirmationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketOrderConfirmationLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(pnlTicketOrderConfirmationLayout.createSequentialGroup()
                        .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfirmTax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConfirmSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConfirmNumberOfDays, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConfirmNumberOfTickets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOrderNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConfirmTotalCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblConfirmSubtotalValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConfirmTaxValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConfirmTotalCostValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConfirmNumberOfDaysValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTicketOrderConfirmationLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblConfirmOrderNumberValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblConfirmNumberOfTicketsValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTicketOrderConfirmationLayout.createSequentialGroup()
                        .addComponent(purchaseTicketsTitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlTicketOrderConfirmationLayout.createSequentialGroup()
                        .addComponent(lblListTicketsPurchased, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(221, Short.MAX_VALUE))
                    .addGroup(pnlTicketOrderConfirmationLayout.createSequentialGroup()
                        .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReserveActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlTicketOrderConfirmationLayout.setVerticalGroup(
            pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTicketOrderConfirmationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseTicketsTitleLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmOrderNumberValue)
                    .addComponent(lblOrderNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmNumberOfTicketsValue)
                    .addComponent(lblConfirmNumberOfTickets))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmNumberOfDaysValue)
                    .addComponent(lblConfirmNumberOfDays))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmSubtotalValue)
                    .addComponent(lblConfirmSubtotal))
                .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTicketOrderConfirmationLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblConfirmTotalCostValue))
                    .addGroup(pnlTicketOrderConfirmationLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConfirmTax)
                            .addComponent(lblConfirmTaxValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblConfirmTotalCost)))
                .addGap(30, 30, 30)
                .addComponent(lblListTicketsPurchased)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlTicketOrderConfirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMainMenu)
                    .addComponent(btnReserveActivities))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTicketOrderConfirmation, "TicketCard2");

        lblPurchaseTicketsTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPurchaseTicketsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPurchaseTicketsTitle.setText("Purchase Tickets");

        lblPurchaseTicketsInfo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPurchaseTicketsInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPurchaseTicketsInfo.setText("Tickets are $50 per person, per day.  ");
        lblPurchaseTicketsInfo.setToolTipText("");

        tfNumberOfTickets.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tfNumberOfTickets.setText("0");
        tfNumberOfTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumberOfTicketsActionPerformed(evt);
            }
        });

        lblNumberOfTickets.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNumberOfTickets.setText("Number of Tickets:");

        lblNumberOfDays.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNumberOfDays.setText("Number of Days:");

        tfNumberOfDays.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tfNumberOfDays.setText("0");
        tfNumberOfDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumberOfDaysActionPerformed(evt);
            }
        });

        lblPurchaseSubtotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPurchaseSubtotal.setText("Subtotal:");

        lblPurchaseTax.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPurchaseTax.setText("Tax Amount:");

        lblPurchaseTotalCost.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPurchaseTotalCost.setText("Total Cost:");

        lblPurchaseSubtotalValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPurchaseSubtotalValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPurchaseSubtotalValue.setText("$0");

        lblPurchaseTotalCostValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPurchaseTotalCostValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPurchaseTotalCostValue.setText("$0");

        lblPurchaseTaxValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPurchaseTaxValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPurchaseTaxValue.setText("$0");

        btnUpdateTicketPurchase.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnUpdateTicketPurchase.setText("Update");
        btnUpdateTicketPurchase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateTicketPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTicketPurchaseActionPerformed(evt);
            }
        });

        btnCancelPurchase.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCancelPurchase.setText("Cancel");
        btnCancelPurchase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPurchaseActionPerformed(evt);
            }
        });

        btnPurchaseTickets.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnPurchaseTickets.setText("Purchase Tickets");
        btnPurchaseTickets.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPurchaseTickets.setEnabled(false);
        btnPurchaseTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseTicketsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPurchaseTicketsLayout = new javax.swing.GroupLayout(pnlPurchaseTickets);
        pnlPurchaseTickets.setLayout(pnlPurchaseTicketsLayout);
        pnlPurchaseTicketsLayout.setHorizontalGroup(
            pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPurchaseTicketsLayout.createSequentialGroup()
                .addComponent(lblPurchaseTicketsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPurchaseTicketsLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPurchaseTicketsInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addGroup(pnlPurchaseTicketsLayout.createSequentialGroup()
                        .addComponent(btnCancelPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPurchaseTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdateTicketPurchase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPurchaseTicketsLayout.createSequentialGroup()
                        .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumberOfDays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumberOfTickets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNumberOfTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(tfNumberOfDays)))
                    .addGroup(pnlPurchaseTicketsLayout.createSequentialGroup()
                        .addComponent(lblPurchaseTax, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPurchaseSubtotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPurchaseTaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPurchaseTotalCostValue, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPurchaseTicketsLayout.createSequentialGroup()
                        .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPurchaseTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPurchaseSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(61, 61, 61))
        );
        pnlPurchaseTicketsLayout.setVerticalGroup(
            pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPurchaseTicketsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblPurchaseTicketsTitle)
                .addGap(11, 11, 11)
                .addComponent(lblPurchaseTicketsInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumberOfTickets)
                    .addComponent(tfNumberOfTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumberOfDays)
                    .addComponent(tfNumberOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateTicketPurchase)
                .addGap(42, 42, 42)
                .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchaseSubtotal)
                    .addComponent(lblPurchaseSubtotalValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchaseTax)
                    .addComponent(lblPurchaseTaxValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchaseTotalCost)
                    .addComponent(lblPurchaseTotalCostValue))
                .addGap(44, 44, 44)
                .addGroup(pnlPurchaseTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPurchaseTickets)
                    .addComponent(btnCancelPurchase))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        getContentPane().add(pnlPurchaseTickets, "TicketsCard1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNumberOfTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumberOfTicketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumberOfTicketsActionPerformed

    private void tfNumberOfDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumberOfDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumberOfDaysActionPerformed

    private void btnUpdateTicketPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTicketPurchaseActionPerformed
        ManageTicketsCtrl manTicketsCtrl = new ManageTicketsCtrl();

        int nofTickets = Integer.parseInt(tfNumberOfTickets.getText());
        int nofDays = Integer.parseInt(tfNumberOfDays.getText());
        manTicketsCtrl.updateTicketSelectionButtonEvent(nofTickets, nofDays);
        TicketOrder ticketOrder = manTicketsCtrl.getTicketOrderInformation();

        if (nofTickets <= 0 || nofDays <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid Entry.");
            btnPurchaseTickets.setEnabled(false);
        } else {
            double subtotal = ticketOrder.getOrderSubtotal();
            double tax = ticketOrder.getOrderTax();
            double total = ticketOrder.getOrderTotal();
            System.out.println(nofTickets + " " + nofDays + " " + subtotal);
            lblPurchaseSubtotalValue.setText("$" + String.format("%.2f", subtotal));
            lblPurchaseTaxValue.setText("$" + String.format("%.2f", tax));
            lblPurchaseTotalCostValue.setText("$" + String.format("%.2f", total));
            this.manTicketsCtrl = manTicketsCtrl;
            btnPurchaseTickets.setEnabled(true);
        }

        
    }//GEN-LAST:event_btnUpdateTicketPurchaseActionPerformed

    private void btnCancelPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPurchaseActionPerformed
        NavigationCtrl navigationCtrl = new NavigationCtrl();
        this.dispose();
    }//GEN-LAST:event_btnCancelPurchaseActionPerformed

    private void btnPurchaseTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseTicketsActionPerformed
        this.pnlTicketOrderConfirmation.setVisible(true);
        this.pnlPurchaseTickets.setVisible(false);
        StringBuilder sb=new StringBuilder();

        TicketOrder ticketOrder = manTicketsCtrl.getTicketOrderInformation();
        
        lblConfirmSubtotalValue.setText("$" + String.format("%.2f", ticketOrder.getOrderSubtotal()));
        lblConfirmTaxValue.setText("$" + String.format("%.2f", ticketOrder.getOrderTax()));
        lblConfirmTotalCostValue.setText("$" + String.format("%.2f", ticketOrder.getOrderTotal()));
        lblConfirmNumberOfTicketsValue.setText(String.valueOf(ticketOrder.getQuantityTickets()));
        lblConfirmNumberOfDaysValue.setText(String.valueOf(ticketOrder.getQuantityDays()));
        lblConfirmOrderNumberValue.setText(String.valueOf(ticketOrder.getOrderNumber()));

        ArrayList<Ticket> purchasedTickets = new ArrayList();
        purchasedTickets = ticketOrder.createTicketsArray(ticketOrder.getQuantityTickets(), ticketOrder.getQuantityDays());
        
        for (int i = 0; i < purchasedTickets.size(); i++){
            taPurchasedTickets.append(purchasedTickets.get(i).toString());
            taPurchasedTickets.append("\n");

        }

        
        try
        {
            FileOutputStream fos = new FileOutputStream("ticketData");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
         //   oos.writeObject(list.toArray());
            oos.close();
            fos.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
//GEN-LAST:event_btnPurchaseTicketsActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        NavigationCtrl navigationCtrl = new NavigationCtrl();
        this.dispose();
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnReserveActivitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActivitiesActionPerformed
 }//GEN-LAST:event_btnReserveActivitiesActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseTicketsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseTicketsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseTicketsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseTicketsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PurchaseTicketsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelPurchase;
    public javax.swing.JButton btnMainMenu;
    public javax.swing.JButton btnPurchaseTickets;
    public javax.swing.JButton btnReserveActivities;
    public javax.swing.JButton btnUpdateTicketPurchase;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblConfirmNumberOfDays;
    public javax.swing.JLabel lblConfirmNumberOfDaysValue;
    private javax.swing.JLabel lblConfirmNumberOfTickets;
    public javax.swing.JLabel lblConfirmNumberOfTicketsValue;
    public javax.swing.JLabel lblConfirmOrderNumberValue;
    private javax.swing.JLabel lblConfirmSubtotal;
    public javax.swing.JLabel lblConfirmSubtotalValue;
    private javax.swing.JLabel lblConfirmTax;
    public javax.swing.JLabel lblConfirmTaxValue;
    private javax.swing.JLabel lblConfirmTotalCost;
    public javax.swing.JLabel lblConfirmTotalCostValue;
    private javax.swing.JLabel lblListTicketsPurchased;
    private javax.swing.JLabel lblNumberOfDays;
    private javax.swing.JLabel lblNumberOfTickets;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblPurchaseSubtotal;
    public javax.swing.JLabel lblPurchaseSubtotalValue;
    private javax.swing.JLabel lblPurchaseTax;
    public javax.swing.JLabel lblPurchaseTaxValue;
    private javax.swing.JLabel lblPurchaseTicketsInfo;
    private javax.swing.JLabel lblPurchaseTicketsTitle;
    private javax.swing.JLabel lblPurchaseTotalCost;
    public javax.swing.JLabel lblPurchaseTotalCostValue;
    public javax.swing.JPanel pnlPurchaseTickets;
    public javax.swing.JPanel pnlTicketOrderConfirmation;
    private javax.swing.JLabel purchaseTicketsTitleLabel1;
    public javax.swing.JTextArea taPurchasedTickets;
    public javax.swing.JTextField tfNumberOfDays;
    public javax.swing.JTextField tfNumberOfTickets;
    // End of variables declaration//GEN-END:variables
}
