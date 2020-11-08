/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.Component;
import static java.lang.Boolean.TRUE;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
/**
 *
 * @author manasa
 */
public class CreateEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateEmployeeJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private Restaurant restaurant;
    private boolean delivCheck = false;
    public CreateEmployeeJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem ecosystem,Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.restaurant = restaurant;
        valueLabel.setText(ecosystem.getEnterprise().getName());
    }
    public CreateEmployeeJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem ecosystem,boolean deliv) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.delivCheck = deliv;
        valueLabel.setText(ecosystem.getEnterprise().getName());
        if(delivCheck == true){
            delivButton.setSelected(true);
            sysAdminBtn.setSelected(false);
            sysAdminBtn.setEnabled(false);
            restAdminBtn.setSelected(false);
            restAdminBtn.setEnabled(false);
            staffButton.setSelected(false);
            staffButton.setEnabled(false);
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
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        pwdText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        staffButton = new javax.swing.JRadioButton();
        delivButton = new javax.swing.JRadioButton();
        restAdminBtn = new javax.swing.JRadioButton();
        sysAdminBtn = new javax.swing.JRadioButton();
        valueLabel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Create Employee Profile");

        nameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nameText.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name:");

        btnSave.setText("Create Employee");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        pwdText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pwdText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pwdText.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Password:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("UserName:");

        usernameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usernameText.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Role:");

        staffButton.setText("Staff");
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });

        delivButton.setText("DeliveryMan");
        delivButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delivButtonActionPerformed(evt);
            }
        });

        restAdminBtn.setText("RestaurantAdmin");
        restAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restAdminBtnActionPerformed(evt);
            }
        });

        sysAdminBtn.setText("SystemAdmin");
        sysAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysAdminBtnActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sysAdminBtn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delivButton)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(staffButton))
                                    .addComponent(restAdminBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(pwdText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297)))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton)
                    .addComponent(valueLabel))
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(staffButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delivButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(restAdminBtn)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(sysAdminBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        nameText.setBorder(new LineBorder(Color.RED,0));
        usernameText.setBorder(new LineBorder(Color.RED,0));
        pwdText.setBorder(new LineBorder(Color.RED,0));

        jLabel12.setForeground(Color.black);
        jLabel2.setForeground(Color.black);
        jLabel10.setForeground(Color.black);
        jLabel9.setForeground(Color.black);

        String error = "";
       if(nameText.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Name is mandatory!");
            return;           
       }
       if((!delivButton.isSelected()) && (!staffButton.isSelected()) && (!sysAdminBtn.isSelected()) &&(!restAdminBtn.isSelected())){
                      JOptionPane.showMessageDialog(null,"Please select the role for new employee!");
            return;   
       }
       
       if(!staffButton.isSelected()){
           if(usernameText.getText().equals("") || pwdText.getText().equals("")){
                      JOptionPane.showMessageDialog(null,"UserName and password is mandatory for all employees other than Staffs!");
            return;                 
           }
       
                for(UserAccount user: ecosystem.getUserAccountDirectory().getUserAccountList()){
                    if(user.getUsername().equals(usernameText.getText())){
                        JOptionPane.showMessageDialog(null,"UserName already exists!!!");
                        return;
                    }
                }
            
            String pwdRegex = "(.+{4,})";
            Pattern pwdPattern = Pattern.compile(pwdRegex);
            Matcher pwdCheck = pwdPattern.matcher(pwdText.getText());
            boolean checkPwd = pwdCheck.matches();
            if(!(checkPwd == TRUE)){
                error+="\nPassword needs to be atleast 4 characters\n";
                pwdText.setBorder(new LineBorder(Color.RED,2));
                jLabel9.setForeground(Color.red);
            }
            String usernamePattern = "[0-9A-za-z]{4,}";
            Pattern userPat = Pattern.compile(usernamePattern);
            Matcher checkUser = userPat.matcher(usernameText.getText());
            boolean userMatch = checkUser.matches();
            if(!(userMatch == TRUE)){
                error+="\nUsername needs to be atleast 4 characters only-combination of characters and digits!";
                usernameText.setBorder(new LineBorder(Color.RED,2));
                jLabel10.setForeground(Color.red);
            }
       }

            String nameRegex = "^[a-zA-Z]{1,}$";
            Pattern namePattern = Pattern.compile(nameRegex);
            Matcher checkFirstName = namePattern.matcher(nameText.getText());
            boolean checkNameMatch = checkFirstName.matches();
            if(!(checkNameMatch == TRUE)){
                error+="\nname needs to be only characters!";
            }

        
        if(!error.equals("")){
            JOptionPane.showMessageDialog(null,error);
        }else{
            if(staffButton.isSelected()){
               Employee newEmp = ecosystem.getEmployeeDirectory().createEmployee(nameText.getText());
               JOptionPane.showMessageDialog(null,"Employee Created Successfully!!!");
               return;
            }
            if(delivButton.isSelected()){
                Employee newEmp = ecosystem.getEmployeeDirectory().createEmployee(nameText.getText());
                UserAccount ua2 = ecosystem.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwdText.getText(), newEmp, new DeliverManRole());
                          JOptionPane.showMessageDialog(null,"Employee Created Successfully!!!");
               return;
            }
            if(sysAdminBtn.isSelected()){
                             Employee newEmp = ecosystem.getEmployeeDirectory().createEmployee(nameText.getText());
    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwdText.getText(), newEmp, new SystemAdminRole());
                          JOptionPane.showMessageDialog(null,"Employee Created Successfully!!!");
               return;   
            }
            if(restAdminBtn.isSelected()){
                if(restaurant.getManagerID() > 0){
                    String name = "";
                    for(Employee e : ecosystem.getEmployeeDirectory().getEmployeeList()){
                        if(e.getId() == restaurant.getManagerID()){
                          name = e.getName();
                        }
                    }
               // JOptionPane.showMessageDialog(null,"This restaurant already has a manager !\n"+restaurant.getManagerID()+":"+name);
                 int confirmed = JOptionPane.showConfirmDialog(null, "This restaurant already has a manager !\n"+restaurant.getManagerID()+":"+name+"\nAre you Sure you want to delete the employee record?","Confirm Delete",JOptionPane.YES_NO_OPTION);
            if(confirmed == JOptionPane.YES_OPTION){
                int oldmanager = restaurant.getManagerID();
                String oldName = "";
                for(UserAccount ua : ecosystem.getUserAccountDirectory().getUserAccountList()){
                    if(ua.getEmployee().getId() == oldmanager){
                         oldName = ua.getUsername();
                    }
                }
                ecosystem.getUserAccountDirectory().removeUserAccount(oldName);
                 Employee newEmp = ecosystem.getEmployeeDirectory().createEmployee(nameText.getText());
                 UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(usernameText.getText(), pwdText.getText(), newEmp, new AdminRole());
                          JOptionPane.showMessageDialog(null,"Employee Created Successfully!!!");
                          restaurant.setManagerID(newEmp.getId());
               return;  
                }
                }
 
            }


        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffButtonActionPerformed
        // TODO add your handling code here:
        delivButton.setSelected(false);
        restAdminBtn.setSelected(false);
        sysAdminBtn.setSelected(false);
    }//GEN-LAST:event_staffButtonActionPerformed

    private void delivButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delivButtonActionPerformed
        // TODO add your handling code here:
                staffButton.setSelected(false);
        restAdminBtn.setSelected(false);
        sysAdminBtn.setSelected(false);
    }//GEN-LAST:event_delivButtonActionPerformed

    private void restAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restAdminBtnActionPerformed
        // TODO add your handling code here:
                delivButton.setSelected(false);
        staffButton.setSelected(false);
        sysAdminBtn.setSelected(false);
    }//GEN-LAST:event_restAdminBtnActionPerformed

    private void sysAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysAdminBtnActionPerformed
        // TODO add your handling code here:
                        delivButton.setSelected(false);
        staffButton.setSelected(false);
        restAdminBtn.setSelected(false);
    }//GEN-LAST:event_sysAdminBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
                userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRestaurantJPanel dwjp = (ManageRestaurantJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSave;
    private javax.swing.JRadioButton delivButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField pwdText;
    private javax.swing.JRadioButton restAdminBtn;
    private javax.swing.JRadioButton staffButton;
    private javax.swing.JRadioButton sysAdminBtn;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
