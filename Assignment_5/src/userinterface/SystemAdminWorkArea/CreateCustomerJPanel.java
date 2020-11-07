/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import static java.lang.Boolean.TRUE;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class CreateCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCustomerJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    public CreateCustomerJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem ecosystem) {
        initComponents();
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        valueLabel.setText(ecosystem.getEnterprise().getName());
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
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        updateText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IDText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createText = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pwdText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dobText = new javax.swing.JTextField();

        valueLabel.setText("jLabel2");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        jLabel1.setText("Create Customer Profile");

        updateText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        updateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTextActionPerformed(evt);
            }
        });

        addressText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addressText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Address:");

        phoneText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        phoneText.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Phone:");

        IDText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        IDText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IDText.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ID:");

        nameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nameText.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Create Date:");

        createText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createText.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btnCreate.setText("Save");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Update Date:");

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("DateOfBirth:");

        emailText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Email:");

        dobText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dobText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobText.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(18, 18, 18)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel)
                        .addContainerGap(467, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2))))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateText, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IDText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(30, 30, 30)
                                                .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(pwdText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(dobText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(60, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(createText, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateTextActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        nameText.setBorder(new LineBorder(Color.RED,0));
        phoneText.setBorder(new LineBorder(Color.RED,0));
        emailText.setBorder(new LineBorder(Color.RED,0));
        dobText.setBorder(new LineBorder(Color.RED,0));
        usernameText.setBorder(new LineBorder(Color.RED,0));
        pwdText.setBorder(new LineBorder(Color.RED,0));
        addressText.setBorder(new LineBorder(Color.RED,0));

        jLabel1.setForeground(Color.black);
        jLabel2.setForeground(Color.black);
        jLabel6.setForeground(Color.black);
        jLabel10.setForeground(Color.black);
        jLabel9.setForeground(Color.black);
        jLabel4.setForeground(Color.black);
        jLabel7.setForeground(Color.black);
        String error = "";
        if((nameText.getText().equalsIgnoreCase("")) ||
            (phoneText.getText().equalsIgnoreCase(""))||
            (emailText.getText().equalsIgnoreCase(""))||
            (dobText.getText().equalsIgnoreCase(""))||
            (usernameText.getText().equalsIgnoreCase(""))||
            (pwdText.getText().equalsIgnoreCase(""))||
            (addressText.getText().equalsIgnoreCase(""))){
            error="\nAll the fields are Mandatory!!!";
            //Highligting the unfilled blocks to RED
            if((nameText.getText().equalsIgnoreCase(""))){
                nameText.setBorder(new LineBorder(Color.RED,2));
                jLabel2.setForeground(Color.red);
            }
            if((phoneText.getText().equalsIgnoreCase(""))){
                phoneText.setBorder(new LineBorder(Color.RED,2));
                jLabel4.setForeground(Color.red);
            }
            if((emailText.getText().equalsIgnoreCase(""))){
                emailText.setBorder(new LineBorder(Color.RED,2));
                jLabel1.setForeground(Color.red);
            }
            if((usernameText.getText().equalsIgnoreCase(""))){
                usernameText.setBorder(new LineBorder(Color.RED,2));
                jLabel10.setForeground(Color.red);
            }
            if((dobText.getText().equalsIgnoreCase(""))){
                dobText.setBorder(new LineBorder(Color.RED,2));
                jLabel7.setForeground(Color.red);
            }
            if((pwdText.getText().equalsIgnoreCase(""))){
                pwdText.setBorder(new LineBorder(Color.RED,2));
                jLabel9.setForeground(Color.red);
            }
            if((addressText.getText().equalsIgnoreCase(""))){
                addressText.setBorder(new LineBorder(Color.RED,2));
                jLabel6.setForeground(Color.red);
            }

        }
        if(!error.equals("")){
            JOptionPane.showMessageDialog(null,error);
            return;
        }else{
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
                jLabel7.setForeground(Color.red);
            }
            String usernamePattern = "[0-9A-za-z]{4,}";
            Pattern userPat = Pattern.compile(usernamePattern);
            Matcher checkUser = userPat.matcher(usernameText.getText());
            boolean userMatch = checkUser.matches();
            if(!(userMatch == TRUE)){
                error+="\nUsername needs to be atleast 4 characters only-combination of characters and digits!";
                usernameText.setBorder(new LineBorder(Color.RED,2));
                jLabel6.setForeground(Color.red);
            }

            String emailRegex = "^(.+)@(.+)[.](.+)$";
            Pattern emailPattern = Pattern.compile(emailRegex);
            Matcher checkEmail = emailPattern.matcher(emailText.getText());
            boolean checkMatch = checkEmail.matches();
            if(!(checkMatch == TRUE)){
                error+="\nFor Email - Please enter valid address (Pattern username@****.****)!";
            }

            String nameRegex = "^[a-zA-Z]{1,}$";
            Pattern namePattern = Pattern.compile(nameRegex);
            Matcher checkFirstName = namePattern.matcher(nameText.getText());
            boolean checkNameMatch = checkFirstName.matches();
            if(!(checkNameMatch == TRUE)){
                error+="\nname needs to be only characters!";
            }
            String phoneRegex = "^\\d{10}$";
            Pattern phonePattern = Pattern.compile(phoneRegex);
            Matcher checkPhone = phonePattern.matcher(phoneText.getText());
            boolean checkPhoneMatch = checkPhone.matches();
            if(!(checkPhoneMatch == TRUE)){

                error="\nFor Phone number - Please enter only 10 digits!";
            }
            try{
                SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
                String dateString = dobText.getText();

                String formattedDate = fmt.format(fmt.parse(dateString));
                if (!(formattedDate.equals(dateString))) {
                    error+="\nFor Date Of Birth - Please enter in \"dd/MM/YYYY\" pattern only!";
                }
            }catch (ParseException ex) {
                error+="\nFor Date Of Birth - Please enter in \"dd/MM/YYYY\" pattern only!";
            }

        }
        if(!error.equals("")){
            JOptionPane.showMessageDialog(null,error);
        }else{
                    Employee employee = ecosystem.getEmployeeDirectory().createEmployee(nameText.getText());
                    UserAccount ua3 = ecosystem.getUserAccountDirectory().createUserAccount(usernameText.getText(),pwdText.getText(), employee, new CustomerRole());
            Customer customer = new Customer();
            customer.setAddress(addressText.getText());
            customer.setPhone(Integer.parseInt(phoneText.getText()));
            customer.setDob(dobText.getText());
            customer.setEmail(emailText.getText());
            customer.setName(nameText.getText());
            customer.setPassword(pwdText.getText());
            customer.setUsername(usernameText.getText());
            customer.setUpdateDate(new Date());
            ecosystem.getCustomerDirectory().createCustomer(customer);

            JOptionPane.showMessageDialog(null,"Customer created Successfully!!!");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDText;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCreate;
    private javax.swing.JTextField createText;
    private javax.swing.JTextField dobText;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField pwdText;
    private javax.swing.JTextField updateText;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}