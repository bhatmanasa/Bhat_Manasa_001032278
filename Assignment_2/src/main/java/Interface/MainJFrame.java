/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarRecord;
import ElasticSearch.ElasticSearchClass;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manasa
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private CarRecord carRecord;
     private final ElasticSearchClass elasticSearchClass;
    public MainJFrame() throws IOException {
        initComponents();
        this.carRecord = new CarRecord();
        updateDemoCars();
        elasticSearchClass = new ElasticSearchClass();
    }
    public void updateDemoCars(){
        /************* Customized Cars added for demo purpose**************************/
   Car demo1 = new Car("Yamaha 4x 32", "YT670PXDE234500", 2010, 5, false, "YAMAHA", "56RET456TYU789", "SEATTLE", "09/09/2020", 1);
   Car demo2 = new Car("Bolero 4x 32", "BMTC78000032500", 2020, 9, false, "BOLERO", "987809TYUIR4321", "BOSTON", "01/09/2020", 4);
   Car demo3 = new Car("BMW 3G 32", "BMW-SERIES-23456", 2009, 3, true, "BMW", "6789023456BM34", "NEWYORK", "10/09/2020", 4);
   Car demo4 = new Car("Yamaha 4x 32", "FFGDFGFDGGD3446565654", 2012, 5, true, "YAMAHA", "56RET456TYU789", "SEATTLE", "10/10/2020", 5);
   Car demo5 = new Car("SUZUKI POWER RANGER", "SZWEQRTY345672UOO", 2019, 4, true, "suzuki", "56RET456TYU789", "MAINE", "07/09/2010", 4);
   Car demo6 = new Car("APOLLO 6X DOBULE DUSTOER", "DB45RTEPOWER56", 2018, 4, false, "APPLLO", "56RET456TYU789", "BOSTON", "09/02/2020", 4);
   Car demo7 = new Car("AUDI 800x PRIME", "AD00089TYHIGH67", 2019, 6, false, "AUDI", "FDFDSFDF54865646", "SEATTLE", "01/01/2020", 6);
   Car demo8 = new Car("AUDI 4x 32", "YT670PXDE234500", 2017, 5, false, "AUDI", "56RET456FDFGFDGDFGGTYU789", "NEWYORK", "03/03/2019", 0);
   Car demo9 = new Car("WOLKWAGEN PASSAT", "WVFTR45WERDRIVE", 2016, 4, false, "PASSAT", "FDGFGFG4556", "NEW YORK", "08/01/2010", 3);
   Car demo10 = new Car("TOYOTA 4x CAMRI", "TY4567LUXSDER", 2020, 4, true, "TOYOTA", "DFGFDGDFGFD3434", "SEATTLE", "01/02/2020", 3);
   Car demo11 = new Car("TOYOTA 4x 32", "FDGFDGGGDFGG", 2020, 7, true, "TOYOTA", "56RET456TYU789", "BOSTON", "09/08/2020", 5);
   Car demo12 = new Car("BMW 5SERIES", "BM4234325235TGFGDFG", 2017, 4, true, "BMW", "FDFFFF454543", "SEATTLE", "01/02/2020", 4);
   Car demo13 = new Car("BMW 5SERIES 4x 32", "YT670PXDE234500", 2016, 5, false, "BMW", "56RET456TYU789", "NEW YORK", "01/01/2019", 0);
   Car demo14 = new Car("DUSTER 4x 32", "FERRGEREGERG", 2016, 4, false, "DUSTER", "GFGFDG45435", "CALIFORNIA", "09/10/2020", 0);
   Car demo15 = new Car("RENAULT 4x 32", "YT670PXDE234500", 2010, 3, false, "RENAULT", "GRGG65646456", "SEATTLE", "09/01/2019", 0);
   Car demo16 = new Car("AUDI 62SERIES", "5TRTRETERTRE45", 2013, 4, true, "AUDI", "GHHHGHGF56456546", "MAINE", "01/09/2010", 0);
   Car demo17 = new Car("HONDA 5132 SERIES", "GHGHG5454GDFBDF", 2014, 5, false, "HONDA", "HRTHGRHR567567567", "BOSTON", "12/09/2019", 2);
   Car demo18 = new Car("BMW FREE SEIRES", "FDGFDGG4545", 2015, 8, true, "BMW", "HTHRTGHFGH36", "SEATTLE", "18/01/2019", 4);
   Car demo19 = new Car("HONDA EXCLUSIVE", "VNNFGGHGH566", 2016, 6, false, "HONDA", "DFDSFEREW3224", "NEW YORK", "01/09/2009", 0);
   Car demo20 = new Car("SUZUKI 5X POWER", "HFGHGFHGFHGH45645Y", 2017, 2, false, "SUZUKI", "JTYJTU867867999", "SEATTLE", "09/09/2020", 0);
   Car demo21 = new Car("Yamaha 4x 32", "HGDHGHGHET565", 2018, 4, true, "YAMAHA", "HTRHHDT4535", "CALIFORNIA", "09/09/2020", 2);
   Car demo22 = new Car("VOLKWAGEN HERE SHOW", "GHGHGHERERYEY", 2019, 5, true, "PASSAT", "GGFGER5435", "MAINE", "10/10/2018", 3);
   Car demo23 = new Car("CRV-5SERIES", "GFFGHDGHGFGTRYRTY", 2010, 6, false, "CRV", "56RET456TYU789", "SEATTLE", "07/09/2020", 0);
   Car demo24 = new Car("APPLO 3452 POWER", "FGHGFHFGHFGTYTRY5667", 2020, 3, false, "APPOLO", "56RET456TYU789", "NEW YORK", "06/09/2019", 0);
   Car demo25 = new Car("Yamaha 4x 32", "YT670PX56564TGDFDE234500", 2010, 2, true, "YAMAHA", "GDFGFFS4323RRR", "SEATTLE", "09/09/2020", 2);
   Car demo26 = new Car("Yamaha 4x 32", "YT670PXDE234500", 2010, 1, false, "YAMAHA", "56RET456TYU789", "BOSTON", "09/09/2020", 1);
carRecord.updateCar(demo1);
carRecord.updateCar(demo2);
carRecord.updateCar(demo3);
carRecord.updateCar(demo4);
carRecord.updateCar(demo5);
carRecord.updateCar(demo6);
carRecord.updateCar(demo7);
carRecord.updateCar(demo8);
carRecord.updateCar(demo9);
carRecord.updateCar(demo10);
carRecord.updateCar(demo12);
carRecord.updateCar(demo11);
carRecord.updateCar(demo13);
carRecord.updateCar(demo14);
carRecord.updateCar(demo15);
carRecord.updateCar(demo16);
carRecord.updateCar(demo17);
carRecord.updateCar(demo18);
carRecord.updateCar(demo19);
carRecord.updateCar(demo20);
carRecord.updateCar(demo21);
carRecord.updateCar(demo22);
carRecord.updateCar(demo23);
carRecord.updateCar(demo24);
carRecord.updateCar(demo25);
carRecord.updateCar(demo26);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topSplitPane = new javax.swing.JPanel();
        lblCreateAccount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtAdmin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCustomer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topSplitPane.setBackground(new java.awt.Color(0, 0, 102));

        lblCreateAccount.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        lblCreateAccount.setForeground(new java.awt.Color(204, 204, 255));
        lblCreateAccount.setText("WELCOME TO YOUR UBER!");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 153)));

        txtAdmin.setBackground(new java.awt.Color(0, 0, 102));
        txtAdmin.setForeground(new java.awt.Color(255, 255, 255));
        txtAdmin.setText("ADMIN");
        txtAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 153)));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        txtCustomer.setBackground(new java.awt.Color(0, 0, 102));
        txtCustomer.setForeground(new java.awt.Color(255, 255, 255));
        txtCustomer.setText("CUSTOMER");
        txtCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(txtCustomer)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtCustomer)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Lets Get Going ......!!!!!");

        javax.swing.GroupLayout topSplitPaneLayout = new javax.swing.GroupLayout(topSplitPane);
        topSplitPane.setLayout(topSplitPaneLayout);
        topSplitPaneLayout.setHorizontalGroup(
            topSplitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topSplitPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(topSplitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topSplitPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(lblCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(topSplitPaneLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topSplitPaneLayout.setVerticalGroup(
            topSplitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topSplitPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topSplitPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topSplitPaneLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(topSplitPaneLayout.createSequentialGroup()
                        .addComponent(lblCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topSplitPaneLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jSplitPane1.setTopComponent(topSplitPane);

        userProcessContainer.setBackground(new java.awt.Color(0, 0, 153));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminActionPerformed
        // TODO add your handling code here:
          AdminJPanel panel = new AdminJPanel(userProcessContainer,carRecord,"admin",elasticSearchClass);
        userProcessContainer.add("AdminJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_txtAdminActionPerformed

    private void txtCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerActionPerformed
        // TODO add your handling code here:
        CarCustomerJPanel custPanel = new CarCustomerJPanel(userProcessContainer,carRecord,"cust",elasticSearchClass);
        userProcessContainer.add("CustomerJPanel",custPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_txtCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JPanel topSplitPane;
    private javax.swing.JButton txtAdmin;
    private javax.swing.JButton txtCustomer;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
