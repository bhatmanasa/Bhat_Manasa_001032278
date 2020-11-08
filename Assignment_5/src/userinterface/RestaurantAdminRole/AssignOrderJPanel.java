/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

/**
 *
 * @author manasa
 */

import Business.EcoSystem;
import Business.Restaurant.Order;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class AssignOrderJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    /**
     * Creates new form AssignOrderJPanel
     */
    public AssignOrderJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = account;
        populateRequestTable();
        populateDeliveryMen();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable1.getModel();
        model.setRowCount(0);
        List<WorkRequest> requestList = userAccount.getWorkQueue().getWorkRequestList();
        for(WorkRequest req: requestList){
       

           Object row[] = new Object[8];
                 row[0] = req;
                 row[1] = req.getRequestDate();
            
            if(req.getReceiver() == null){
                 row[2] = "";
            }else{
                 row[2] = req.getReceiver();
            }
            
            if(req.getMessage() == null){
                 row[3] = "";
            }else{
                 row[3] = req.getMessage();
            }
            
                 row[4] = req.getStatus();
            
            if(req.getResult() == null){
                 row[5] = "";
            }else{
                 row[5] = req.getResult();
            }
            
            model.addRow(row);                    
        }
           
     }
        public void populateDeliveryMen(){
        delivComboBox.removeAllItems();
        delivComboBox.addItem("");
        for(UserAccount ua : business.getUserAccountDirectory().getUserAccountList()){
            if(String.valueOf(ua.getRole()).equals("Business.Role.DeliverManRole")){
            delivComboBox.addItem(ua.getUsername());
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestDelivJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        messageText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCancelOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCheckQueue = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        btnAssignRequest = new javax.swing.JButton();
        delivComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));

        workRequestDelivJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order", "RequestDate", "Receiver", "Message", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestDelivJTable);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Manage Order");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        messageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Message:");

        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Check DeliveryMen WorkQueue to Assign Request");

        btnCheckQueue.setText("CheckQueue");
        btnCheckQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckQueueActionPerformed(evt);
            }
        });

        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order", "RequestDate", "Receiver", "Message", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable1);

        btnAssignRequest.setText("AssignWorkRequest");
        btnAssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRequestActionPerformed(evt);
            }
        });

        delivComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delivComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("DeliveryMen ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnViewOrder)
                        .addGap(209, 209, 209)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCancelOrder)
                                .addGap(38, 38, 38))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delivComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAssignRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCheckQueue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewOrder)
                    .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelOrder)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCheckQueue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAssignRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(delivComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents
   private void populateDelivRequests(List<WorkRequest> reqList){
       DefaultTableModel model = (DefaultTableModel)workRequestDelivJTable.getModel();
                   model.setRowCount(0);
                     for(WorkRequest req : reqList){
                 Object row[] = new Object[8];
                 row[0] = req;
                 row[1] = req.getRequestDate();
            
            if(req.getReceiver() == null){
                 row[2] = "";
            }else{
                 row[2] = req.getReceiver();
            }
            
            if(req.getMessage() == null){
                 row[3] = "";
            }else{
                 row[3] = req.getMessage();
            }
            
                 row[4] = req.getStatus();
            
            if(req.getResult() == null){
                 row[5] = "";
            }else{
                 row[5] = req.getResult();
            }
                        model.addRow(row); 
                     }
   }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        int row = workRequestJTable1.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row from request!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        WorkRequest w= (WorkRequest)workRequestJTable1.getValueAt(row, 0);
        for(Order order : business.getMoc().getMoc()){
            if(order.getOrderNum() == w.getOrderNum()){
        
        ViewOrderJPanel viewpanel = new ViewOrderJPanel(userProcessContainer,order);
        userProcessContainer.add("ViewOrderJPanel",viewpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
            }
        }
            
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void delivComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delivComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_delivComboBoxActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        // TODO add your handling code here:
        int row = workRequestJTable1.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row from request!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }   
        if(messageText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please update message for cancellation!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;            
        }
                int confirmed = JOptionPane.showConfirmDialog(null, "Are you Sure you want to remove the food from order?","Confirm Remove",JOptionPane.YES_NO_OPTION);
            if(confirmed == JOptionPane.YES_OPTION){
        WorkRequest w = (WorkRequest)workRequestJTable1.getValueAt(row, 0);
        w.setStatus("Cancelled");
        w.setResult("AdminCancel");
        w.setResolveDate(new Date());
        w.setReceiver(userAccount);

        userAccount.getWorkQueue().removeWorkRequest(w);
        
         business.getWorkQueue().updateWorkRequest(w,business.getWorkQueue().getWorkRequestList());  //for sysadmin manager to get the work request

                int orderNum = w.getOrderNum();
        for(Order order : business.getMoc().getMoc()){
            if(order.getOrderNum() == orderNum){
                order.setStatus("Cancelled");
            }
        }
        messageText.setText("");
                populateRequestTable();
             JOptionPane.showMessageDialog(null, "Order has been cancelled!!", "Warning", JOptionPane.WARNING_MESSAGE);       
            }
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void messageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextActionPerformed

    private void btnCheckQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckQueueActionPerformed
        // TODO add your handling code here:
                if(delivComboBox.getSelectedItem().equals("")){
                  JOptionPane.showMessageDialog(null, "Please select a delivery man!", "Warning", JOptionPane.WARNING_MESSAGE);       
                  return;
        }
                WorkQueue workQ = null;
                 for(UserAccount ua: business.getUserAccountDirectory().getUserAccountList()){
                     if(ua.getUsername().equals(String.valueOf(delivComboBox.getSelectedItem()))){
                         workQ = ua.getWorkQueue();
                     }
                 }
                 if(workQ != null){
                     populateDelivRequests(workQ.getWorkRequestList());
                  
                 }
    }//GEN-LAST:event_btnCheckQueueActionPerformed

    private void btnAssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRequestActionPerformed
        // TODO add your handling code here:
        if(delivComboBox.getSelectedItem().equals("")){
                  JOptionPane.showMessageDialog(null, "Please select a delivery man!", "Warning", JOptionPane.WARNING_MESSAGE);       
                  return;
        }
        
        int row = workRequestJTable1.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a request!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }   
         WorkRequest w= (WorkRequest)workRequestJTable1.getValueAt(row, 0);
         w.setStatus("ReadyForDelivery");
         WorkQueue workQ = null;
        for(UserAccount ua: business.getUserAccountDirectory().getUserAccountList()){
                     if(ua.getUsername().equals(String.valueOf(delivComboBox.getSelectedItem()))){
                          ua.getWorkQueue().addWorkRequest(w);   //adds to the deliveryman selected.
                          workQ = ua.getWorkQueue();
                     }
                 }
            business.getWorkQueue().updateWorkRequest(w,business.getWorkQueue().getWorkRequestList());  //for sysadmin manager to get the work request
            userAccount.getWorkQueue().removeWorkRequest(w);
            populateRequestTable();
                   for(Order order : business.getMoc().getMoc()){
            if(order.getOrderNum() == w.getOrderNum()){
                order.setStatus("ReadyForDelivery");
                if(workQ!= null){
                populateDelivRequests(workQ.getWorkRequestList());
                }
            }
        }
 JOptionPane.showMessageDialog(null, "Request assigned successfully!", "Warning", JOptionPane.WARNING_MESSAGE);       

    }//GEN-LAST:event_btnAssignRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAssignRequest;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnCheckQueue;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JComboBox delivComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField messageText;
    private javax.swing.JTable workRequestDelivJTable;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}
