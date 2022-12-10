/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.LoginCtrl;
import Controller.NavigationCtrl;
import javax.swing.JOptionPane;

/**
 *
 * @author Kate
 */
public class LoginUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginUI_2
     */
    public LoginUI() {
        initComponents();
        this.lblSubmitLoginError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        loginSubmitButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JTextField();
        newAccountButton = new javax.swing.JButton();
        LoginPanelTitleLabel = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        lblSubmitLoginError = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setMinimumSize(new java.awt.Dimension(300, 590));

        loginSubmitButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        loginSubmitButton.setForeground(new java.awt.Color(51, 51, 51));
        loginSubmitButton.setText("Submit");
        loginSubmitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginSubmitButton.setInheritsPopupMenu(true);
        loginSubmitButton.setOpaque(false);
        loginSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSubmitButtonActionPerformed(evt);
            }
        });

        passwordTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        passwordTextField.setToolTipText("Username");

        newAccountButton.setBackground(new java.awt.Color(255, 255, 255));
        newAccountButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        newAccountButton.setForeground(new java.awt.Color(0, 51, 255));
        newAccountButton.setText("New Account");
        newAccountButton.setBorder(null);
        newAccountButton.setOpaque(false);
        newAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccountButtonActionPerformed(evt);
            }
        });

        LoginPanelTitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LoginPanelTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginPanelTitleLabel.setText("Login");
        LoginPanelTitleLabel.setToolTipText("");

        lblUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUsername.setText("Username");

        lblUsername1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUsername1.setText("Password");

        lblSubmitLoginError.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSubmitLoginError.setForeground(new java.awt.Color(255, 0, 51));
        lblSubmitLoginError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubmitLoginError.setText("Error Message");

        usernameTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usernameTextField.setToolTipText("Username");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginPanelTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblUsername))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblUsername1))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newAccountButton)
                                    .addComponent(loginSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSubmitLoginError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(LoginPanelTitleLabel)
                .addGap(18, 18, 18)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblUsername1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblSubmitLoginError)
                .addGap(18, 18, 18)
                .addComponent(loginSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newAccountButton)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSubmitButtonActionPerformed
        
        LoginCtrl loginCtrl = new LoginCtrl();
        Boolean auth = false;
        auth = loginCtrl.authenticateUser(this.usernameTextField.getText(), this.passwordTextField.getText());
        System.out.println(auth);
        
        
        if (auth == true){
            NavigationCtrl navCtrl = new NavigationCtrl();
            
            this.setVisible(false);
        }
        else{
            this.lblSubmitLoginError.setText("Incorrect username/password");
            this.lblSubmitLoginError.setVisible(true);
            this.usernameTextField.setText(null);
            this.passwordTextField.setText(null);            
        }
        
    }//GEN-LAST:event_loginSubmitButtonActionPerformed

    private void newAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccountButtonActionPerformed
        CreateCustomerUI createCustUI = new CreateCustomerUI();
        createCustUI.setLocationRelativeTo(null);
        createCustUI.setVisible(true);
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_newAccountButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginPanelTitleLabel;
    public javax.swing.JLabel lblSubmitLoginError;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    public javax.swing.JPanel loginPanel;
    public javax.swing.JButton loginSubmitButton;
    public javax.swing.JButton newAccountButton;
    public javax.swing.JTextField passwordTextField;
    public javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
