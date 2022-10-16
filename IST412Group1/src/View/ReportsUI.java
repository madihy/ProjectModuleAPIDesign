package View;

/**
 * Creates new form ReportsUI
 * @author hythammadi
 */

public class ReportsUI {
    // Variables declaration
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReports;
    private boolean panelRunning = true;

    // End of variables declaration

    /**
     * Creates new form ReportsUI
     */
    public ReportsUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the report.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReports = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();

        btnCreate.setText("Create");

        btnModify.setText("Modify");

        btnSubmit.setText("Submit");

        btnDelete.setText("Delete");

        btnReturn.setText("Return");

        btnApprove.setText("Approve");

    }
    public boolean isPanelRunning(){
        return panelRunning;
    }
}