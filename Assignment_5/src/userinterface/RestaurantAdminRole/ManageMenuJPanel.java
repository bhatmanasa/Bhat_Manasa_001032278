/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.lang.Boolean.TRUE;
import java.util.Enumeration;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author manasa
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuJPanel
     */

    DefaultTreeModel model;
    DefaultMutableTreeNode node;
    DefaultMutableTreeNode mainnode;
    DefaultMutableTreeNode selectedNode1 = null;
    DefaultMutableTreeNode selectedNode0 = null;
    DefaultMutableTreeNode selectedNode2 = null;
        DefaultMutableTreeNode prevselectedNode1 = null;
    DefaultMutableTreeNode prevselectedNode0 = null;
    DefaultMutableTreeNode prevselectedNode2 = null;
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private boolean activeAdd;

    /** Creates new form AdminWorkAreaJPanel */
    public ManageMenuJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = account;
        menuTree();
        btnSave.setEnabled(false);
        btnBack.setEnabled(true);
        activeAdd = false;
  
    }
     public void menuTree(){
      node = business.getRestaurantDirectory().getMenunode();
     model = new DefaultTreeModel(node);
      tree.setModel(model);
      String name = business.getRestaurantDirectory().getName(userAccount.getEmployee().getId());
      try{
              if(!(String.valueOf(model.getChild(model.getRoot(), 0)).equals(name))){ 
                         selectedNode0 = (DefaultMutableTreeNode)model.getChild(model.getRoot(), 0);  
            }
             if(!(String.valueOf(model.getChild(model.getRoot(), 1)).equals(name))){ 
                        selectedNode1 = (DefaultMutableTreeNode)model.getChild(model.getRoot(), 1);  
        
             }
             if(!(String.valueOf(model.getChild(model.getRoot(), 2)).equals(name))){ 
                        selectedNode2 = (DefaultMutableTreeNode)model.getChild(model.getRoot(), 2);  
          
             }
            try{ 
             if(selectedNode1!= null){
               node.remove(selectedNode1);
               prevselectedNode1 = selectedNode1;
             }
            if(selectedNode2!= null){
               node.remove(selectedNode2);
               prevselectedNode2 = selectedNode2;
             }
               if(selectedNode0!= null){
               node.remove(selectedNode0);
               prevselectedNode0 = selectedNode0;
             }
               model.reload(node);
            }catch(IllegalArgumentException e){
                model.reload(node);
            }
          
      }catch(ArrayIndexOutOfBoundsException e){
          
            if(prevselectedNode0!=null){
            node.remove(prevselectedNode0);
            }
            if(prevselectedNode1!=null){
            node.remove(prevselectedNode1);
            }
            if(prevselectedNode2!=null){

            node.remove(prevselectedNode2);
            }
            model.reload(node);
      }
      
            

         
     }
     public void reloadmenuTree(DefaultMutableTreeNode changedNode){
     
     mainnode = new DefaultMutableTreeNode("Restaurant");
     if(changedNode.toString().equals("Restaurant")){
                 System.out.println("nextnode="+changedNode.getNextNode());
        System.out.println("nextchild="+changedNode.getFirstChild());
        changedNode = (DefaultMutableTreeNode)changedNode.getNextNode();
        mainnode.add(changedNode);
     }else{
           mainnode.add(changedNode);
     }
             if(selectedNode1!= null){
                           mainnode.add(selectedNode1);

             }else{
                 if(prevselectedNode1!= null){
                 mainnode.add(prevselectedNode1);
                 }
             }
            if(selectedNode2!= null){
                            mainnode.add(selectedNode2);

             }else{
                                 if(prevselectedNode2!= null){
                  mainnode.add(prevselectedNode2);
                                 }
            }
               if(selectedNode0!= null){
                           mainnode.add(selectedNode0);

               }else{
                                    if(prevselectedNode0!= null){
                     mainnode.add(prevselectedNode0);
                                    }
               }
      business.getRestaurantDirectory().setMenuNode(mainnode);
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
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        sizeText = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        foodText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        btnAdd.setText("Add Item");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove Item");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter FoodName,Size and Price to Add Item");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select from the left menu to Remove Item");

        jLabel3.setText("Food Name:");

        jLabel4.setText("Size:");

        jLabel5.setText("Price:");

        jLabel6.setText("MANAGE MENU");

        btnSave.setText("Save Changes");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(48, 48, 48)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(foodText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(btnRemove))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addGap(34, 34, 34)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        tree.setBackground(new java.awt.Color(153, 0, 51));
        tree.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tree.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(tree);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void treeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeValueChanged

    }//GEN-LAST:event_treeValueChanged

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        

         DefaultMutableTreeNode selectedNode;
        selectedNode = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
        if(selectedNode == null){
                          JOptionPane.showMessageDialog(null, "Please select in tree the item to be removed!!", "Warning", JOptionPane.WARNING_MESSAGE);       
                          return;                
        }
        DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) selectedNode.getRoot();
        if(rootNode.toString().equals(selectedNode.toString())){
           JOptionPane.showMessageDialog(null, "Main Restaurant cannot be removed!!\nPlease select only the food items to be removed", "Warning", JOptionPane.WARNING_MESSAGE);           
              return;
        }
                          String nameRest = business.getRestaurantDirectory().getName(userAccount.getEmployee().getId());
        if(selectedNode.toString().equals(nameRest)){
           JOptionPane.showMessageDialog(null, "Main Restaurant cannot be removed!!\nPlease select only the food items to be removed", "Warning", JOptionPane.WARNING_MESSAGE);           
              return;
        }   
       int nodeParentSize =  selectedNode.getPreviousNode().getChildCount();
       if(nodeParentSize == 1){
           JOptionPane.showMessageDialog(null, "Only one size in selected item!\n Please select and remove the item itself!", "Warning", JOptionPane.WARNING_MESSAGE);           
              return;
        }
               btnBack.setEnabled(false);
        btnSave.setEnabled(true);
        if(selectedNode != null){
            DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) selectedNode.getParent();
            parentNode.remove(selectedNode);
            
            model.reload(parentNode);
        String name = business.getRestaurantDirectory().getName(userAccount.getEmployee().getId());
        for(Restaurant r: business.getRestaurantDirectory().getRestaurantList()){
           if(r.getName().equalsIgnoreCase(name)){
                Map menuMap = r.getMenuMap();
                 Double price = Double.parseDouble(priceText.getText());
                menuMap.remove(foodText.getText()+sizeText.getText());
                r.setMenuMap(menuMap);
           }
        }
        }
        foodText.setText("");
        sizeText.setText("");
        priceText.setText("");
        activeAdd = true;
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(foodText.getText().equals("") || sizeText.getText().equals("") || priceText.getText().equals("")){
                         JOptionPane.showMessageDialog(null, "Food, Size and Price are Mandatory for adding items!!", "Warning", JOptionPane.WARNING_MESSAGE);       
                          return;
        }
            String priceRegex ="[0-9]+\\.[0-9]{2,}";
            Pattern namePattern = Pattern.compile(priceRegex);
            Matcher checkFirstName = namePattern.matcher(priceText.getText());
            boolean checkNameMatch = checkFirstName.matches();
            if(!(checkNameMatch == TRUE)){
                JOptionPane.showMessageDialog(null, "Please enter Price in decimal format only!!\n(mininmum 2 digits after decimal)", "Warning", JOptionPane.WARNING_MESSAGE);       
                          return;
            }
        model = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode selectedNode;
        selectedNode = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
        if(selectedNode == null){
                          JOptionPane.showMessageDialog(null, "Please select in tree!!", "Warning", JOptionPane.WARNING_MESSAGE);       
                          return;                
        }
         String name = business.getRestaurantDirectory().getName(userAccount.getEmployee().getId());
        for(Restaurant r: business.getRestaurantDirectory().getRestaurantList()){
           if(r.getName().equalsIgnoreCase(name)){
                if(r.getMenuMap().containsKey(foodText.getText()+sizeText.getText())){
                    Map menuMap =r.getMenuMap();
                   menuMap.put(foodText.getText()+sizeText.getText(), Double.parseDouble(priceText.getText()));
                   r.setMenuMap(menuMap);
             JOptionPane.showMessageDialog(null, "Item already in Menu, Updated the Price!!", "Warning", JOptionPane.WARNING_MESSAGE);       
                          return;                  
                }

           }
        }
        
        btnBack.setEnabled(false);
        btnSave.setEnabled(true);
        activeAdd = true;
         DefaultMutableTreeNode selectedNodenew = (DefaultMutableTreeNode) selectedNode.getRoot();
                    Enumeration<DefaultMutableTreeNode> enumerate = selectedNodenew.depthFirstEnumeration();
                          String nameRest = business.getRestaurantDirectory().getName(userAccount.getEmployee().getId());
    while (enumerate.hasMoreElements()) {
        DefaultMutableTreeNode nodeCheck = enumerate.nextElement();
        if (nodeCheck.toString().equalsIgnoreCase(nameRest)) {
           selectedNode =nodeCheck;
        }
    }

        //Checking if food already exists!
        
        boolean alreadyPresent = false;
            Enumeration<DefaultMutableTreeNode> e = selectedNodenew.depthFirstEnumeration();
    while (e.hasMoreElements()) {
        DefaultMutableTreeNode nodetest = e.nextElement();
        if (nodetest.toString().equalsIgnoreCase(foodText.getText())) {
           selectedNode =nodetest;
           alreadyPresent = true;
        }
    }
            if(selectedNode != null){
     if(alreadyPresent == true){
            DefaultMutableTreeNode sub1 = new DefaultMutableTreeNode(new DefaultMutableTreeNode(sizeText.getText()));
            selectedNode.insert(sub1, selectedNode.getIndex(selectedNode.getLastChild()));
            model.reload(selectedNode);
     }else{

            DefaultMutableTreeNode root = new DefaultMutableTreeNode(foodText.getText());
            DefaultMutableTreeNode sub1 = new DefaultMutableTreeNode(new DefaultMutableTreeNode(sizeText.getText()));
            root.add(new DefaultMutableTreeNode(sizeText.getText()));
            selectedNode.insert(root, selectedNode.getIndex(selectedNode.getLastChild()));
            model.reload(selectedNode);
        }
     }
        
        for(Restaurant r: business.getRestaurantDirectory().getRestaurantList()){
           if(r.getName().equalsIgnoreCase(name)){
                Map menuMap = r.getMenuMap();
                 Double price = Double.parseDouble(priceText.getText());
                menuMap.put(foodText.getText()+sizeText.getText(), price);
                r.setMenuMap(menuMap);
           }
        }
        
        foodText.setText("");
        sizeText.setText("");
        priceText.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(activeAdd){
        DefaultMutableTreeNode selectedNode;
         selectedNode = (DefaultMutableTreeNode)model.getChild(model.getRoot(), 0);   
        reloadmenuTree(selectedNode);
        btnBack.setEnabled(true);
        activeAdd = false;
        menuTree();
      JOptionPane.showMessageDialog(null, "Menu updated successfully!!", "Warning", JOptionPane.WARNING_MESSAGE);        
        }else{
         JOptionPane.showMessageDialog(null, "No new updates to save!!", "Warning", JOptionPane.WARNING_MESSAGE);                 
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      if(activeAdd){
            JOptionPane.showMessageDialog(null, "There are active updates not saved! \nPlease save before exiting this page!!", "Warning", JOptionPane.WARNING_MESSAGE);                 
            btnBack.setEnabled(false);
            btnSave.setEnabled(true);
            return;       
      }
      reloadmenuTree(node);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField foodText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField priceText;
    private javax.swing.JTextField sizeText;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables
}
