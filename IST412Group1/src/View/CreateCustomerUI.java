
package View;

/**
 *
 * @author brandonworley
 */
public class CreateCustomerUI extends javax.swing.JPanel {

    /**
     * Creates new form CreateCustomer
     */
    public CreateCustomerUI() {
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

        lblFistName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        lblCreateUserTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblSaveAccountError = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(300, 590));
        setName("createCustPanel"); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 590));
        setVerifyInputWhenFocusTarget(false);

        lblFistName.setText("First Name:");
        lblFistName.setName("lblFirstName"); // NOI18N

        lblLastName.setText("Last Name: ");
        lblLastName.setName("lblLastName"); // NOI18N

        lblEmail.setText("E-Mail Address:");
        lblEmail.setName("lblEmail"); // NOI18N

        tfFirstName.setName("tfFirstName"); // NOI18N

        tfLastName.setName("tfLastName"); // NOI18N

        tfEmail.setToolTipText("");
        tfEmail.setName("tfEmail"); // NOI18N

        lblCreateUserTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblCreateUserTitle.setText("Create Account");
        lblCreateUserTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblUsername.setText("Username:");
        lblUsername.setName("lblUsername"); // NOI18N

        lblPassword.setText("Password:");
        lblPassword.setName("lblPassword"); // NOI18N

        tfUsername.setName("tfUsername"); // NOI18N

        tfPassword.setName("tfPassword"); // NOI18N

        btnSave.setText("Save");
        btnSave.setName("btnSave"); // NOI18N

        btnCancel.setText("Cancel");
        btnCancel.setActionCommand("");
        btnCancel.setName("btnCancel"); // NOI18N

        lblSaveAccountError.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateUserTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFistName)
                            .addGap(35, 35, 35)
                            .addComponent(tfFirstName))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEmail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblLastName)
                                .addComponent(lblUsername)
                                .addComponent(lblPassword))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfLastName)
                                .addComponent(tfUsername)
                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnSave)
                        .addGap(87, 87, 87)
                        .addComponent(btnCancel))
                    .addComponent(lblSaveAccountError))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCreateUserTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFistName)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(lblSaveAccountError)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancel;
    public javax.swing.JButton btnSave;
    private javax.swing.JLabel lblCreateUserTitle;
    private javax.swing.JLabel lblEmail;
    public javax.swing.JLabel lblFistName;
    public javax.swing.JLabel lblLastName;
    public javax.swing.JLabel lblPassword;
    public javax.swing.JLabel lblSaveAccountError;
    public javax.swing.JLabel lblUsername;
    public javax.swing.JTextField tfEmail;
    public javax.swing.JTextField tfFirstName;
    public javax.swing.JTextField tfLastName;
    public javax.swing.JTextField tfPassword;
    public javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
